package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontKeyword;
import com.retech.nyscms.entity.FrontKeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontKeywordMapper {
    int countByExample(FrontKeywordExample example);

    int deleteByExample(FrontKeywordExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontKeyword record);

    int insertSelective(FrontKeyword record);

    List<FrontKeyword> selectByExample(FrontKeywordExample example);

    FrontKeyword selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontKeyword record, @Param("example") FrontKeywordExample example);

    int updateByExample(@Param("record") FrontKeyword record, @Param("example") FrontKeywordExample example);

    int updateByPrimaryKeySelective(FrontKeyword record);

    int updateByPrimaryKey(FrontKeyword record);
}