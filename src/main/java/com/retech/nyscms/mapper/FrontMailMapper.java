package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontMail;
import com.retech.nyscms.entity.FrontMailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontMailMapper {
    int countByExample(FrontMailExample example);

    int deleteByExample(FrontMailExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontMail record);

    int insertSelective(FrontMail record);

    List<FrontMail> selectByExample(FrontMailExample example);

    FrontMail selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontMail record, @Param("example") FrontMailExample example);

    int updateByExample(@Param("record") FrontMail record, @Param("example") FrontMailExample example);

    int updateByPrimaryKeySelective(FrontMail record);

    int updateByPrimaryKey(FrontMail record);
}