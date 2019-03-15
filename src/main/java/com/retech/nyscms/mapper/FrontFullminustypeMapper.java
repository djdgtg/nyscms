package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontFullminustype;
import com.retech.nyscms.entity.FrontFullminustypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontFullminustypeMapper {
    int countByExample(FrontFullminustypeExample example);

    int deleteByExample(FrontFullminustypeExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontFullminustype record);

    int insertSelective(FrontFullminustype record);

    List<FrontFullminustype> selectByExample(FrontFullminustypeExample example);

    FrontFullminustype selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontFullminustype record, @Param("example") FrontFullminustypeExample example);

    int updateByExample(@Param("record") FrontFullminustype record, @Param("example") FrontFullminustypeExample example);

    int updateByPrimaryKeySelective(FrontFullminustype record);

    int updateByPrimaryKey(FrontFullminustype record);
}