package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontBookRecommend;
import com.retech.nyscms.entity.FrontBookRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontBookRecommendMapper {
    int countByExample(FrontBookRecommendExample example);

    int deleteByExample(FrontBookRecommendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FrontBookRecommend record);

    int insertSelective(FrontBookRecommend record);

    List<FrontBookRecommend> selectByExample(FrontBookRecommendExample example);

    FrontBookRecommend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FrontBookRecommend record, @Param("example") FrontBookRecommendExample example);

    int updateByExample(@Param("record") FrontBookRecommend record, @Param("example") FrontBookRecommendExample example);

    int updateByPrimaryKeySelective(FrontBookRecommend record);

    int updateByPrimaryKey(FrontBookRecommend record);
}