package com.retech.nyscms.mapper.custom;

import com.retech.nyscms.entity.BaseMenus;
import com.retech.nyscms.entity.BaseRoles;

import java.util.List;


/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
public interface RolesManageCustomMapper {

    int checkUniqueness(BaseRoles baseRoles);

    int deleteBatch(List<String> roleids);

    List<BaseMenus> getRoleMenus(Integer roleId);
}
