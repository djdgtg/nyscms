package com.retech.nyscms.controller;

import com.retech.nyscms.aspect.LogAnnotation;
import com.retech.nyscms.aspect.LogType;
import com.retech.nyscms.entity.custom.DataLibrarysManageSearchBean;
import com.retech.nyscms.entity.custom.DatalibrarysCustomBean;
import com.retech.nyscms.entity.custom.QueryList;
import com.retech.nyscms.service.DatalibrarysService;
import com.retech.nyscms.utils.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
@RestController
@RequestMapping("/datalibrarys")
public class DatalibrarysController {

    @Autowired
    private DatalibrarysService datalibrarysService;

    @RequestMapping("/listCustom")
    @LogAnnotation(logtype = LogType.OPERATION_5, logdetail = "资源库查看")
    public ActionResult listCustom(DataLibrarysManageSearchBean searchBean) {
        return datalibrarysService.listCustom(searchBean);
    }

    @RequestMapping("/list")
    @LogAnnotation(logtype = LogType.OPERATION_5, logdetail = "资源库查看")
    public ActionResult list(String mouldId) {
        return datalibrarysService.list(mouldId);
    }

    @RequestMapping("/add")
    @LogAnnotation(logtype = LogType.OPERATION_2, logdetail = "新增资源库")
    public ActionResult add(DatalibrarysCustomBean customBean) {
        if (datalibrarysService.checkUniqueness(customBean)) {
            return ActionResult.build(400, "该资源库已存在！");
        }
        return datalibrarysService.add(customBean);
    }

    @RequestMapping("/update")
    @LogAnnotation(logtype = LogType.OPERATION_3, logdetail = "更新资源库")
    public ActionResult update(DatalibrarysCustomBean customBean) {
        if (datalibrarysService.checkUniqueness(customBean)) {
            return ActionResult.build(400, "该资源库已存在！");
        }
        return datalibrarysService.update(customBean);
    }

    @RequestMapping("/updateStatus")
    @LogAnnotation(logtype = LogType.OPERATION_2, logdetail = "更新资源库状态")
    public ActionResult updateStatus(String databaseid, String status) {
        return datalibrarysService.updateStatus(databaseid, status);
    }

    @RequestMapping("/getSelfDataList")
    public ActionResult getSelfDataList(DataLibrarysManageSearchBean searchBean, QueryList queryList) {
        return datalibrarysService.getSelfDataList(searchBean, queryList.getQueryList());
    }

    @RequestMapping("/updateEditableField")
    public ActionResult updateEditableField(Integer seqid,
                                            String field, String value, String databasename, String mouldId, HttpServletRequest request) {
        return datalibrarysService.updateEditableField(seqid, field, value, databasename, mouldId, request);
    }

    @RequestMapping("/getSelfDbInfo")
    public ActionResult getSelfDbInfo(Integer seqId, String databaseName) {
        return datalibrarysService.getSelfDbInfo(seqId, databaseName);
    }

    @RequestMapping("/addRes")
    public ActionResult addRes(DataLibrarysManageSearchBean searchBean, QueryList queryList, HttpServletRequest request) throws Exception {
        return datalibrarysService.addRes(searchBean, queryList, request);
    }

    @RequestMapping("/updateRes")
    public ActionResult updateRes(DataLibrarysManageSearchBean searchBean, QueryList queryList, HttpServletRequest request) throws Exception {
        return datalibrarysService.updateRes(searchBean, queryList, request);
    }


    @RequestMapping("/delResBatch")
    public ActionResult delResBatch(DataLibrarysManageSearchBean searchBean, HttpServletRequest request) {
        return datalibrarysService.delResBatch(searchBean, request);
    }

    @RequestMapping("/delBatch")
    @LogAnnotation(logtype = LogType.OPERATION_4, logdetail = "删除资源库")
    public ActionResult delBatch(String databaseIds) {
        return datalibrarysService.delBatch(databaseIds);
    }

}
