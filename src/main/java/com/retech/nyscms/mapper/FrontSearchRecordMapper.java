package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontSearchRecord;
import com.retech.nyscms.entity.FrontSearchRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontSearchRecordMapper {
    int countByExample(FrontSearchRecordExample example);

    int deleteByExample(FrontSearchRecordExample example);

    int deleteByPrimaryKey(Integer serachid);

    int insert(FrontSearchRecord record);

    int insertSelective(FrontSearchRecord record);

    List<FrontSearchRecord> selectByExample(FrontSearchRecordExample example);

    FrontSearchRecord selectByPrimaryKey(Integer serachid);

    int updateByExampleSelective(@Param("record") FrontSearchRecord record, @Param("example") FrontSearchRecordExample example);

    int updateByExample(@Param("record") FrontSearchRecord record, @Param("example") FrontSearchRecordExample example);

    int updateByPrimaryKeySelective(FrontSearchRecord record);

    int updateByPrimaryKey(FrontSearchRecord record);
}