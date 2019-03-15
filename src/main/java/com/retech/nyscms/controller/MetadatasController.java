package com.retech.nyscms.controller;

import com.retech.nyscms.entity.DbMetadatas;
import com.retech.nyscms.entity.custom.MetadatasManageSearchBean;
import com.retech.nyscms.service.MetadatasService;
import com.retech.nyscms.service.PersonalService;
import com.retech.nyscms.utils.ActionResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
@RestController
@RequestMapping("/metadatas")
public class MetadatasController {

    @Autowired
    private MetadatasService metadatasService;

    @Autowired
    private PersonalService personalService;

    @RequestMapping("/listCustom")
    public ActionResult listCustom(String mouldId) {
        return metadatasService.listCustom(mouldId);
    }

    @RequestMapping("/list")
    public ActionResult list(Integer mouldId) {
        return metadatasService.list(mouldId);
    }

    @RequestMapping("/add")
    public ActionResult add(DbMetadatas metadatas) {
        if (metadatasService.checkUniqueness(metadatas)) {
            return ActionResult.build(400, "该元数据已存在！");
        }
        return metadatasService.add(metadatas);
    }

    @RequestMapping("/update")
    public ActionResult update(DbMetadatas metadatas) {
        if (metadatasService.checkUniqueness(metadatas)) {
            return ActionResult.build(400, "该元数据已存在！");
        }
        return metadatasService.update(metadatas);
    }

    @RequestMapping("/delBatch")
    public ActionResult delBatch(String metadataIds) {
        return metadatasService.delBatch(metadataIds);
    }

    @RequestMapping("/listByDbName")
    public ActionResult listByDbName(String databaseName) {
        return metadatasService.listByDbName(databaseName);
    }

    @RequestMapping("/getMetadataByField")
    public ActionResult getMetadataByField(MetadatasManageSearchBean searchBean, String tablecname,
                                           String type, HttpServletRequest request, HttpServletResponse response) {
        List<DbMetadatas> list = metadatasService.getMetadataByField(searchBean);
        //如果是下载导入模板的请求 则输出一个文件过去
        if (!StringUtils.isEmpty(searchBean.getFieldName()) && searchBean.getFieldName().equals("ImportAndExportShow")) {
            personalService.exportModelExcel(list, response, request, tablecname, type, searchBean.getDatabaseName(), searchBean.getMouldId());
            return null;
        }
        return ActionResult.ok(list);
    }
}
