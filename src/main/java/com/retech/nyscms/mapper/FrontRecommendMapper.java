package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontRecommend;
import com.retech.nyscms.entity.FrontRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontRecommendMapper {
    int countByExample(FrontRecommendExample example);

    int deleteByExample(FrontRecommendExample example);

    int deleteByPrimaryKey(Integer recommendid);

    int insert(FrontRecommend record);

    int insertSelective(FrontRecommend record);

    List<FrontRecommend> selectByExample(FrontRecommendExample example);

    FrontRecommend selectByPrimaryKey(Integer recommendid);

    int updateByExampleSelective(@Param("record") FrontRecommend record, @Param("example") FrontRecommendExample example);

    int updateByExample(@Param("record") FrontRecommend record, @Param("example") FrontRecommendExample example);

    int updateByPrimaryKeySelective(FrontRecommend record);

    int updateByPrimaryKey(FrontRecommend record);
}