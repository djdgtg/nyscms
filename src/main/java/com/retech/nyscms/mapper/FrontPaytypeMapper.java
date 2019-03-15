package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontPaytype;
import com.retech.nyscms.entity.FrontPaytypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontPaytypeMapper {
    int countByExample(FrontPaytypeExample example);

    int deleteByExample(FrontPaytypeExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontPaytype record);

    int insertSelective(FrontPaytype record);

    List<FrontPaytype> selectByExample(FrontPaytypeExample example);

    FrontPaytype selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontPaytype record, @Param("example") FrontPaytypeExample example);

    int updateByExample(@Param("record") FrontPaytype record, @Param("example") FrontPaytypeExample example);

    int updateByPrimaryKeySelective(FrontPaytype record);

    int updateByPrimaryKey(FrontPaytype record);
}