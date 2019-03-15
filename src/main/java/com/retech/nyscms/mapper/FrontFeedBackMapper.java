package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontFeedBack;
import com.retech.nyscms.entity.FrontFeedBackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontFeedBackMapper {
    int countByExample(FrontFeedBackExample example);

    int deleteByExample(FrontFeedBackExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontFeedBack record);

    int insertSelective(FrontFeedBack record);

    List<FrontFeedBack> selectByExample(FrontFeedBackExample example);

    FrontFeedBack selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontFeedBack record, @Param("example") FrontFeedBackExample example);

    int updateByExample(@Param("record") FrontFeedBack record, @Param("example") FrontFeedBackExample example);

    int updateByPrimaryKeySelective(FrontFeedBack record);

    int updateByPrimaryKey(FrontFeedBack record);
}