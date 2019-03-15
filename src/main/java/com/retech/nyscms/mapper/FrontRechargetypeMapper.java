package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontRechargetype;
import com.retech.nyscms.entity.FrontRechargetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontRechargetypeMapper {
    int countByExample(FrontRechargetypeExample example);

    int deleteByExample(FrontRechargetypeExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontRechargetype record);

    int insertSelective(FrontRechargetype record);

    List<FrontRechargetype> selectByExample(FrontRechargetypeExample example);

    FrontRechargetype selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontRechargetype record, @Param("example") FrontRechargetypeExample example);

    int updateByExample(@Param("record") FrontRechargetype record, @Param("example") FrontRechargetypeExample example);

    int updateByPrimaryKeySelective(FrontRechargetype record);

    int updateByPrimaryKey(FrontRechargetype record);
}