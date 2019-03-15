package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontSosoValue;
import com.retech.nyscms.entity.FrontSosoValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontSosoValueMapper {
    int countByExample(FrontSosoValueExample example);

    int deleteByExample(FrontSosoValueExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontSosoValue record);

    int insertSelective(FrontSosoValue record);

    List<FrontSosoValue> selectByExample(FrontSosoValueExample example);

    FrontSosoValue selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontSosoValue record, @Param("example") FrontSosoValueExample example);

    int updateByExample(@Param("record") FrontSosoValue record, @Param("example") FrontSosoValueExample example);

    int updateByPrimaryKeySelective(FrontSosoValue record);

    int updateByPrimaryKey(FrontSosoValue record);
}