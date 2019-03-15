package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontReadLog;
import com.retech.nyscms.entity.FrontReadLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontReadLogMapper {
    int countByExample(FrontReadLogExample example);

    int deleteByExample(FrontReadLogExample example);

    int deleteByPrimaryKey(Integer readid);

    int insert(FrontReadLog record);

    int insertSelective(FrontReadLog record);

    List<FrontReadLog> selectByExample(FrontReadLogExample example);

    FrontReadLog selectByPrimaryKey(Integer readid);

    int updateByExampleSelective(@Param("record") FrontReadLog record, @Param("example") FrontReadLogExample example);

    int updateByExample(@Param("record") FrontReadLog record, @Param("example") FrontReadLogExample example);

    int updateByPrimaryKeySelective(FrontReadLog record);

    int updateByPrimaryKey(FrontReadLog record);
}