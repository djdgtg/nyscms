package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserVerifi;
import com.retech.nyscms.entity.FrontUserVerifiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserVerifiMapper {
    int countByExample(FrontUserVerifiExample example);

    int deleteByExample(FrontUserVerifiExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontUserVerifi record);

    int insertSelective(FrontUserVerifi record);

    List<FrontUserVerifi> selectByExample(FrontUserVerifiExample example);

    FrontUserVerifi selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontUserVerifi record, @Param("example") FrontUserVerifiExample example);

    int updateByExample(@Param("record") FrontUserVerifi record, @Param("example") FrontUserVerifiExample example);

    int updateByPrimaryKeySelective(FrontUserVerifi record);

    int updateByPrimaryKey(FrontUserVerifi record);
}