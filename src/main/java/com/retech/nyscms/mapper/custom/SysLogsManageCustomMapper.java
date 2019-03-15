package com.retech.nyscms.mapper.custom;

import com.retech.nyscms.entity.BaseLogs;

import java.util.HashMap;
import java.util.List;


/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
public interface SysLogsManageCustomMapper {

    List<BaseLogs> selectByExample(HashMap<String, Object> map);

    int countByExample(HashMap<String, Object> map);
}
