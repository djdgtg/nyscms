package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserCard;
import com.retech.nyscms.entity.FrontUserCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserCardMapper {
    int countByExample(FrontUserCardExample example);

    int deleteByExample(FrontUserCardExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontUserCard record);

    int insertSelective(FrontUserCard record);

    List<FrontUserCard> selectByExample(FrontUserCardExample example);

    FrontUserCard selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontUserCard record, @Param("example") FrontUserCardExample example);

    int updateByExample(@Param("record") FrontUserCard record, @Param("example") FrontUserCardExample example);

    int updateByPrimaryKeySelective(FrontUserCard record);

    int updateByPrimaryKey(FrontUserCard record);
}