package com.retech.nyscms.service.impl;

import com.retech.nyscms.aspect.LogType;
import com.retech.nyscms.entity.*;
import com.retech.nyscms.entity.custom.*;
import com.retech.nyscms.mapper.*;
import com.retech.nyscms.mapper.custom.ClassesManageCustomMapper;
import com.retech.nyscms.mapper.custom.DatalibrarysManageCustomMapper;
import com.retech.nyscms.mapper.custom.MetadatasManageCustomMapper;
import com.retech.nyscms.mapper.custom.SqlCustomMapper;
import com.retech.nyscms.service.DatalibrarysService;
import com.retech.nyscms.utils.ActionResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**

 *@description

 *@author qinc

 *@date 2018/12/11

 */
@Service
public class DatalibrarysServiceImpl implements DatalibrarysService {

	@Autowired
	private DbDatalibrarysMapper datalibrarysMapper;

	@Autowired
	private DatalibrarysManageCustomMapper datalibrarysCustomMapper;

	@Autowired
	private DbLibrarynexusMapper librarynexusMapper;

	@Autowired
	private MetadatasManageCustomMapper metadatasCustomMapper;

	@Autowired
	private BaseDicsMapper dicsMapper;
	
	@Autowired
	private BaseMenusMapper menusMapper;
	
	@Autowired
	private SqlCustomMapper sqlCustomMapper;

	@Autowired
	private ClassesManageCustomMapper classesCustomMapper;
	
	@Autowired
	private BaseLogsMapper logsMapper;
	
	public ActionResult listCustom(DataLibrarysManageSearchBean searchBean) {
		List<DatalibrarysCustomBean> list = datalibrarysCustomMapper.selectByExample(searchBean);
		return ActionResult.ok(list);
	}

	public ActionResult list(String mouldId) {
		DbDatalibrarysExample example = new DbDatalibrarysExample();
		if (mouldId != null) {
			example.createCriteria().andMouldidEqualTo(Integer.valueOf(mouldId));
		}
		return ActionResult.ok(datalibrarysMapper.selectByExample(example));
	}

	public boolean checkUniqueness(DatalibrarysCustomBean customBean) {
		initDbMsg(customBean);
		return datalibrarysCustomMapper.checkUniqueness(customBean) > 0;
	}

	/**
	 * 初始化资源库信息
	 * 
	 * @param dbCustomBean
	 */
	public void initDbMsg(DatalibrarysCustomBean dbCustomBean) {
		if (dbCustomBean != null) {
			String databaseName = dbCustomBean.getDatabasename();
			if (!databaseName.contains(Constants.SelfDBPrefix)) {
				dbCustomBean.setDatabasename((Constants.SelfDBPrefix + dbCustomBean.getDatabasename()).toLowerCase());
			}
			dbCustomBean.setStatus(1);
		}
	}

	public ActionResult update(DatalibrarysCustomBean customBean) {
		int res = this.datalibrarysCustomMapper.updateByPrimaryKeySelective(customBean);
		if (res > 0) {
			// 删除原有库关系
			DbLibrarynexusExample nexusExample = new DbLibrarynexusExample();
			nexusExample.createCriteria().andMdbnameEqualTo(customBean.getDatabasename());
			librarynexusMapper.deleteByExample(nexusExample);

			List<DbLibrarynexus> nexusList = customBean.getLibraryNexus();
			if (nexusList != null) {
				insertNexusList(customBean,nexusList);
			}
		}
		return ActionResult.ok();
	}

	public void insertNexusList(DatalibrarysCustomBean customBean,List<DbLibrarynexus> nexusList){
		for (DbLibrarynexus DbLibrarynexus : nexusList) {
			DbLibrarynexus.setMdbname(customBean.getDatabasename());
			StringBuffer sql = new StringBuffer();
			sql.append("select ").append(DbLibrarynexus.getSdbvaluefield()).append(",")
					.append(DbLibrarynexus.getSdbnamefield()).append(" from ")
					.append(DbLibrarynexus.getSdbname()).append(" order by ")
					.append(DbLibrarynexus.getSdbvaluefield()).append(" asc");
			DbLibrarynexus.setSdbsql(sql.toString());
			// 插入资源库关系数据
			datalibrarysMapper.insertSelective(customBean);
		}
	}

	public ActionResult add(DatalibrarysCustomBean customBean) {
		List<MetadatasCustomBean> metaList = metadatasCustomMapper.selectByExample(customBean.getMouldid().toString());
		// 插入资源库数据
		int res = datalibrarysCustomMapper.insertSelective(customBean);
		if (res > 0) {
			List<DbLibrarynexus> nexusList = customBean.getLibraryNexus();
			if (nexusList != null) {
				insertNexusList(customBean,nexusList);
			}
			// 创建数据库表
			String createSql = getCreateTableSQL(metaList, customBean.getDatabasename(), customBean.getDatabasecname());
			datalibrarysCustomMapper.createNewTable(createSql);
		}
		return ActionResult.ok();

	}

	/**
	 * 获取SQL
	 * 
	 * @param metaList
	 * @param tablename
	 * @return
	 */
	public String getCreateTableSQL(List<MetadatasCustomBean> metaList, String tablename, String tablecname) {
		 StringBuilder sqlCreate = new StringBuilder();
	        sqlCreate.append("create table ").append(tablename).append(" (");
	        sqlCreate.append("seqid int NOT NULL PRIMARY KEY AUTO_INCREMENT ,");
	        for(MetadatasCustomBean metadata : metaList){
	        	sqlCreate.append(" ").append(metadata.getColumnname()).append(" ").append(metadata.getDatatype());
	        	if (metadata.getColumntype()==Constants.COLUMNTYPE_TEXT){//单行文本
	            	if(metadata.getColumnlength() == null || metadata.getColumnlength() == 0){
	                	sqlCreate.append("(100)");
	            	}else{
	                	sqlCreate.append("(").append(metadata.getColumnlength()).append(")");
	            	}
	            }else if(metadata.getColumntype()==Constants.COLUMNTYPE_TEXTAREA){//多行文本
	            	if(metadata.getColumnlength() == null || metadata.getColumnlength() == 0){
	                	sqlCreate.append("(512)");
	            	}else{
	                	sqlCreate.append("(").append(metadata.getColumnlength()).append(")");
	            	}
	            }else if(metadata.getColumntype()==Constants.COLUMNTYPE_RADIO){//下拉单选
	            	sqlCreate.append("(10)");
	            }else if(metadata.getColumntype()==Constants.COLUMNTYPE_CHECKBOX||metadata.getColumntype()==Constants.COLUMNTYPE_FILE){//下拉多选，文件上传
	            	sqlCreate.append("(512)");
	            }else if(metadata.getColumntype()==Constants.COLUMNTYPE_INT){//整数
	            	if(metadata.getColumnlength() == null || metadata.getColumnlength() == 0){
	                	sqlCreate.append("(10)");
	            	}else{
	                	sqlCreate.append("(").append(metadata.getColumnlength()).append(")");
	            	}
	            }else if(metadata.getColumntype()==Constants.COLUMNTYPE_DECIMAL){//小数
	            	if(metadata.getColumnlength() == null || metadata.getColumnlength() == 0){
	                	sqlCreate.append("(10,2)");
	            	}else{
	                	sqlCreate.append("(").append(metadata.getColumnlength()).append(",2)");
	            	}
	            }
	            if (!StringUtils.isEmpty(metadata.getDefaultvalue())){
	            	sqlCreate.append(" DEFAULT ").append(metadata.getDefaultvalue());
	            }
	            sqlCreate.append(" COMMENT '").append(metadata.getColumncname()).append("',");
	        }
	        sqlCreate.deleteCharAt(sqlCreate.length() - 1);
	        sqlCreate.append(") DEFAULT CHARACTER SET=utf8 COMMENT='").append(tablecname).append("'");
	        return sqlCreate.toString();
	}

	public ActionResult updateStatus(String databaseid,String status) {
		String[] ids = databaseid.split(",");
		for (String id:ids) {
			DbDatalibrarys dbDatalibrarys = datalibrarysMapper.selectByPrimaryKey(Integer.valueOf(id));
			dbDatalibrarys.setStatus(Integer.valueOf(status));
			datalibrarysMapper.updateByPrimaryKey(dbDatalibrarys);
		}
		return ActionResult.ok();
	}

	public ActionResult getSelfDataList(DataLibrarysManageSearchBean dataLibrarysManageSearchBean,
			List<CustomQueryBean> queryList) {
		if(dataLibrarysManageSearchBean.getLength()==null){
			dataLibrarysManageSearchBean.setLength(10);
		}
		if(dataLibrarysManageSearchBean.getStart()==null){
			dataLibrarysManageSearchBean.setStart(0);
		}
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
			List<MetadatasCustomBean> sysMetaList = Constants.initSysMetaList();
			for (MetadatasCustomBean meta: sysMetaList) {
				metaList.add(meta);
			}
			StringBuffer whereSql = new StringBuffer(" where 1 = 1 ");
			if (dataLibrarysManageSearchBean.getUserId() > 0) {
				whereSql.append(" and creatorid=").append(dataLibrarysManageSearchBean.getUserId());
			}

			List<MetadatasCustomBean> rMetaList = new ArrayList<>();
			String showCol = "";
			for (MetadatasCustomBean metadatasCustomBean : metaList) {
				if (metadatasCustomBean.getSearchshow() == 1) {
					String nameValue = nameValue(metadatasCustomBean.getColumnname(), queryList);
					String startValue = startValue(metadatasCustomBean.getColumnname(), queryList);
					String endValue = endValue(metadatasCustomBean.getColumnname(), queryList);
					switch (metadatasCustomBean.getColumntype()) {
						case Constants.COLUMNTYPE_RADIO:
							if (StringUtils.isNotEmpty(nameValue)){
								whereSql.append(" and db.").append(metadatasCustomBean.getColumnname())
										.append(" = '").append(nameValue)
										.append("' ");
							}
							break;
						case Constants.COLUMNTYPE_CHECKBOX:
							if (StringUtils.isNotEmpty(nameValue)){
								String[] queryarray = nameValue.split(",");
								for (String clsid : queryarray) {
									whereSql.append("and ").append(metadatasCustomBean.getColumnname()).append(" like '%")
											.append(clsid).append("%' ");
								}
							}
							break;
						case Constants.COLUMNTYPE_DATATIME:
							if (StringUtils.isNotEmpty(startValue)){
								whereSql.append(" and db.").append(metadatasCustomBean.getColumnname())
										.append(" >= '").append(startValue + " 00:00:00")
										.append("' ");
							}
							if (StringUtils.isNotEmpty(endValue)){
								whereSql.append(" and db.").append(metadatasCustomBean.getColumnname())
										.append(" < '").append(endValue + " 23:59:59")
										.append("' ");
							}
							break;
						case Constants.COLUMNTYPE_INT:
						case Constants.COLUMNTYPE_DATE:
						case Constants.COLUMNTYPE_DECIMAL:
							if (StringUtils.isNotEmpty(startValue)){
								whereSql.append(" and db.").append(metadatasCustomBean.getColumnname())
										.append(" >= '").append(startValue)
										.append("' ");
							}if (StringUtils.isNotEmpty(endValue)){
							whereSql.append(" and db.").append(metadatasCustomBean.getColumnname())
									.append(" < '").append(endValue)
									.append("' ");
						}
							break;
						default:
							if(StringUtils.isNotEmpty(nameValue)){
								whereSql.append(" and ")
										.append("TRIM(replace(db." + metadatasCustomBean.getColumnname() + ",' ',''))")
										.append(" like '%").append(nameValue.trim().replaceAll(" ", ""))
										.append("%'");
							}
							break;
					}
				}
				if (metadatasCustomBean.getGridshow() == 1) {
					if(metadatasCustomBean.getColumnname().equalsIgnoreCase("creatorId")){
						showCol += "u.RealName AS creatorid,";
					}else if(metadatasCustomBean.getColumnname().equalsIgnoreCase("status")
							||metadatasCustomBean.getColumnname().equalsIgnoreCase("userId")
							||metadatasCustomBean.getColumnname().equalsIgnoreCase("phone")
							||metadatasCustomBean.getColumnname().equalsIgnoreCase("email")
							||metadatasCustomBean.getColumnname().equalsIgnoreCase("LastLoginTime")
							||metadatasCustomBean.getColumnname().equalsIgnoreCase("ModifyTime")){
						showCol += "db."+metadatasCustomBean.getColumnname()+",";
					}else{
						showCol += metadatasCustomBean.getColumnname() + ",";
					}
					if (metadatasCustomBean.getColumntype() == Constants.COLUMNTYPE_RADIO
							|| metadatasCustomBean.getColumntype() == Constants.COLUMNTYPE_CHECKBOX) {
						rMetaList.add(metadatasCustomBean);
					}
				}
			}

			showCol = showCol.substring(0, showCol.length() - 1);
			/*
			 * if(queryList != null){ for (CustomQueryBean query : queryList) {
			 * if(query.getName().equals("status")){ //仅查询没有被删除的数据
			 * whereSql.append(" and status=1"); } } }
			 */

			String sqlCount="select count(1) from " + db.getDatabasename()
					+ " db LEFT JOIN base_managers u on db.creatorid = u.UserID "
					+ whereSql.toString();
			int count = datalibrarysCustomMapper.getResCount(sqlCount);
			String sqlList;
			if (count > 0) {
				StringBuffer ordersql = new StringBuffer(" ");
				List<Order> orderlist = dataLibrarysManageSearchBean.getOrder();
				if (null != orderlist && orderlist.size() > 0) {
					ordersql.append(" order by db.");
					for (Order order : orderlist) {
						if (!StringUtils.isEmpty(order.getColumn())) {
							ordersql.append(order.getColumn()).append(" ").append(order.getDir()).append(" ,");
						}else{
							ordersql.append("seqid desc,");
						}
					}
				}

				if (String.valueOf(ordersql).contains(",")) {
					ordersql = ordersql.deleteCharAt(ordersql.length() - 1);
				} else {
					ordersql = new StringBuffer(" ");
				}
				sqlList = "select " + showCol + " from " + db.getDatabasename()
						+ " db LEFT JOIN base_managers u on db.creatorid = u.UserID "
						+ whereSql.toString() + " " + ordersql.toString() + " limit "
						+ dataLibrarysManageSearchBean.getStart() + "," + dataLibrarysManageSearchBean.getLength();
				List<LinkedHashMap<String, Object>> resList = datalibrarysCustomMapper.getResList(sqlList);

				List<LinkedHashMap<String, Object>> resultList = new ArrayList<>();

				if (rMetaList != null && rMetaList.size() > 0) {
					Map<String, List> list = new HashMap<>();
					for (MetadatasCustomBean metaCustom : rMetaList) {
						switch (metaCustom.getColumnsource()) {
						case Constants.COlUMNSOURCE_DIC:
							BaseDicsExample dicExample = new BaseDicsExample();
							dicExample.createCriteria().andDictypeEqualTo(metaCustom.getColumntyperule())
									.andIsdictypeEqualTo(0);
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
							nexusExample.createCriteria().andMdbfieldEqualTo(metaCustom.getColumnname())
									.andMdbnameEqualTo(dataLibrarysManageSearchBean.getDatabaseName());
							List<DbLibrarynexus> nexusList = librarynexusMapper.selectByExample(nexusExample);
							List<List<LinkedHashMap<String, Object>>>nexusResList = new ArrayList<>();
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
							Map<String, Object> resMap =  resList.get(i);
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
							List<?> obj = list.get(metaCustomBean.getColumnname());
							String str = "";
							String valueStr = value.toString();
							for (Object v : obj) {
								if (v.getClass().equals(BaseDics.class)) {
									BaseDics dic = (BaseDics) v;
									if (valueStr.contains(",")) {// 多个字典
										String emparry[] = valueStr.split(",");
										for (String string : emparry) {
											if (string.equals(dic.getDicvalue())) {
												str =str+ dic.getDicname() + ",";
												break;
											}
										}
									} else if (valueStr.equals(dic.getDicvalue())) {
										str = str+dic.getDicname() + ",";
									}
								} else if (v.getClass().equals(ClassesCustomBean.class)) {
									ClassesCustomBean cls = (ClassesCustomBean) v;
									if (valueStr.contains(",")) {// 多个分类
										String emparry[] = valueStr.split(",");
										for (String string : emparry) {
											if (string.equals(cls.getClassid().toString())) {
												str += cls.getClassname() + ",";
												break;
											}
										}
									} else {
										if (valueStr.equals(cls.getClassid().toString())) {
											str += cls.getClassname() + ",";
										}
									}

								} else {
									if (v != null) {
										List<LinkedHashMap<String, Object>> nexusL = (List) v;
										if (nexusL != null && nexusL.size() > 0) {
											for (LinkedHashMap<String, Object> nexusMap : nexusL) {
												if (nexusMap != null && nexusMap.size() > 1) {
													Collection<Object> mapValue = nexusMap.values();
													Object[] mapValueArr = mapValue.toArray();
													if (valueStr.contains(",")) {
														String[] tpmarray = valueStr.split(",");
														for (String tmpstr : tpmarray) {
															if (tmpstr.equals(mapValueArr[0].toString())) {
																str += mapValueArr[1] + ",";
															}
														}
													} else {
														if (valueStr.equals(mapValueArr[0].toString())) {
															str += mapValueArr[1] + ",";
														}
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
							object.put(metaCustomBean.getColumnname() + "Name", str);
						}
						resultList.add(object);
					}
				}

				listInfo.setLength(count);
				listInfo.setList(resultList);
			}
		}
		return ActionResult.ok(listInfo);
	}

	public static String nameValue(String name, List<CustomQueryBean> queryList) {
		for (CustomQueryBean customQueryBean : queryList) {
			if (customQueryBean.getName().equals(name)) {
				return customQueryBean.getNameValue();
			}
		}
		return null;
	}
	public static String startValue(String name, List<CustomQueryBean> queryList) {
		for (CustomQueryBean customQueryBean : queryList) {
			if (customQueryBean.getName().equals(name)) {
				return customQueryBean.getStartValue();
			}
		}
		return null;
	}
	public static String endValue(String name, List<CustomQueryBean> queryList) {
		for (CustomQueryBean customQueryBean : queryList) {
			if (customQueryBean.getName().equals(name)) {
				return customQueryBean.getEndValue();
			}
		}
		return null;
	}

	public ActionResult updateEditableField(Integer seqid, String field, String value, String databasename,String mouldId, HttpServletRequest request) {
		String sql = "update " + databasename + " set " + field + "='" + value + "' where seqid=" + seqid;
		int count = datalibrarysCustomMapper.editRes(sql);
		if (count > 0) {
			BaseManagers loginUser = (BaseManagers) request.getSession().getAttribute("USER_VALUE_OBJECT");
			BaseMenusExample example=new BaseMenusExample();
			example.createCriteria().andPathLike("%mouldId="+mouldId);
			List<BaseMenus> menus = menusMapper.selectByExample(example);
			BaseLogs logs=new BaseLogs();
			logs.setCreatetime(new Date());
			logs.setLogdetail("修改了"+menus.get(0).getMenuname()+"编号为"+seqid+"的数据");
			logs.setCreator(loginUser.getUserid());
			logs.setLogtype(Integer.valueOf(LogType.OPERATION_2));
			logsMapper.insert(logs);
			return ActionResult.ok();
		}
		return ActionResult.build(400, "操作失败!");
	}

	@Override
	public ActionResult getSelfDbInfo(Integer seqId, String databaseName) {
		StringBuffer sql = new StringBuffer("select * from ");
		sql.append(databaseName).append(" where seqid=").append(seqId);
		return ActionResult.ok(datalibrarysCustomMapper.getResList(sql.toString()));
	}

	@Override
	public ActionResult addRes(DataLibrarysManageSearchBean searchBean, QueryList queryList, HttpServletRequest request) {
		List<CustomQueryBean> beanlist = queryList.getQueryList();
		CustomQueryBean user = new CustomQueryBean();
		user.setName("creatorid");
		BaseManagers loginUser = (BaseManagers) request.getSession().getAttribute("USER_VALUE_OBJECT");
		user.setNameValue(loginUser.getUserid().toString());
		beanlist.add(user);
		CustomQueryBean status = new CustomQueryBean();
		status.setName("status");
		status.setNameValue("1");
		beanlist.add(status);
		StringBuffer nameSql = new StringBuffer();
		StringBuffer valueSql = new StringBuffer();
		for (CustomQueryBean customQueryBean : beanlist) {
			if (customQueryBean != null && (customQueryBean.getName() != null)) {
				if(StringUtils.isNotEmpty(customQueryBean.getNameValue())){
					nameSql.append(customQueryBean.getName()).append(",");
					valueSql.append("'").append(customQueryBean.getNameValue()).append("',");
				}else{
					nameSql.append(customQueryBean.getName()).append(",");
					valueSql.append("NULL,");
				}
			}
		}
		String nameSqlStr = nameSql.substring(0, nameSql.length() - 1);
		String valueSqlStr = valueSql.substring(0, valueSql.length() - 1);
		String sql = "insert into " + searchBean.getDatabaseName() + " (" + nameSqlStr + ") values(" + valueSqlStr+ ")";
		int count = datalibrarysCustomMapper.alterTable(sql);
		if(count>0){
			String mouldId = searchBean.getMouldId();
			BaseMenusExample example=new BaseMenusExample();
			example.createCriteria().andPathLike("%mouldId="+mouldId);
			List<BaseMenus> menus = menusMapper.selectByExample(example);
			BaseLogs logs=new BaseLogs();
			logs.setCreatetime(new Date());
			logs.setLogdetail("新增了"+menus.get(0).getMenuname()+"1条数据");
			logs.setCreator(loginUser.getUserid());
			logs.setLogtype(Integer.valueOf(LogType.OPERATION_2));
			logsMapper.insert(logs);
			return ActionResult.ok();
		}
		return ActionResult.build(400, "操作失败！");
	}

	@Override
	public ActionResult updateRes(DataLibrarysManageSearchBean searchBean, QueryList queryList,
			HttpServletRequest request) {
		StringBuffer nameSql = new StringBuffer(); 
		List<CustomQueryBean> beanlist = queryList.getQueryList();
		CustomQueryBean user = new CustomQueryBean();
		user.setName("creatorid");
		BaseManagers loginUser = (BaseManagers) request.getSession().getAttribute("USER_VALUE_OBJECT");
		user.setNameValue(loginUser.getUserid().toString());
		beanlist.add(user);
		String databaseName = searchBean.getDatabaseName();
		for (CustomQueryBean customQueryBean : beanlist) {
			if(customQueryBean != null && (customQueryBean.getName() != null)){
				if(StringUtils.isNotEmpty(customQueryBean.getNameValue())){
					nameSql.append(customQueryBean.getName()).append("='").append(customQueryBean.getNameValue()).append("',");
				}else{
					nameSql.append(customQueryBean.getName()).append("=NULL,");
				}
			}
		}
		String nameSqlStr = nameSql.substring(0, nameSql.length() - 1);
		String sql = "update " + databaseName + " set " + nameSqlStr + " where seqid=" + searchBean.getSeqId();
		int count = datalibrarysCustomMapper.alterTable(sql);
		if(count>0){
			String mouldId = searchBean.getMouldId();
			BaseMenusExample example=new BaseMenusExample();
			example.createCriteria().andPathLike("%mouldId="+mouldId);
			List<BaseMenus> menus = menusMapper.selectByExample(example);
			BaseLogs logs=new BaseLogs();
			logs.setCreatetime(new Date());
			logs.setLogdetail("修改了"+menus.get(0).getMenuname()+"1条数据");
			logs.setCreator(loginUser.getUserid());
			logs.setLogtype(Integer.valueOf(LogType.OPERATION_3));
			logsMapper.insert(logs);
			return ActionResult.ok();
		}
		return ActionResult.build(400, "操作失败！");
	}

	@Override
	public ActionResult delResBatch(DataLibrarysManageSearchBean searchBean,HttpServletRequest request) {
		String resIds = searchBean.getResIds();
		String databaseName = searchBean.getDatabaseName();
		String mouldId = searchBean.getMouldId();
		String status = searchBean.getStatus();
		List<String> resIdList = Arrays.asList(resIds.split(","));
		StringBuffer delSql = new StringBuffer("update "); 
		delSql.append(databaseName).append(" set status = ").append(status).append(" where seqid in(");
		for (String resId : resIdList) {
			if(!StringUtils.isEmpty(resId)){
				delSql.append(resId).append(",");
			}
		}
		delSql.append(0).append(")");
		int count = datalibrarysCustomMapper.alterTable(delSql.toString());
		if(count>0){
			BaseManagers loginUser = (BaseManagers) request.getSession().getAttribute("USER_VALUE_OBJECT");
			BaseMenusExample example=new BaseMenusExample();
			example.createCriteria().andPathLike("%mouldId="+mouldId);
			List<BaseMenus> menus = menusMapper.selectByExample(example);
			BaseLogs logs=new BaseLogs();
			logs.setCreatetime(new Date());
			logs.setLogdetail("删除了"+menus.get(0).getMenuname()+resIdList.size()+"条数据");
			logs.setCreator(loginUser.getUserid());
			logs.setLogtype(Integer.valueOf(LogType.OPERATION_4));
			logsMapper.insert(logs);
			return ActionResult.ok();
		}
		return ActionResult.build(400, "操作失败！");
	}

	@Override
	public ActionResult delBatch(String databaseIds) {
		String[] ids = databaseIds.split(",");
		for (String id : ids) {
			DbDatalibrarys datalibrarys = datalibrarysMapper.selectByPrimaryKey(Integer.valueOf(id));
			sqlCustomMapper.dropTable(datalibrarys.getDatabasename());
			int count = datalibrarysMapper.deleteByPrimaryKey(Integer.valueOf(id));
			if(count>0){
				return ActionResult.ok();
			}
		}
		return ActionResult.build(400, "操作失败！");
	}
}
