package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserLogin;
import com.retech.nyscms.entity.FrontUserLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserLoginMapper {
    int countByExample(FrontUserLoginExample example);

    int deleteByExample(FrontUserLoginExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontUserLogin record);

    int insertSelective(FrontUserLogin record);

    List<FrontUserLogin> selectByExample(FrontUserLoginExample example);

    FrontUserLogin selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontUserLogin record, @Param("example") FrontUserLoginExample example);

    int updateByExample(@Param("record") FrontUserLogin record, @Param("example") FrontUserLoginExample example);

    int updateByPrimaryKeySelective(FrontUserLogin record);

    int updateByPrimaryKey(FrontUserLogin record);
}