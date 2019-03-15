package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserReadProgress;
import com.retech.nyscms.entity.FrontUserReadProgressExample;
import com.retech.nyscms.entity.FrontUserReadProgressKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserReadProgressMapper {
    int countByExample(FrontUserReadProgressExample example);

    int deleteByExample(FrontUserReadProgressExample example);

    int deleteByPrimaryKey(FrontUserReadProgressKey key);

    int insert(FrontUserReadProgress record);

    int insertSelective(FrontUserReadProgress record);

    List<FrontUserReadProgress> selectByExample(FrontUserReadProgressExample example);

    FrontUserReadProgress selectByPrimaryKey(FrontUserReadProgressKey key);

    int updateByExampleSelective(@Param("record") FrontUserReadProgress record, @Param("example") FrontUserReadProgressExample example);

    int updateByExample(@Param("record") FrontUserReadProgress record, @Param("example") FrontUserReadProgressExample example);

    int updateByPrimaryKeySelective(FrontUserReadProgress record);

    int updateByPrimaryKey(FrontUserReadProgress record);
}