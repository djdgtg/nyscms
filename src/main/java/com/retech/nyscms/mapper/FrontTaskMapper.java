package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontTask;
import com.retech.nyscms.entity.FrontTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontTaskMapper {
    int countByExample(FrontTaskExample example);

    int deleteByExample(FrontTaskExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontTask record);

    int insertSelective(FrontTask record);

    List<FrontTask> selectByExample(FrontTaskExample example);

    FrontTask selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontTask record, @Param("example") FrontTaskExample example);

    int updateByExample(@Param("record") FrontTask record, @Param("example") FrontTaskExample example);

    int updateByPrimaryKeySelective(FrontTask record);

    int updateByPrimaryKey(FrontTask record);
}