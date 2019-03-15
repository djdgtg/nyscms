package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.BaseMenus;
import com.retech.nyscms.entity.BaseMenusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMenusMapper {
    int countByExample(BaseMenusExample example);

    int deleteByExample(BaseMenusExample example);

    int deleteByPrimaryKey(Integer menuid);

    int insert(BaseMenus record);

    int insertSelective(BaseMenus record);

    List<BaseMenus> selectByExample(BaseMenusExample example);

    BaseMenus selectByPrimaryKey(Integer menuid);

    int updateByExampleSelective(@Param("record") BaseMenus record, @Param("example") BaseMenusExample example);

    int updateByExample(@Param("record") BaseMenus record, @Param("example") BaseMenusExample example);

    int updateByPrimaryKeySelective(BaseMenus record);

    int updateByPrimaryKey(BaseMenus record);
}