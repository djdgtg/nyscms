package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontActivate;
import com.retech.nyscms.entity.FrontActivateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontActivateMapper {
    int countByExample(FrontActivateExample example);

    int deleteByExample(FrontActivateExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontActivate record);

    int insertSelective(FrontActivate record);

    List<FrontActivate> selectByExample(FrontActivateExample example);

    FrontActivate selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontActivate record, @Param("example") FrontActivateExample example);

    int updateByExample(@Param("record") FrontActivate record, @Param("example") FrontActivateExample example);

    int updateByPrimaryKeySelective(FrontActivate record);

    int updateByPrimaryKey(FrontActivate record);
}