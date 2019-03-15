package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserLoginDay;
import com.retech.nyscms.entity.FrontUserLoginDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserLoginDayMapper {
    int countByExample(FrontUserLoginDayExample example);

    int deleteByExample(FrontUserLoginDayExample example);

    int deleteByPrimaryKey(Integer loginid);

    int insert(FrontUserLoginDay record);

    int insertSelective(FrontUserLoginDay record);

    List<FrontUserLoginDay> selectByExample(FrontUserLoginDayExample example);

    FrontUserLoginDay selectByPrimaryKey(Integer loginid);

    int updateByExampleSelective(@Param("record") FrontUserLoginDay record, @Param("example") FrontUserLoginDayExample example);

    int updateByExample(@Param("record") FrontUserLoginDay record, @Param("example") FrontUserLoginDayExample example);

    int updateByPrimaryKeySelective(FrontUserLoginDay record);

    int updateByPrimaryKey(FrontUserLoginDay record);
}