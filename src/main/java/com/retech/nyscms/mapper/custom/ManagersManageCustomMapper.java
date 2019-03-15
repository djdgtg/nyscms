package com.retech.nyscms.mapper.custom;

import com.retech.nyscms.entity.BaseManagers;
import com.retech.nyscms.entity.BaseManagersExample;
import com.retech.nyscms.entity.custom.ManagersCustomBean;
import com.retech.nyscms.entity.custom.ManagersManageSearchBean;

import java.util.List;
import java.util.Map;

/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
public interface ManagersManageCustomMapper {

    int checkUniqueness(BaseManagers baseManagers);

    int insertSelective(BaseManagers record);

    int countByExample(BaseManagersExample example);

    int deleteBatch(List<String> managerids);

    int updateBatch(Map<String, Object> record);

    List<ManagersCustomBean> listManagersCustomBean(ManagersManageSearchBean managers);
}
