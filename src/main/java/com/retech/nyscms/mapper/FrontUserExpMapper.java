package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserExp;
import com.retech.nyscms.entity.FrontUserExpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserExpMapper {
    int countByExample(FrontUserExpExample example);

    int deleteByExample(FrontUserExpExample example);

    int deleteByPrimaryKey(Integer expid);

    int insert(FrontUserExp record);

    int insertSelective(FrontUserExp record);

    List<FrontUserExp> selectByExample(FrontUserExpExample example);

    FrontUserExp selectByPrimaryKey(Integer expid);

    int updateByExampleSelective(@Param("record") FrontUserExp record, @Param("example") FrontUserExpExample example);

    int updateByExample(@Param("record") FrontUserExp record, @Param("example") FrontUserExpExample example);

    int updateByPrimaryKeySelective(FrontUserExp record);

    int updateByPrimaryKey(FrontUserExp record);
}