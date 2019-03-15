package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontReadHistory;
import com.retech.nyscms.entity.FrontReadHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontReadHistoryMapper {
    int countByExample(FrontReadHistoryExample example);

    int deleteByExample(FrontReadHistoryExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontReadHistory record);

    int insertSelective(FrontReadHistory record);

    List<FrontReadHistory> selectByExample(FrontReadHistoryExample example);

    FrontReadHistory selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontReadHistory record, @Param("example") FrontReadHistoryExample example);

    int updateByExample(@Param("record") FrontReadHistory record, @Param("example") FrontReadHistoryExample example);

    int updateByPrimaryKeySelective(FrontReadHistory record);

    int updateByPrimaryKey(FrontReadHistory record);
}