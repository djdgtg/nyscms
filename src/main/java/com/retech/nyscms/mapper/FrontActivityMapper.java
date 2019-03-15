package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontActivity;
import com.retech.nyscms.entity.FrontActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontActivityMapper {
    int countByExample(FrontActivityExample example);

    int deleteByExample(FrontActivityExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontActivity record);

    int insertSelective(FrontActivity record);

    List<FrontActivity> selectByExample(FrontActivityExample example);

    FrontActivity selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontActivity record, @Param("example") FrontActivityExample example);

    int updateByExample(@Param("record") FrontActivity record, @Param("example") FrontActivityExample example);

    int updateByPrimaryKeySelective(FrontActivity record);

    int updateByPrimaryKey(FrontActivity record);
}