package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontReadHistoryShare;
import com.retech.nyscms.entity.FrontReadHistoryShareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontReadHistoryShareMapper {
    int countByExample(FrontReadHistoryShareExample example);

    int deleteByExample(FrontReadHistoryShareExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontReadHistoryShare record);

    int insertSelective(FrontReadHistoryShare record);

    List<FrontReadHistoryShare> selectByExample(FrontReadHistoryShareExample example);

    FrontReadHistoryShare selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontReadHistoryShare record, @Param("example") FrontReadHistoryShareExample example);

    int updateByExample(@Param("record") FrontReadHistoryShare record, @Param("example") FrontReadHistoryShareExample example);

    int updateByPrimaryKeySelective(FrontReadHistoryShare record);

    int updateByPrimaryKey(FrontReadHistoryShare record);
}