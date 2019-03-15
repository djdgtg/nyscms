package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontThematic;
import com.retech.nyscms.entity.FrontThematicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontThematicMapper {
    int countByExample(FrontThematicExample example);

    int deleteByExample(FrontThematicExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontThematic record);

    int insertSelective(FrontThematic record);

    List<FrontThematic> selectByExample(FrontThematicExample example);

    FrontThematic selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontThematic record, @Param("example") FrontThematicExample example);

    int updateByExample(@Param("record") FrontThematic record, @Param("example") FrontThematicExample example);

    int updateByPrimaryKeySelective(FrontThematic record);

    int updateByPrimaryKey(FrontThematic record);
}