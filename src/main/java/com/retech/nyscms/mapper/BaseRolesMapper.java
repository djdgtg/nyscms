package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.BaseRoles;
import com.retech.nyscms.entity.BaseRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseRolesMapper {
    int countByExample(BaseRolesExample example);

    int deleteByExample(BaseRolesExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(BaseRoles record);

    int insertSelective(BaseRoles record);

    List<BaseRoles> selectByExample(BaseRolesExample example);

    BaseRoles selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") BaseRoles record, @Param("example") BaseRolesExample example);

    int updateByExample(@Param("record") BaseRoles record, @Param("example") BaseRolesExample example);

    int updateByPrimaryKeySelective(BaseRoles record);

    int updateByPrimaryKey(BaseRoles record);
}