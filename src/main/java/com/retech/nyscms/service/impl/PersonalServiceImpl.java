package com.retech.nyscms.service.impl;

import com.retech.nyscms.aspect.LogType;
import com.retech.nyscms.entity.*;
import com.retech.nyscms.entity.custom.*;
import com.retech.nyscms.job.SendSysMsgJob;
import com.retech.nyscms.mapper.*;
import com.retech.nyscms.mapper.custom.ClassesManageCustomMapper;
import com.retech.nyscms.mapper.custom.DatalibrarysManageCustomMapper;
import com.retech.nyscms.mapper.custom.MetadatasManageCustomMapper;
import com.retech.nyscms.mapper.custom.SqlCustomMapper;
import com.retech.nyscms.service.PersonalService;
import com.retech.nyscms.utils.*;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.jms.Destination;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
@Service
public class PersonalServiceImpl implements PersonalService {

    @Value("${fdfs.web-server-url}")
    private String fileserverurl;

    public static String JOB_GROUP_NAME = "NYS_JOB_GROUP";

    public static String TRIGGER_GROUP_NAME = "NYS_TRIGGER_GROUP";

    @Autowired
    private FastDFSClient fastDFSClient;

    @Autowired
    private MetadatasManageCustomMapper metadatasCustomMapper;

    @Autowired
    private DatalibrarysManageCustomMapper datalibrarysCustomMapper;

    @Autowired
    private BaseDicsMapper dicsMapper;

    @Autowired
    private DbLibrarynexusMapper librarynexusMapper;

    @Autowired
    private ClassesManageCustomMapper classesCustomMapper;

    @Autowired
    private BaseLogsMapper logsMapper;

    @Autowired
    private BaseMenusMapper menusMapper;

    @Autowired
    private FrontUserLoginDayMapper userLoginDayMapper;

    @Autowired
    private FrontEbookMapper ebookMapper;

    @Autowired
    private FrontFullminustypeMapper frontFullminustypeMapper;

    @Autowired
    private FrontThematicMapper thematicMapper;

    @Autowired
    private FrontUserInfoMapper userInfoMapper;

    @Autowired
    private FrontUserGrantbatchMapper userGrantbatchMapper;

    @Autowired
    private FrontUserBooksOwnedMapper userBooksOwnedMapper;

    @Autowired
    private FrontSysmessageMapper sysmessageMapper;

    @Autowired
    private FrontUserSysmessageMapper userSysmessageMapper;

    @Autowired
    private FrontFeedBackMapper feedBackMapper;

    @Autowired
    private FrontAccountMapper accountMapper;

    @Autowired
    private FrontIncomeInfoMapper incomeInfoMapper;

    @Autowired
    private SqlCustomMapper sqlCustomMapper;

    @Autowired
    private FrontReadHistoryMapper readHistoryMapper;

    @Autowired
    private FrontReadLogMapper readLogMapper;

    @Autowired
    private BaseSeriesMapper seriesMapper;

    @Autowired
    private BaseClassesMapper classesMapper;

    @Autowired
    private FrontUserBindMapper userBindMapper;

    @Autowired
    private CountryMapper countryMapper;

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private FrontBookQrcodeMapper bookQrcodeMapper;

    @Override
    public ActionResult uploadFile(MultipartFile file) {
        try {
            String url = fastDFSClient.uploadFile(file);
            return ActionResult.ok(url);
        } catch (Exception e) {
            return ActionResult.build(-1, "文件上传失败！");
        }
    }

    @Override
    public HashMap<String, Object> uploadkindeditor(MultipartFile file) {
        HashMap<String, Object> result = new HashMap<>();
        try {
            String url = fastDFSClient.uploadFile(file);
            result.put("error", 0);
            result.put("url", fileserverurl + url);
        } catch (Exception e) {
            result.put("error", 1);
            result.put("message", "上传失败！");
        }
        return result;
    }

    @Override
    public ActionResult importFile(MultipartFile file, DataLibrarysManageSearchBean searchBean, HttpServletRequest request) {
        String filePath = request.getSession().getServletContext().getRealPath("/upload");
        String fileName = file.getOriginalFilename();
        String databaseName = searchBean.getDatabaseName();
        String mouldId = searchBean.getMouldId();
        BaseManagers loginUser = (BaseManagers) request.getSession().getAttribute("USER_VALUE_OBJECT");
        // 生成上传的文件对象
        File target = new File(filePath, fileName);
        if (target.exists()) {
            target.delete();
        }
        int savetotal = 0;
        int rows;
        int nums = 0;
        FileInputStream fis;
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(), target);
            CustomQueryBean creatoruser = new CustomQueryBean();
            creatoruser.setName("creatorid");
            creatoruser.setNameValue(loginUser.getUserid().toString());

            CustomQueryBean status = new CustomQueryBean();
            status.setName("status");
            status.setNameValue("1");

            fis = new FileInputStream(filePath + "\\" + fileName);
            XSSFWorkbook wookbook = new XSSFWorkbook(fis); // 创建对Excel工作簿文件的引用
            XSSFSheet sheet = wookbook.getSheetAt(0); // 在Excel文档中，第一张工作表的缺省索引是0
            rows = sheet.getPhysicalNumberOfRows(); // 获取到Excel文件中的所有行数­
            Map<Integer, String> keys = new HashMap<>();
            int cells = 0;
            // 遍历行­（第1行 表头） 准备Map里的key
            XSSFRow firstRow = sheet.getRow(0);
            if (firstRow != null) {
                // 获取到Excel文件中的所有的列
                cells = firstRow.getPhysicalNumberOfCells();
                // 遍历列
                for (int j = 0; j < cells; j++) {
                    // 获取到列的值­
                    try {
                        XSSFCell cell = firstRow.getCell(j);
                        String cellValue = getCellValue(cell);
                        if (cellValue != null && cellValue.split("###").length == 2) {
                            cellValue = cellValue.split("###")[1];
                        }
                        keys.put(j, cellValue);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            // 遍历行­（从第二行开始）
            for (int i = 1; i < rows; i++) {
                List<CustomQueryBean> returnlist = new ArrayList<>();
                // 保存用户信息
                returnlist.add(creatoruser);
                returnlist.add(status);
                // 读取左上端单元格(从第二行开始)
                XSSFRow row = sheet.getRow(i);
                // 行不为空
                if (row != null) {
                    // 遍历列
                    for (int j = 0; j < cells; j++) {
                        CustomQueryBean bean = new CustomQueryBean();
                        // 获取到列的值­
                        try {
                            XSSFCell cell = row.getCell(j);
                            String cellValue = getCellValue(cell);
                            if (cellValue != null && cellValue.trim().length() > 0) {
                                bean.setName(keys.get(j));
                                bean.setNameValue(cellValue);
                                returnlist.add(bean);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    // 一行所有的列数据读取完毕
                    // 入库
                    boolean b = addExcelData(databaseName, mouldId, returnlist);
                    if (b) {
                        savetotal++;
                    }
                }
                if (returnlist.size() > 2) {
                    nums++;
                }
            }
            // 所有的行读完

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ActionResult.ok("成功保存" + savetotal + "/" + nums + "条数据");
    }

    private static String getCellValue(XSSFCell cell) {
        DecimalFormat df = new DecimalFormat("#");
        String cellValue = null;
        if (cell == null)
            return null;
        switch (cell.getCellType()) {
            case XSSFCell.CELL_TYPE_NUMERIC:
                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    cellValue = sdf.format(HSSFDateUtil.getJavaDate(cell.getNumericCellValue()));
                    break;
                }
                cellValue = df.format(cell.getNumericCellValue());
                break;
            case XSSFCell.CELL_TYPE_STRING:
                cellValue = String.valueOf(cell.getStringCellValue());
                break;
            case XSSFCell.CELL_TYPE_FORMULA:
                cellValue = String.valueOf(cell.getCellFormula());
                break;
            case XSSFCell.CELL_TYPE_BLANK:
                cellValue = null;
                break;
            case XSSFCell.CELL_TYPE_BOOLEAN:
                cellValue = String.valueOf(cell.getBooleanCellValue());
                break;
            case XSSFCell.CELL_TYPE_ERROR:
                cellValue = String.valueOf(cell.getErrorCellValue());
                break;
        }
        if (cellValue != null && cellValue.trim().length() <= 0) {
            cellValue = null;
        }
        return cellValue;
    }


    private boolean addExcelData(String databaseName, String mouldId, List<CustomQueryBean> queryList) {
        StringBuffer nameSql = new StringBuffer();
        StringBuffer valueSql = new StringBuffer();
        List<MetadatasCustomBean> list = metadatasCustomMapper.selectByExample(mouldId);
        if (queryList.size() > 2) {
            for (CustomQueryBean customQueryBean : queryList) {
                String namevalue = customQueryBean.getNameValue();
                if (customQueryBean != null && (customQueryBean.getName() != null)
                        && !customQueryBean.getName().equals("undefined") && customQueryBean.getNameValue() != null
                        && !customQueryBean.getNameValue().equals("undefined")) {
                    if (list != null) {
                        for (MetadatasCustomBean metadatasCustomBean : list) {
                            if (metadatasCustomBean.getColumnname().equals(customQueryBean.getName())) {
                                if (metadatasCustomBean.getColumntype().equals(3) || metadatasCustomBean.getColumntype().equals(4)) {
                                    if (metadatasCustomBean.getColumnsource().equals(1)) {
                                        String[] split = customQueryBean.getNameValue().split("-");
                                        namevalue = split[0];
                                    }
                                }
                            }
                        }
                    }
                    nameSql.append(customQueryBean.getName()).append(",");
                    valueSql.append("'").append(namevalue).append("',");
                }
            }
        }
        String nameSqlStr = nameSql.substring(0, nameSql.length() - 1);
        String valueSqlStr = valueSql.substring(0, valueSql.length() - 1);
        String sql = "insert into " + databaseName + " (" + nameSqlStr + ") values(" + valueSqlStr + ")";
        int inRes = datalibrarysCustomMapper.alterTable(sql);
        return inRes > 0;
    }

    @Override
    public void exportModelExcel(List<DbMetadatas> metadataList, HttpServletResponse response,
                                 HttpServletRequest request, String databasecname, String type, String databaseName, String mouldId) {
        try {
            OutputStream ouputStream = response.getOutputStream();

            // 动态列获取
            String colNames = "";
            //下拉框数据
            List<String[]> downData = new ArrayList<>();
            List<Integer> downRows = new ArrayList<>();
            List<Integer> datetimelist = new ArrayList<>();
            boolean b = false;
            for (int i = 0; i < metadataList.size(); i++) {
                if (b) {
                    colNames += ",";
                }
                colNames += metadataList.get(i).getColumncname() + "###" + metadataList.get(i).getColumnname();
                b = true;
                if (metadataList.get(i).getColumntype() == 3) {//下拉单选
                    if (metadataList.get(i).getColumnsource() == 1) {//字典表
                        BaseDicsExample example = new BaseDicsExample();
                        example.createCriteria().andDictypeEqualTo(metadataList.get(i).getColumntyperule()).andIsdictypeEqualTo(0);
                        List<BaseDics> dics = dicsMapper.selectByExample(example);
                        List<String> diclist = new ArrayList<>();
                        for (BaseDics baseDics : dics) {
                            diclist.add(baseDics.getDicvalue() + "-" + baseDics.getDicname());
                        }
                        String[] arr = new String[diclist.size()];
                        downData.add(diclist.toArray(arr));
                        downRows.add(i);
                    } else if (metadataList.get(i).getColumnsource() == 3) {//资源表
                        DbLibrarynexusExample example = new DbLibrarynexusExample();
                        example.createCriteria().andMdbfieldEqualTo(metadataList.get(i).getColumnname()).andMdbnameEqualTo(databaseName);
                        List<DbLibrarynexus> list = librarynexusMapper.selectByExample(example);
                        String sdbsql = list.get(0).getSdbsql();
                        List<LinkedHashMap<String, Object>> maplist = datalibrarysCustomMapper.getResList(sdbsql);
                        List<String> reslist = new ArrayList<>();
                        List<Object> str = new ArrayList<>();
                        for (LinkedHashMap<String, Object> linkedHashMap : maplist) {
                            Set<Entry<String, Object>> set = linkedHashMap.entrySet();
                            for (Entry<String, Object> entry : set) {
                                str.add(entry.getValue());
                            }
                        }
                        for (int j = 0; j < str.size() - 1; j += 2) {
                            reslist.add(str.get(j) + "-" + str.get(j + 1));
                        }
                        String[] arr = new String[list.size()];
                        downData.add(reslist.toArray(arr));
                        downRows.add(i);
                    }
                } else if (metadataList.get(i).getColumntype() == 10 || metadataList.get(i).getColumntype() == 11) {//日期时间
                    datetimelist.add(i);
                }
            }
            // 处理列名字符串
            List<String> headColumnName = Arrays.asList(colNames.split(","));
            // 写数据到Excel文件
            XSSFWorkbook workbook = exportExcel(headColumnName, type, databaseName, mouldId, datetimelist, downData, downRows);
            String filename = databasecname + "导入模板.xlsx";
            if (("1").equals(type)) {
                filename = databasecname + "数据导出" + DateFormatUtils.format(new Date(), "yyyy-MM-dd") + ".xlsx";
            }
            String downloadFileName;
            String agent = request.getHeader("USER-AGENT");
            if (agent != null && agent.toLowerCase().indexOf("firefox") > 0) {
                downloadFileName = "=?UTF-8?B?" + (new String(Base64.encodeBase64(filename.getBytes("UTF-8")))) + "?=";
            } else {
                downloadFileName = java.net.URLEncoder.encode(filename, "UTF-8");
            }

            response.setHeader("Content-Type", "application/vnd.ms-excel");
            response.setHeader("Content-Disposition", "attachment;filename=" + downloadFileName);
            response.setContentType("application/octet-stream");
            response.setCharacterEncoding("UTF-8");

            workbook.write(ouputStream);
            ouputStream.flush();
            ouputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private XSSFWorkbook exportExcel(List<String> headColumnName, String type, String databaseName, String mouldId, List<Integer> datetimelist, List<String[]> downData, List<Integer> downRows) {

        // 写数据到Excel文件
        XSSFWorkbook workBook = new XSSFWorkbook();
        // 设置表头字体
        Font headfont = workBook.createFont();
        headfont.setFontName("黑体");
        headfont.setFontHeightInPoints((short) 9);// 字体大小
        headfont.setBoldweight(Font.BOLDWEIGHT_BOLD);// 加粗

        CellStyle headStyle = workBook.createCellStyle(); // 表头第一列的样式
        headStyle.setFillForegroundColor(HSSFColor.LIGHT_CORNFLOWER_BLUE.index); // 前景色设置
        headStyle.setFillPattern(CellStyle.SOLID_FOREGROUND); // 填充模式 设置
        headStyle.setFont(headfont);
        headStyle.setAlignment(CellStyle.ALIGN_CENTER);// 左右居中
        headStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 上下居中
        headStyle.setWrapText(true);
        headStyle.setBorderRight(CellStyle.BORDER_THIN);
        headStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());
        headStyle.setBorderTop(CellStyle.BORDER_THIN);
        headStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
        // 表格正文样式，背景色,边框
        CellStyle style = workBook.createCellStyle();
        style.setFillForegroundColor(HSSFColor.LEMON_CHIFFON.index); // 前景色设置
        style.setFillPattern(CellStyle.SOLID_FOREGROUND); // 填充模式 设置
        style.setBorderBottom(CellStyle.BORDER_THIN); // 设置单元格的边框为粗体
        style.setBottomBorderColor(IndexedColors.BLACK.getIndex()); // 设置单元格的边框颜色
        style.setBorderRight(CellStyle.BORDER_THIN);
        style.setRightBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderTop(CellStyle.BORDER_THIN);
        style.setTopBorderColor(IndexedColors.BLACK.getIndex());

        Row row;
        Cell cell;
        XSSFSheet sheet;
        sheet = workBook.createSheet("资源数据");
        row = sheet.createRow(0);// 第一行，标题
        // 如果没有设置要下载的字段
        if (headColumnName.size() == 1 && StringUtils.isEmpty(headColumnName.get(0))) {
            cell = row.createCell(0);
            cell.setCellValue("没有要下载的数据！");
            return workBook;
        }
        // 设置第一行标题
        for (int i = 0; i < headColumnName.size(); i++) {
            cell = row.createCell(i);
            cell.setCellValue(headColumnName.get(i));
            cell.setCellStyle(headStyle);
            // 设置列宽
            sheet.setColumnWidth(i, 18 * 256);
        }
        if (!StringUtils.isEmpty(type) && type.equals("0")) {//导出模板
            ExcelUtil.getExcelTemplate(workBook, sheet, headColumnName, downData, downRows);
            XSSFCellStyle datestyle = workBook.createCellStyle();
            CreationHelper creationHelper = workBook.getCreationHelper();
            datestyle.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy-MM-dd hh:mm:ss"));
            // 创建行
            for (int i = 1; i < 100; i++) {
                row = sheet.createRow(i);
                for (int j = 0; j < datetimelist.size(); j++) {//日期时间
                    cell = row.createCell(datetimelist.get(j));
                    cell.setCellStyle(datestyle);
                }
            }
        } else if (!StringUtils.isEmpty(type) && type.equals("1")) {// 如果是导出全部数据 设置正文内容
            DbMetadatasExample example = new DbMetadatasExample();
            example.createCriteria().andMouldidEqualTo(Integer.valueOf(mouldId));
            // 查出数据
            DataLibrarysManageSearchBean dataLibrarysManageSearchBean = new DataLibrarysManageSearchBean();
            dataLibrarysManageSearchBean.setDatabaseName(databaseName);
            dataLibrarysManageSearchBean.setMouldId(mouldId);
            ListInfo result = getSelfDataList(dataLibrarysManageSearchBean);

            List<Map<String, String>> listNew = result.getList();

            for (int i = 0, len = listNew.size(); i < len; i++) {// 循环创建数据行
                row = sheet.createRow(i + 1);
                for (int j = 0; j < headColumnName.size(); j++) {
                    cell = row.createCell(j);
                    String fieldName = "";
                    if (null != headColumnName.get(j) && headColumnName.get(j).split("###").length > 1) {
                        fieldName = headColumnName.get(j).split("###")[1];
                    }
                    String cellValue = String.valueOf(listNew.get(i).get(fieldName));
                    if ("&nbsp;".equals(cellValue) || StringUtils.isEmpty(cellValue) || "null".equals(cellValue)) {
                        cellValue = "";
                    }
                    if (cellValue.length() >= 32767) {
                        cellValue = cellValue.substring(0, 32000) + "...";
                    }
                    cell.setCellValue(cellValue);
                    cell.setCellStyle(style);
                }
            }
        }

        return workBook;
    }

    private ListInfo getSelfDataList(DataLibrarysManageSearchBean dataLibrarysManageSearchBean) {

        ListInfo listInfo = new ListInfo();
        // 获取db基本信息
        List<DatalibrarysCustomBean> dbList = datalibrarysCustomMapper.selectByExample(dataLibrarysManageSearchBean);
        if (dbList != null && dbList.size() == 1) {
            DatalibrarysCustomBean db = dbList.get(0);
            // 获取资源库元数据
            List<MetadatasCustomBean> metaList = metadatasCustomMapper.selectByExample(db.getMouldid().toString());

            if (metaList == null) {
                metaList = new ArrayList<>();
            }

            StringBuffer whereSql = new StringBuffer(" where status != -1 ");
            if (dataLibrarysManageSearchBean.getUserId() > 0) {
                whereSql.append(" and creatorid=").append(dataLibrarysManageSearchBean.getUserId());
            }

            List<MetadatasCustomBean> rMetaList = new ArrayList<>();
            String showCol = "";
            for (MetadatasCustomBean metadatasCustomBean : metaList) {
                if (null != metadatasCustomBean.getImportandexportshow()
                        && metadatasCustomBean.getImportandexportshow() == 1) {
                    if (metadatasCustomBean.getColumntype() == 10) {
                        showCol += "DATE_FORMAT(" + metadatasCustomBean.getColumnname() + ",'%y-%m-%d %H:%i:%s')" + metadatasCustomBean.getColumnname() + ",";
                    } else {
                        showCol += metadatasCustomBean.getColumnname() + ",";
                    }
                    if (metadatasCustomBean.getColumntype() == Constants.COLUMNTYPE_RADIO
                            || metadatasCustomBean.getColumntype() == Constants.COLUMNTYPE_CHECKBOX) {
                        rMetaList.add(metadatasCustomBean);
                    }
                }
            }

            showCol = showCol.substring(0, showCol.length() - 1);

            String sqlCount = "select count(1) from " + db.getDatabasename() + " " + whereSql.toString();
            int count = datalibrarysCustomMapper.getResCount(sqlCount);
            String sqlList;
            if (count > 0) {
                if (showCol.contains("creatorid")) {
                    showCol = showCol.replaceAll("creatorid,", "");
                    showCol += ",u.RealName as creatorid ";
                    sqlList = "select " + showCol + " from " + db.getDatabasename()
                            + " db LEFT JOIN (select UserID,RealName from base_managers) u on db.creatorid = u.UserID "
                            + whereSql.toString() + " order by seqid desc ";
                } else {
                    sqlList = "select " + showCol + " from " + db.getDatabasename() + whereSql.toString()
                            + " order by seqid desc ";
                }
                List<LinkedHashMap<String, Object>> resList = datalibrarysCustomMapper.getResList(sqlList);

                List<LinkedHashMap<String, Object>> resultList = new ArrayList<>();

                if (rMetaList != null && rMetaList.size() > 0) {
                    Map<String, List<?>> list = new HashMap<>();
                    for (MetadatasCustomBean metaCustom : rMetaList) {
                        switch (metaCustom.getColumnsource()) {
                            case Constants.COlUMNSOURCE_DIC:
                                BaseDicsExample dicExample = new BaseDicsExample();
                                dicExample.createCriteria().andDictypeEqualTo(metaCustom.getColumntyperule()).andIsdictypeEqualTo(0);
                                List<BaseDics> dic = dicsMapper.selectByExample(dicExample);
                                list.put(metaCustom.getColumnname(), dic);
                                break;
                            case Constants.COlUMNSOURCE_CLASS:
                                BaseClassesExample classExample = new BaseClassesExample();
                                String typeRule = metaCustom.getColumntyperule();
                                if (!StringUtils.isEmpty(typeRule)) {
                                    classExample.createCriteria().andClassidEqualTo(Integer.valueOf(typeRule));
                                }
                                List<ClassesCustomBean> classes = classesCustomMapper.selectByExample(classExample);
                                list.put(metaCustom.getColumnname(), classes);
                                break;
                            case Constants.COlUMNSOURCE_DB:
                                DbLibrarynexusExample nexusExample = new DbLibrarynexusExample();

                                nexusExample.createCriteria().andMdbfieldEqualTo(metaCustom.getColumnname()).
                                        andMdbnameEqualTo(dataLibrarysManageSearchBean.getDatabaseName());

                                List<DbLibrarynexus> nexusList = librarynexusMapper.selectByExample(nexusExample);
                                List<List<LinkedHashMap<String, Object>>> nexusResList = new ArrayList<>();
                                if (nexusList != null) {
                                    for (DbLibrarynexus dbLibraryNexus : nexusList) {
                                        if (dbLibraryNexus != null) {
                                            List<LinkedHashMap<String, Object>> nexusSqlList = datalibrarysCustomMapper
                                                    .getResList(dbLibraryNexus.getSdbsql());
                                            if (nexusSqlList != null && nexusSqlList.size() > 0) {
                                                nexusResList.add(nexusSqlList);
                                            }
                                        }
                                    }
                                }
                                list.put(metaCustom.getColumnname(), nexusResList);
                                break;
                        }
                        for (int i = 0; i < resList.size(); i++) {
                            LinkedHashMap<String, Object> resMap = resList.get(i);
                            resMap.put(metaCustom.getColumnname() + "Name", null);
                        }
                    }
                    for (LinkedHashMap<String, Object> object : resList) {
                        for (MetadatasCustomBean metaCustomBean : rMetaList) {
                            if (list == null || list.size() == 0) {
                                continue;
                            }
                            if (!list.containsKey(metaCustomBean.getColumnname())) {
                                continue;
                            }
                            Object value = object.get(metaCustomBean.getColumnname());
                            if (value == null || value.toString().isEmpty()) {
                                continue;
                            }
                            List<?> valueList = list.get(metaCustomBean.getColumnname());
                            String str = "";
                            String valueStr = value.toString();
                            for (Object v : valueList) {
                                if (v.getClass().equals(BaseDics.class)) {
                                    BaseDics dic = (BaseDics) v;
                                    if (valueStr.contains(dic.getDicvalue())) {
                                        str += dic.getDicname() + ",";
                                    }
                                } else if (v.getClass().equals(ClassesCustomBean.class)) {
                                    ClassesCustomBean cls = (ClassesCustomBean) v;
                                    if (valueStr.contains(cls.getClassid().toString())) {
                                        str += cls.getClassname() + ",";
                                    }
                                } else {
                                    if (v != null) {
                                        List<LinkedHashMap<String, Object>> nexusL = (List<LinkedHashMap<String, Object>>) v;
                                        if (nexusL != null && nexusL.size() > 0) {
                                            for (LinkedHashMap<String, Object> map : nexusL) {
                                                if (map != null && map.size() > 1) {
                                                    Collection<Object> mapValue = map.values();
                                                    Object[] mapValueArr = mapValue.toArray();
                                                    if (valueStr.contains(mapValueArr[0].toString())) {
                                                        str += mapValueArr[1] + ",";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (str.length() > 1) {
                                str = str.substring(0, str.length() - 1);
                            }
                            object.put(metaCustomBean.getColumnname(), str);
                        }
                        resultList.add(object);
                    }
                } else {
                    resultList = resList;
                }
                listInfo.setLength(count);
                listInfo.setList(resultList);
                return listInfo;
            }
        }

        return listInfo;
    }


    @Override
    public ActionResult updateResByFiledBatch(DataLibrarysManageSearchBean searchBean, String fieldval,
                                              String fieldname, HttpServletRequest request) {
        StringBuffer delSql = new StringBuffer("update ");
        String resIds = searchBean.getResIds();
        if (StringUtils.isNoneEmpty(resIds)) {
            delSql.append(searchBean.getDatabaseName()).append(" set ").append(fieldname).append(" = '").append(fieldval).append("' where seqid in(");
            delSql.append(resIds).append(")");
            int count = datalibrarysCustomMapper.alterTable(delSql.toString());
            if (count > 0) {
                BaseManagers loginUser = (BaseManagers) request.getSession().getAttribute("USER_VALUE_OBJECT");
                String mouldId = searchBean.getMouldId();
                BaseMenusExample example = new BaseMenusExample();
                example.createCriteria().andPathLike("%mouldId=" + mouldId);
                List<BaseMenus> menus = menusMapper.selectByExample(example);
                BaseLogs logs = new BaseLogs();
                logs.setCreatetime(new Date());
                String logdetail = "修改了" + menus.get(0).getMenuname() + count + "条数据状态";
                logs.setLogdetail(logdetail);
                logs.setCreator(Integer.valueOf(loginUser.getUserid()));
                logs.setLogtype(Integer.valueOf(LogType.OPERATION_3));
                logsMapper.insert(logs);
            }
        }
        return ActionResult.ok();
    }

    @Override
    public boolean checkunique(String columnname, String value, Integer seqid, String databasename) {
        StringBuffer sb = new StringBuffer();
        sb.append("select count(1) from ").append(databasename).append(" Where ").append(columnname)
                .append("='").append(value).append("'");
        if (seqid != null) {
            sb.append(" and ").append("seqid!= ").append(seqid);
        }
        return datalibrarysCustomMapper.checkunique(sb.toString()) > 0;
    }

    @Override
    public String getfileServerUrl() {
        return fileserverurl;
    }

    @Override
    public List<Object[]> platformdataByType(String type) {
        List<Object[]> result = new ArrayList<>();
        List<Object> slist = new ArrayList<>();
        List<Object> ilist = new ArrayList<>();
        if (type.equals("0")) {
            Date date=new Date();
            Calendar cal = Calendar.getInstance();
            for (int i = 15; i > 0; i--) {
                // 查询最近半个月的每天登录人数
                cal.setTime(date);
                cal.add(Calendar.DATE, -i);
                Date month = cal.getTime();
                String string = new SimpleDateFormat("MM-dd").format(month);
                String start = new SimpleDateFormat("yyyy-MM-dd").format(month)+" 00:00:00";
                String end = new SimpleDateFormat("yyyy-MM-dd").format(month)+" 23:59:59";
                Date startdate = null;
                Date enddate = null;
                try {startdate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(start);
                    enddate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(end);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                FrontUserLoginDayExample example = new FrontUserLoginDayExample();
                example.createCriteria().andCreatedtimeBetween(startdate, enddate);
                int count = userLoginDayMapper.countByExample(example);
                slist.add(string);
                ilist.add(count);
            }
            Object[] sarr = slist.toArray();
            Object[] iarr = ilist.toArray();
            result.add(sarr);
            result.add(iarr);
        } else if (type.equals("1")) {
            Date date=new Date();
            Calendar cal = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            for (int i = 6; i > 0; i--) {
                // 查询最近6个月的每月登录人数
                cal.setTime(date);
                cal.add(Calendar.MONTH, -i);
                cal2.setTime(date);
                cal2.add(Calendar.MONTH, -(i-1));
                Date month = cal.getTime();
                Date month2= cal2.getTime();
                String string = new SimpleDateFormat("yyyy-MM").format(month);
                String start = new SimpleDateFormat("yyyy-MM").format(month)+"-01 00:00:00";
                String end = new SimpleDateFormat("yyyy-MM").format(month2)+"-01 00:00:00";
                Date startdate = null;
                Date enddate = null;
                try {
                    startdate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(start);
                    enddate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(end);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                FrontUserLoginDayExample example = new FrontUserLoginDayExample();
                example.createCriteria().andCreatedtimeBetween(startdate, enddate);
                int count = userLoginDayMapper.countByExample(example);
                slist.add(string);
                ilist.add(count);
            }
            Object[] sarr = slist.toArray();
            Object[] iarr = ilist.toArray();
            result.add(sarr);
            result.add(iarr);
        } else if (type.equals("2")) {
            FrontEbookExample example = new FrontEbookExample();
            example.createCriteria().andFavoritenumGreaterThan(0);
            example.setOrderByClause("favoriteNum DESC");
            List<FrontEbook> list = ebookMapper.selectByExample(example);
            if (list.size() > 10) {
                for (int i = 0; i < 10; i++) {
                    slist.add(list.get(i).getName());
                    ilist.add(list.get(i).getFavoritenum());
                }
            } else {
                for (FrontEbook frontEbook : list) {
                    slist.add(frontEbook.getName());
                    ilist.add(frontEbook.getFavoritenum());
                }
            }
            Object[] sarr = slist.toArray();
            Object[] iarr = ilist.toArray();
            result.add(sarr);
            result.add(iarr);
        } else if (type.equals("3")) {
            FrontEbookExample example = new FrontEbookExample();
            example.createCriteria().andSalesvolumeGreaterThan(0);
            example.setOrderByClause("salesVolume DESC");
            List<FrontEbook> list = ebookMapper.selectByExample(example);
            if (list.size() > 10) {
                for (int i = 0; i < 10; i++) {
                    slist.add(list.get(i).getName());
                    ilist.add(list.get(i).getSalesvolume());
                }
            } else {
                for (FrontEbook frontEbook : list) {
                    slist.add(frontEbook.getName());
                    ilist.add(frontEbook.getSalesvolume());
                }
            }
            Object[] sarr = slist.toArray();
            Object[] iarr = ilist.toArray();
            result.add(sarr);
            result.add(iarr);
        }
        return result;
    }

    @Override
    public ActionResult listfillminusType() {
        Date date=new Date();
        FrontFullminustypeExample example=new FrontFullminustypeExample();
        example.createCriteria().andEndtimeGreaterThan(date).andStatusEqualTo(1);
        return ActionResult.ok(frontFullminustypeMapper.selectByExample(example));
    }

    @Override
    public ActionResult listthemeid() {
        FrontThematicExample example=new FrontThematicExample();
        example.createCriteria().andStatusEqualTo(1);
        return ActionResult.ok(thematicMapper.selectByExample(example));
    }

    @Override
    public ActionResult listuserid() {
        FrontUserInfoExample example=new FrontUserInfoExample();
        example.createCriteria().andStatusEqualTo(1).andUsertypeEqualTo(3);
        return ActionResult.ok(userInfoMapper.selectByExample(example));
    }

    @Override
    public ActionResult authorization(DataLibrarysManageSearchBean searchBean,String starttimestr,String endtimestr,HttpServletRequest request) {
        try {
            BaseManagers loginUser = (BaseManagers)request.getSession().getAttribute("USER_VALUE_OBJECT");
            Date starttime = DateUtils.parseDate(starttimestr, "yyyy-MM-dd hh:mm:ss");
            Date endtime = DateUtils.parseDate(endtimestr, "yyyy-MM-dd hh:mm:ss");
            FrontUserGrantbatch grantbatch = new FrontUserGrantbatch();
            grantbatch.setBookid(searchBean.getResIds());
            grantbatch.setUserid(String.valueOf(searchBean.getUserId()));
            grantbatch.setCreatetime(new Date());
            grantbatch.setStarttime(starttime);
            grantbatch.setEndtime(endtime);
            userGrantbatchMapper.insert(grantbatch);
            List<FrontUserGrantbatch> list = userGrantbatchMapper.selectByExample(new FrontUserGrantbatchExample());
            Integer grantbatchid = list.get(list.size() - 1).getSeqid();
            List<String> bookids = Arrays.asList(searchBean.getResIds().split(","));
            if (bookids != null && bookids.size() > 0) {
                for (String id : bookids) {
                    FrontUserBooksOwned record = new FrontUserBooksOwned();
                    record.setBookstatus(1);
                    record.setCreatedtime(new Date());
                    record.setCreatorid(Integer.valueOf(loginUser.getUserid()));
                    record.setEbookid(Integer.valueOf(id));
                    record.setStarttime(starttime);
                    record.setEndtime(endtime);
                    record.setStatus(1);// 1代表正常，-1代表删除
                    record.setType(2);// 书籍来源：0购买，1租赁，2机构授权，3阅读卡，4离线
                    record.setUserid(searchBean.getUserId());
                    record.setGrantbatchid(grantbatchid);
                    userBooksOwnedMapper.insert(record);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return ActionResult.build(-1,"操作失败");
        }
        return ActionResult.ok();
    }

    @Autowired
    private QuartzManager quartzManager;

    @Override
    public ActionResult sendMessage(String resIds, HttpServletRequest request) {
        try {
            BaseManagers loginUser = (BaseManagers)request.getSession().getAttribute("USER_VALUE_OBJECT");
            List<String> msgids = Arrays.asList(resIds.split(","));
            if (msgids != null && msgids.size() > 0) {
                for (String id : msgids) {
                    FrontSysmessage sysmessage = sysmessageMapper.selectByPrimaryKey(Integer.valueOf(id));
                    if (sysmessage.getSendmsgtype() == 1) {// 1立即发送，2定时发送
                        sysmessage.setSendstatus("1");
                        sysmessageMapper.updateByPrimaryKey(sysmessage);
                        List<FrontUserInfo> userlist = userInfoMapper.selectByExample(new FrontUserInfoExample());
                        for (FrontUserInfo frontUserInfo : userlist) {
                            Integer userid = frontUserInfo.getSeqid();
                            FrontUserSysmessage userSysmessage = new FrontUserSysmessage();
                            userSysmessage.setUserid(userid);
                            userSysmessage.setCreatedtime(new Date());
                            userSysmessage.setSysmessageid(sysmessage.getSeqid().toString());
                            userSysmessage.setSendtime(sysmessage.getSendtime());
                            userSysmessage.setCreatorid(Integer.valueOf(loginUser.getUserid()));
                            userSysmessage.setStatus(1);
                            userSysmessage.setIscheck("0");// 0代表未读，1代表已读
                            userSysmessageMapper.insert(userSysmessage);
                        }
                        sysmessageMapper.updateByPrimaryKey(sysmessage);
                    } else if (sysmessage.getSendmsgtype() == 2){
                        Integer seqId = sysmessage.getSeqid();
                        String cron = QuartzCronDateUtils.getCron(sysmessage.getSendtime());
                        quartzManager.addJob("SendSysMsgJob" + seqId, JOB_GROUP_NAME, "SendSysMsgTrigger" + seqId,
                                TRIGGER_GROUP_NAME, SendSysMsgJob.class, cron, new Object[] { seqId,loginUser.getUserid() });
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ActionResult.build(-1,"操作失败！");
        }
        return ActionResult.ok();
    }

    @Override
    public ActionResult fankui(String resIds, Integer scorenum) {
        try {
            List<String> msgids = Arrays.asList(resIds.split(","));
            if (msgids != null && msgids.size() > 0) {
                for (String id : msgids) {
                    FrontFeedBack back = feedBackMapper.selectByPrimaryKey(Integer.valueOf(id));
                    FrontAccountExample example=new FrontAccountExample();
                    example.createCriteria().andUseridEqualTo(Integer.valueOf(back.getUserid()));
                    List<FrontAccount> list = accountMapper.selectByExample(example);
                    if(list!=null&&list.size()>0){
                        FrontAccount account = list.get(0);
                        account.setScore(account.getScore()+scorenum);
                        accountMapper.updateByPrimaryKey(account);
                        FrontIncomeInfo incomeInfo=new FrontIncomeInfo();
                        incomeInfo.setAccountid(account.getSeqid().toString());
                        incomeInfo.setIncometype("1");//赠送积分
                        incomeInfo.setPaytime(new Date());
                        incomeInfo.setCreatedtime(new Date());
                        incomeInfo.setAddscore(scorenum);
                        incomeInfoMapper.insert(incomeInfo);
                    }
                    back.setIsgiven(1);
                    feedBackMapper.updateByPrimaryKey(back);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ActionResult.build(-1,"操作失败");
        }
        return ActionResult.ok();
    }

    @Override
    public List<Object[]> userbaseByType(Integer type) {
        List<Object[]> result = new ArrayList<>();
        if (type==0) {
            FrontUserInfoExample example = new FrontUserInfoExample();
            List<FrontUserInfo> list = userInfoMapper.selectByExample(example);
            Set<Integer> ilist = new HashSet<>();
            for (FrontUserInfo frontUserInfo : list) {
                if (frontUserInfo.getCountry() != null && !frontUserInfo.getCountry().equals("")) {
                    ilist.add(frontUserInfo.getCountry());
                }
            }
            for (Integer integer : ilist) {
                Country country = countryMapper.selectByPrimaryKey(integer);
                if (country != null) {
                    FrontUserInfoExample example2 = new FrontUserInfoExample();
                    example2.createCriteria().andCountryEqualTo(integer);
                    int count = userInfoMapper.countByExample(example2);
                    Object[] o = { country.getZhName(), count };
                    result.add(o);
                }
            }
        }
        if (type==1) {
            FrontUserInfoExample example1 = new FrontUserInfoExample();
            example1.createCriteria().andAgeLessThan(10);
            int count1 = this.userInfoMapper.countByExample(example1);
            FrontUserInfoExample example2 = new FrontUserInfoExample();
            example2.createCriteria().andAgeBetween(10, 19);
            int count2 = this.userInfoMapper.countByExample(example2);
            FrontUserInfoExample example3 = new FrontUserInfoExample();
            example3.createCriteria().andAgeBetween(20, 29);
            int count3 = this.userInfoMapper.countByExample(example3);
            FrontUserInfoExample example4 = new FrontUserInfoExample();
            example4.createCriteria().andAgeBetween(30, 49);
            int count4 = this.userInfoMapper.countByExample(example4);
            FrontUserInfoExample example5 = new FrontUserInfoExample();
            example5.createCriteria().andAgeGreaterThan(50);
            int count5 = this.userInfoMapper.countByExample(example5);
            Object[] o1 = { "小于10岁", count1 };
            Object[] o2 = { "10到20岁", count2 };
            Object[] o3 = { "20到30岁", count3 };
            Object[] o4 = { "30到50岁", count4 };
            Object[] o5 = { "50岁以上", count5 };
            result.add(o1);
            result.add(o2);
            result.add(o3);
            result.add(o4);
            result.add(o5);
        }
        if (type==2) {
            FrontUserInfoExample example = new FrontUserInfoExample();
            List<FrontUserInfo> list = userInfoMapper.selectByExample(example);
            Set<Integer> ilist = new HashSet<>();
            for (FrontUserInfo frontUserInfo : list) {
                if (frontUserInfo.getLeanchyear() != null && !frontUserInfo.getLeanchyear().equals("")) {
                    ilist.add(frontUserInfo.getLeanchyear());
                }
            }
            String[] s = { "不到1年", "1年", "2年", "3年", "4年", "5年", "大于5年" };
            for (Integer integer : ilist) {
                FrontUserInfoExample example2 = new FrontUserInfoExample();
                if (integer <= 5) {
                    example2.createCriteria().andLeanchyearEqualTo(integer);
                    int count = userInfoMapper.countByExample(example2);
                    Object[] o = { s[integer], count };
                    result.add(o);
                }
            }
            example.createCriteria().andLeanchyearGreaterThan(5);
            int count = userInfoMapper.countByExample(example);
            Object[] o = { s[6], count };
            result.add(o);
        }
        if (type==3) {
            FrontUserBindExample example1 = new FrontUserBindExample();
            example1.createCriteria().andSystemEqualTo("0");
            int count1 = userBindMapper.countByExample(example1);
            FrontUserBindExample example2 = new FrontUserBindExample();
            example2.createCriteria().andSystemEqualTo("1");
            int count2 = userBindMapper.countByExample(example2);
            FrontUserBindExample example3 = new FrontUserBindExample();
            example3.createCriteria().andSystemEqualTo("2");
            int count3 = userBindMapper.countByExample(example3);
            Object[] o1 = { "Android", count1 };
            Object[] o2 = { "IOS", count2 };
            Object[] o3 = { "Web", count3 };
            result.add(o1);
            result.add(o2);
            result.add(o3);
        }
        return result;
    }

    @Override
    public List<Object[]> userreadByType(Integer userid, Integer type, String starttimestr, String endtimestr) {
        List<Object[]> result = new ArrayList<>();
        Date starttime = null;
        Date endtime = null;
        try {
            if (starttimestr != null && endtimestr != null && starttimestr != "" && endtimestr != "") {
                starttime = DateUtils.parseDate(starttimestr, "yyyy-MM-dd");
                endtime = DateUtils.parseDate(endtimestr, "yyyy-MM-dd");
            }
            if (type==0) {
                FrontReadHistoryExample example = new FrontReadHistoryExample();
                example.createCriteria().andUseridEqualTo(Integer.valueOf(userid)).
                        andReadthroughGreaterThanOrEqualTo(0).andAccesstimeBetween(starttime, endtime);
                example.setOrderByClause("readthrough DESC");
                // mapper文件做了处理，仅显示10条数据
                List<FrontReadHistory> list = readHistoryMapper.selectByExample(example);
                List<String> s = new ArrayList<>();
                List<Integer> i = new ArrayList<>();
                for (FrontReadHistory frontReadHistory : list) {
                    FrontUserInfo userInfo = userInfoMapper.selectByPrimaryKey(frontReadHistory.getUserid());
                    if (userInfo != null) {
                        s.add(userInfo.getName());
                        i.add(frontReadHistory.getReadhave());
                    }
                }
                Object[] sarr = s.toArray();
                Object[] iarr = i.toArray();
                result.add(sarr);
                result.add(iarr);
            }
            if (type==1) {
                FrontReadLogExample example = new FrontReadLogExample();
                example.createCriteria().andUseridEqualTo(Integer.valueOf(userid)).andCreatedtimeBetween(starttime, endtime);
                List<FrontReadLog> list = readLogMapper.selectByExample(example);
                List<String> slist = new ArrayList<>();
                List<Integer> ilist = new ArrayList<>();
                List<String> cList = new ArrayList<>();
                for (FrontReadLog frontReadLog : list) {
                    FrontEbook frontEbook = ebookMapper.selectByPrimaryKey(frontReadLog.getEbookid());
                    if (frontEbook != null && frontEbook.getSerialid() != null && frontEbook.getSerialid() != "") {
                        cList.add(frontEbook.getSerialid());
                    }
                }
                Map<String, Integer> elementsCount = new HashMap<>();
                for (String s : cList) {
                    Integer i = elementsCount.get(s);
                    if (i == null) {
                        elementsCount.put(s, 1);
                    } else {
                        elementsCount.put(s, i + 1);
                    }
                }
                Set<Entry<String, Integer>> entrySet = elementsCount.entrySet();
                for (Entry<String, Integer> entry : entrySet) {
                    BaseSeries series = seriesMapper.selectByPrimaryKey(Integer.valueOf(entry.getKey()));
                    if (series != null) {
                        slist.add(series.getSerialname());
                        ilist.add(entry.getValue());
                    }
                }
                Object[] sarr = slist.toArray();
                Object[] iarr = ilist.toArray();
                result.add(sarr);
                result.add(iarr);
            }
            if (type==2) {
                FrontReadLogExample example = new FrontReadLogExample();
                example.createCriteria().andUseridEqualTo(Integer.valueOf(userid)).andCreatedtimeBetween(starttime, endtime);
                List<FrontReadLog> list = readLogMapper.selectByExample(example);
                List<String> slist = new ArrayList<>();
                List<Integer> ilist = new ArrayList<>();
                List<Integer> cList = new ArrayList<>();
                for (FrontReadLog frontReadLog : list) {
                    FrontEbook frontEbook = ebookMapper.selectByPrimaryKey(frontReadLog.getEbookid());
                    if (frontEbook != null) {
                        String classid = frontEbook.getClassid();
                        String[] ids = classid.split(",");
                        for (String id : ids) {
                            cList.add(Integer.valueOf(id));
                        }
                    }
                }
                Map<Integer, Integer> elementsCount = new HashMap<>();
                for (Integer integer : cList) {
                    Integer i = elementsCount.get(integer);
                    if (i == null) {
                        elementsCount.put(integer, 1);
                    } else {
                        elementsCount.put(integer, i + 1);
                    }
                }
                Set<Entry<Integer, Integer>> entrySet = elementsCount.entrySet();
                for (Entry<Integer, Integer> entry : entrySet) {
                    BaseClasses classes = classesMapper.selectByPrimaryKey(entry.getKey());
                    slist.add(classes.getClassname());
                    ilist.add(entry.getValue());
                }
                Object[] sarr = slist.toArray();
                Object[] iarr = ilist.toArray();
                result.add(sarr);
                result.add(iarr);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public List<Object[]> getUserlogin(Integer userid, Integer type) {
        List<Object[]> result = new ArrayList<>();
        List<Object> slist = new ArrayList<>();
        List<Object> ilist = new ArrayList<>();
        if (type==0) {
            double time=0;
            FrontUserLoginDayExample example=new FrontUserLoginDayExample();
            example.createCriteria().andUseridEqualTo(Integer.valueOf(userid));
            List<FrontUserLoginDay> list = userLoginDayMapper.selectByExample(example);
            for (FrontUserLoginDay frontUserLoginDay : list) {
                time+=frontUserLoginDay.getDaylogintime();
            }
            FrontUserInfo userInfo = userInfoMapper.selectByPrimaryKey(Integer.valueOf(userid));
            if(userInfo!=null&&userInfo.getName()!=null){
                slist.add(userInfo.getName());
            }else {
                slist.add("");
            }
            ilist.add(time);
            Object[] sarr = slist.toArray();
            Object[] iarr = ilist.toArray();
            result.add(sarr);
            result.add(iarr);
        } else if (type==1) {
            Date date = new Date();
            Calendar cal = Calendar.getInstance();
            for (int i = 15; i > 0; i--) {
                // 查询最近半个月的每天登录时长
                cal.setTime(date);
                cal.add(Calendar.DATE, -i);
                Date month = cal.getTime();
                String string = new SimpleDateFormat("MM-dd").format(month);
                String start = new SimpleDateFormat("yyyy-MM-dd").format(month)+" 00:00:00";
                String end = new SimpleDateFormat("yyyy-MM-dd").format(month)+" 23:59:59";
                Date startdate = null;
                Date enddate = null;
                try {startdate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(start);
                    enddate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(end);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                FrontUserLoginDayExample example = new FrontUserLoginDayExample();
                example.createCriteria().andUseridEqualTo(Integer.valueOf(userid)).andCreatedtimeBetween(startdate, enddate);
                List<FrontUserLoginDay> list = userLoginDayMapper.selectByExample(example);
                if(list!=null&&list.size()>0){
                    ilist.add(list.get(0).getDaylogintime());
                }else{
                    ilist.add("");
                }
                slist.add(string);
            }
            Object[] sarr = slist.toArray();
            Object[] iarr = ilist.toArray();
            result.add(sarr);
            result.add(iarr);
        }
        return result;
    }

    @Override
    public List<Object[]> getUserexpend(Integer userid, Integer type) {
        // 周虚拟币跟积分
        List<Object[]> result = new ArrayList<>();
        List<String> slist = new ArrayList<>();
        List<Float> ilist = new ArrayList<>();
        float monthmoney = 0;
        int monthscore = 0;
        int monthcount = 0;
        if(type==1||type==2||type==3){
            // 查询最近6个月
            for (int i = 7; i > 0; i--) {
                Date date = new Date();
                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                cal.add(Calendar.MONTH, -i);
                Date month = cal.getTime();
                String string = new SimpleDateFormat("yyyy-MM").format(month);
                slist.add(string);
            }

        }else if(type==4||type==5||type==6){
            // 查询最近一个星期的虚拟币跟积分
            for (int i = 7; i > 0; i--) {
                Date date = new Date();
                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                cal.add(Calendar.DATE, -i);
                Date week = cal.getTime();
                slist.add(new SimpleDateFormat("MM-dd").format(week));
            }
        }
        if (type==1) {
            for (String month : slist) {
                monthmoney = sqlCustomMapper.sumMoneyByUserAndTime(userid, "%" + month + "%");
                ilist.add(monthmoney);
            }
        } else if (type==2) {
            // 查询最近六个月的虚拟币跟积分
            for (String month : slist) {
                monthscore = sqlCustomMapper.sumScoreByUserAndTime(userid, "%" + month + "%");
                // 月购买书籍
                ilist.add(Float.valueOf(monthscore));
            }
        } else if (type==3) {
            // 查询最近六个月的虚拟币跟积分
            for (String month : slist) {
                monthcount = sqlCustomMapper.countByUserAndTime(userid, "%" + month + "%");
                ilist.add(Float.valueOf(monthcount));
            }
        } else if (type==4) {
            for (String month : slist) {
                monthmoney = sqlCustomMapper.sumMoneyByUserAndTime(userid, "%" + month + "%");
                ilist.add(monthmoney);
            }
        } else if (type==5) {
            for (String month : slist) {
                monthscore = sqlCustomMapper.sumScoreByUserAndTime(userid, "%" + month + "%");
                ilist.add(Float.valueOf(monthscore));
            }
        } else if (type==6) {
            for (String month : slist) {
                monthcount = sqlCustomMapper.countByUserAndTime(userid, "%" + month + "%");
                ilist.add(Float.valueOf(monthcount));
            }
        }
        Object[] sarr = slist.toArray();
        Object[] iarr = ilist.toArray();
        result.add(sarr);
        result.add(iarr);
        return result;
    }

    @Override
    public ActionResult genQrcode(Integer seqid) {
        Destination destination = new ActiveMQQueue("genQrcode.queue");
        jmsMessagingTemplate.convertAndSend(destination, seqid);
        return ActionResult.ok();
    }

    @Override
    public void exportQrcode(Integer seqid, HttpServletRequest request, HttpServletResponse response) {
        FrontBookQrcodeExample example=new FrontBookQrcodeExample();
        example.createCriteria().andBookIdEqualTo(seqid);
        List<FrontBookQrcode> list = bookQrcodeMapper.selectByExample(example);
        FrontEbook ebook = ebookMapper.selectByPrimaryKey(seqid);
        OutputStream out=null;
        FileInputStream fis=null;
        try {
            String path=request.getContextPath();
            File directory = new File(path);
            directory.mkdirs();
            // 压缩目录
            ZipUtils.createZip(path, path + ".zip");
            // 根据路径获取刚生成的zip包文件
            File zipfile = new File(path + ".zip");
            out = response.getOutputStream();
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Disposition", "attachment;filename=" + ebook.getName()+".zip");
            for (FrontBookQrcode qrcode:list) {
                URL url=new URL(fileserverurl+qrcode.getImageUrl());
                FileUtils.copyInputStreamToFile(url.openStream(),new File(path+"/"+qrcode.getSeqid()));
            }
            fis = new FileInputStream(zipfile);
            byte[] buffer = new byte[512]; // 缓冲区
            int bytesToRead = -1;
            // 通过循环将读入的Word文件的内容输出到浏览器中
            while ((bytesToRead = fis.read(buffer)) != -1) {
                out.write(buffer, 0, bytesToRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
                if (out != null)
                    out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("success");
    }
}
