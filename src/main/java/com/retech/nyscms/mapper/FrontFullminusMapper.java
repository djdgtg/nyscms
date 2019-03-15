package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontFullminus;
import com.retech.nyscms.entity.FrontFullminusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontFullminusMapper {
    int countByExample(FrontFullminusExample example);

    int deleteByExample(FrontFullminusExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontFullminus record);

    int insertSelective(FrontFullminus record);

    List<FrontFullminus> selectByExample(FrontFullminusExample example);

    FrontFullminus selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontFullminus record, @Param("example") FrontFullminusExample example);

    int updateByExample(@Param("record") FrontFullminus record, @Param("example") FrontFullminusExample example);

    int updateByPrimaryKeySelective(FrontFullminus record);

    int updateByPrimaryKey(FrontFullminus record);
}