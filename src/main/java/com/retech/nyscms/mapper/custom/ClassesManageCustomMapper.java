package com.retech.nyscms.mapper.custom;

import com.retech.nyscms.entity.BaseClasses;
import com.retech.nyscms.entity.BaseClassesExample;
import com.retech.nyscms.entity.custom.ClassesCustomBean;

import java.util.List;


/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
public interface ClassesManageCustomMapper {

    List<ClassesCustomBean> selectByExample(BaseClassesExample example);

    int countByExample(BaseClassesExample example);

    int checkUniqueness(BaseClasses baseClasses);

    int deleteBatch(List<String> classids);
}
