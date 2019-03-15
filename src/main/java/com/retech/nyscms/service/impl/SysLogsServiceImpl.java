package com.retech.nyscms.service.impl;

import com.retech.nyscms.entity.BaseLogs;
import com.retech.nyscms.entity.custom.CustomSearchBean;
import com.retech.nyscms.entity.custom.PageInfo;
import com.retech.nyscms.entity.custom.SysLogsManageSearchBean;
import com.retech.nyscms.mapper.BaseLogsMapper;
import com.retech.nyscms.mapper.custom.SysLogsManageCustomMapper;
import com.retech.nyscms.service.SysLogsService;
import com.retech.nyscms.utils.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
@Service
public class SysLogsServiceImpl implements SysLogsService {

    @Autowired
    private BaseLogsMapper logsMapper;

    @Autowired
    private SysLogsManageCustomMapper sysLogsCustomMapper;

    @Override
    public void insert(BaseLogs log) {
        logsMapper.insert(log);
    }

    @Override
    public ActionResult list(SysLogsManageSearchBean sysLogsManageSearchBean, CustomSearchBean customSearchBean) {
        PageInfo pageInfo = new PageInfo();
        HashMap<String, Object> map = new HashMap<>();
        map.put("logType", sysLogsManageSearchBean.getLogType());
        map.put("startTime", sysLogsManageSearchBean.getStartTime());
        map.put("endTime", sysLogsManageSearchBean.getEndTime());
        map.put("userName", sysLogsManageSearchBean.getUserName());
        int count = sysLogsCustomMapper.countByExample(map);
        map.put("start", customSearchBean.getStart());
        map.put("length", customSearchBean.getLength());
        List<BaseLogs> list = sysLogsCustomMapper.selectByExample(map);
        pageInfo.setRows(list);
        pageInfo.setTotal(count);
        return ActionResult.ok(pageInfo);
    }

}
