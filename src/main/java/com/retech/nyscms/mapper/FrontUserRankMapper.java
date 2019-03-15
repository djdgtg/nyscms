package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserRank;
import com.retech.nyscms.entity.FrontUserRankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserRankMapper {
    int countByExample(FrontUserRankExample example);

    int deleteByExample(FrontUserRankExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontUserRank record);

    int insertSelective(FrontUserRank record);

    List<FrontUserRank> selectByExample(FrontUserRankExample example);

    FrontUserRank selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontUserRank record, @Param("example") FrontUserRankExample example);

    int updateByExample(@Param("record") FrontUserRank record, @Param("example") FrontUserRankExample example);

    int updateByPrimaryKeySelective(FrontUserRank record);

    int updateByPrimaryKey(FrontUserRank record);
}