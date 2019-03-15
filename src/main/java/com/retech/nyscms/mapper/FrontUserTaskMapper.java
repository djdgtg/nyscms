package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserTask;
import com.retech.nyscms.entity.FrontUserTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserTaskMapper {
    int countByExample(FrontUserTaskExample example);

    int deleteByExample(FrontUserTaskExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontUserTask record);

    int insertSelective(FrontUserTask record);

    List<FrontUserTask> selectByExample(FrontUserTaskExample example);

    FrontUserTask selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontUserTask record, @Param("example") FrontUserTaskExample example);

    int updateByExample(@Param("record") FrontUserTask record, @Param("example") FrontUserTaskExample example);

    int updateByPrimaryKeySelective(FrontUserTask record);

    int updateByPrimaryKey(FrontUserTask record);
}