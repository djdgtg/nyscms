package com.retech.nyscms.mapper.custom;

import com.retech.nyscms.entity.BaseDics;

import java.util.List;

/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
public interface DicsManageCustomMapper {

    int checkUniqueness(BaseDics baseDics);

    int deleteBatch(List<String> classids);

    int checkUniquenessByTypeOrName(BaseDics baseDics);
}
