package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontRentRead;
import com.retech.nyscms.entity.FrontRentReadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontRentReadMapper {
    int countByExample(FrontRentReadExample example);

    int deleteByExample(FrontRentReadExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontRentRead record);

    int insertSelective(FrontRentRead record);

    List<FrontRentRead> selectByExample(FrontRentReadExample example);

    FrontRentRead selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontRentRead record, @Param("example") FrontRentReadExample example);

    int updateByExample(@Param("record") FrontRentRead record, @Param("example") FrontRentReadExample example);

    int updateByPrimaryKeySelective(FrontRentRead record);

    int updateByPrimaryKey(FrontRentRead record);
}