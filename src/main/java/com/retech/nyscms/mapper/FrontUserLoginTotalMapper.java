package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserLoginTotal;
import com.retech.nyscms.entity.FrontUserLoginTotalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserLoginTotalMapper {
    int countByExample(FrontUserLoginTotalExample example);

    int deleteByExample(FrontUserLoginTotalExample example);

    int deleteByPrimaryKey(Integer loginid);

    int insert(FrontUserLoginTotal record);

    int insertSelective(FrontUserLoginTotal record);

    List<FrontUserLoginTotal> selectByExample(FrontUserLoginTotalExample example);

    FrontUserLoginTotal selectByPrimaryKey(Integer loginid);

    int updateByExampleSelective(@Param("record") FrontUserLoginTotal record, @Param("example") FrontUserLoginTotalExample example);

    int updateByExample(@Param("record") FrontUserLoginTotal record, @Param("example") FrontUserLoginTotalExample example);

    int updateByPrimaryKeySelective(FrontUserLoginTotal record);

    int updateByPrimaryKey(FrontUserLoginTotal record);
}