package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontRecommendInfo;
import com.retech.nyscms.entity.FrontRecommendInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontRecommendInfoMapper {
    int countByExample(FrontRecommendInfoExample example);

    int deleteByExample(FrontRecommendInfoExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontRecommendInfo record);

    int insertSelective(FrontRecommendInfo record);

    List<FrontRecommendInfo> selectByExample(FrontRecommendInfoExample example);

    FrontRecommendInfo selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontRecommendInfo record, @Param("example") FrontRecommendInfoExample example);

    int updateByExample(@Param("record") FrontRecommendInfo record, @Param("example") FrontRecommendInfoExample example);

    int updateByPrimaryKeySelective(FrontRecommendInfo record);

    int updateByPrimaryKey(FrontRecommendInfo record);
}