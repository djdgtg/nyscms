package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontBookThematic;
import com.retech.nyscms.entity.FrontBookThematicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontBookThematicMapper {
    int countByExample(FrontBookThematicExample example);

    int deleteByExample(FrontBookThematicExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontBookThematic record);

    int insertSelective(FrontBookThematic record);

    List<FrontBookThematic> selectByExample(FrontBookThematicExample example);

    FrontBookThematic selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontBookThematic record, @Param("example") FrontBookThematicExample example);

    int updateByExample(@Param("record") FrontBookThematic record, @Param("example") FrontBookThematicExample example);

    int updateByPrimaryKeySelective(FrontBookThematic record);

    int updateByPrimaryKey(FrontBookThematic record);
}