package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserBooksOwned;
import com.retech.nyscms.entity.FrontUserBooksOwnedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserBooksOwnedMapper {
    int countByExample(FrontUserBooksOwnedExample example);

    int deleteByExample(FrontUserBooksOwnedExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontUserBooksOwned record);

    int insertSelective(FrontUserBooksOwned record);

    List<FrontUserBooksOwned> selectByExample(FrontUserBooksOwnedExample example);

    FrontUserBooksOwned selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontUserBooksOwned record, @Param("example") FrontUserBooksOwnedExample example);

    int updateByExample(@Param("record") FrontUserBooksOwned record, @Param("example") FrontUserBooksOwnedExample example);

    int updateByPrimaryKeySelective(FrontUserBooksOwned record);

    int updateByPrimaryKey(FrontUserBooksOwned record);
}