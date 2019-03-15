package com.retech.nyscms.service;

import com.retech.nyscms.entity.BaseLogs;
import com.retech.nyscms.entity.custom.CustomSearchBean;
import com.retech.nyscms.entity.custom.SysLogsManageSearchBean;
import com.retech.nyscms.utils.ActionResult;

/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
public interface SysLogsService {

    void insert(BaseLogs log);

    ActionResult list(SysLogsManageSearchBean sysLogsManageSearchBean, CustomSearchBean customSearchBean);

}
