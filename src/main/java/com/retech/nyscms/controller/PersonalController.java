package com.retech.nyscms.controller;

import com.retech.nyscms.aspect.LogAnnotation;
import com.retech.nyscms.aspect.LogType;
import com.retech.nyscms.entity.custom.DataLibrarysManageSearchBean;
import com.retech.nyscms.entity.custom.QueryList;
import com.retech.nyscms.service.PersonalService;
import com.retech.nyscms.utils.ActionResult;
import com.retech.nyscms.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;


/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
@RestController
@RequestMapping("/personal")
public class PersonalController {

    @Autowired
    private PersonalService personalService;

    @RequestMapping("/uploadFile")
    @LogAnnotation(logtype = LogType.OPERATION_7, logdetail = "文件上传")
    public ActionResult uploadFile(MultipartFile file) {
        return personalService.uploadFile(file);
    }

    @RequestMapping("/uploadkindeditor")
    @LogAnnotation(logtype = LogType.OPERATION_7, logdetail = "富文本图片上传")
    public String uploadkindeditor(MultipartFile file) {
        HashMap<String, Object> result = personalService.uploadkindeditor(file);
        return JsonUtils.objectToJson(result);
    }

    @RequestMapping("/importFile")
    @LogAnnotation(logtype = LogType.OPERATION_7, logdetail = "excel数据导入")
    public ActionResult importFile(MultipartFile file, DataLibrarysManageSearchBean searchBean, HttpServletRequest request) {
        return personalService.importFile(file, searchBean, request);
    }

    @RequestMapping("/updateResByFiledBatch")
    public ActionResult updateResByFiledBatch(DataLibrarysManageSearchBean searchBean, String fieldval, String fieldname, HttpServletRequest request) {
        return personalService.updateResByFiledBatch(searchBean, fieldval, fieldname, request);
    }


    @RequestMapping("/checkunique")
    public String checkunique(String columnname, Integer seqid, Integer index, QueryList queryList, String databasename) {
        String value = queryList.getQueryList().get(index).getNameValue();
        boolean result = personalService.checkunique(columnname, value, seqid, databasename);
        HashMap<String, Object> map = new HashMap<>();
        map.put("valid", !result);
        return JsonUtils.objectToJson(map);
    }

    @RequestMapping("/getfileServerUrl")
    public String getfileServerUrl() {
        return personalService.getfileServerUrl();
    }

    @RequestMapping("/platformdataByType")
    public List<Object[]> platformdataByType(String type) {
        return personalService.platformdataByType(type);
    }

    @RequestMapping("/listfillminusType")
    public ActionResult listfillminusType() {
        return personalService.listfillminusType();
    }

    @RequestMapping("/listthemeid")
    public ActionResult listthemeid() {
        return personalService.listthemeid();
    }

    @RequestMapping("/listuserid")
    public ActionResult listuserid() {
        return personalService.listuserid();
    }

    @RequestMapping("/authorization")
    public ActionResult authorization(DataLibrarysManageSearchBean searchBean,String starttime,String endtime,HttpServletRequest request) {
        return personalService.authorization(searchBean,starttime,endtime,request);
    }

    @RequestMapping("/sendMessage")
    public ActionResult sendMessage(String resIds,HttpServletRequest request) {
        return personalService.sendMessage(resIds,request);
    }

    @RequestMapping("/fankui")
    public ActionResult fankui(String resIds,Integer scorenum) {
        return personalService.fankui(resIds,scorenum);
    }

    @RequestMapping("/userbaseByType")
    public List<Object[]> userbaseByType(Integer type) {
        return personalService.userbaseByType(type);
    }

    @RequestMapping("/userreadByType")
    public List<Object[]> userreadByType(Integer userid,Integer type,String starttime,String endtime) {
        return personalService.userreadByType(userid,type,starttime,endtime);
    }

    @RequestMapping("/getUserlogin")
    public List<Object[]> getUserlogin(Integer userid,Integer type) {
        return personalService.getUserlogin(userid,type);
    }

    @RequestMapping("/getUserexpend")
    public List<Object[]> getUserexpend(Integer userid,Integer type) {
        return personalService.getUserexpend(userid,type);
    }

    @RequestMapping("/genQrcode")
    public ActionResult genQrcode(Integer seqid) {
        return personalService.genQrcode(seqid);
    }

    @RequestMapping("/exportQrcode")
    public void exportQrcode(Integer seqid,HttpServletRequest request, HttpServletResponse response) {
        personalService.exportQrcode(seqid,request,response);
    }
}
