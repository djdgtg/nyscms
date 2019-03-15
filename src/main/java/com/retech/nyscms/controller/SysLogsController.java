package com.retech.nyscms.controller;

import com.retech.nyscms.aspect.LogAnnotation;
import com.retech.nyscms.aspect.LogType;
import com.retech.nyscms.entity.custom.CustomSearchBean;
import com.retech.nyscms.entity.custom.SysLogsManageSearchBean;
import com.retech.nyscms.service.SysLogsService;
import com.retech.nyscms.utils.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
@RestController
@RequestMapping("/syslogs")
public class SysLogsController {

    @Autowired
    private SysLogsService SysLogsService;

    @RequestMapping("/list")
    @LogAnnotation(logtype = LogType.OPERATION_5, logdetail = "查询系统日志")
    public ActionResult list(SysLogsManageSearchBean sysLogsManageSearchBean, CustomSearchBean customSearchBean) {
        return SysLogsService.list(sysLogsManageSearchBean, customSearchBean);
    }
}
