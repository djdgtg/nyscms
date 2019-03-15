package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontBookCategory;
import com.retech.nyscms.entity.FrontBookCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontBookCategoryMapper {
    int countByExample(FrontBookCategoryExample example);

    int deleteByExample(FrontBookCategoryExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontBookCategory record);

    int insertSelective(FrontBookCategory record);

    List<FrontBookCategory> selectByExample(FrontBookCategoryExample example);

    FrontBookCategory selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontBookCategory record, @Param("example") FrontBookCategoryExample example);

    int updateByExample(@Param("record") FrontBookCategory record, @Param("example") FrontBookCategoryExample example);

    int updateByPrimaryKeySelective(FrontBookCategory record);

    int updateByPrimaryKey(FrontBookCategory record);
}