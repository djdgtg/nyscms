package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserGrantbatch;
import com.retech.nyscms.entity.FrontUserGrantbatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserGrantbatchMapper {
    int countByExample(FrontUserGrantbatchExample example);

    int deleteByExample(FrontUserGrantbatchExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontUserGrantbatch record);

    int insertSelective(FrontUserGrantbatch record);

    List<FrontUserGrantbatch> selectByExample(FrontUserGrantbatchExample example);

    FrontUserGrantbatch selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontUserGrantbatch record, @Param("example") FrontUserGrantbatchExample example);

    int updateByExample(@Param("record") FrontUserGrantbatch record, @Param("example") FrontUserGrantbatchExample example);

    int updateByPrimaryKeySelective(FrontUserGrantbatch record);

    int updateByPrimaryKey(FrontUserGrantbatch record);
}