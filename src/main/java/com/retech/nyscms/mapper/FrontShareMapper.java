package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontShare;
import com.retech.nyscms.entity.FrontShareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontShareMapper {
    int countByExample(FrontShareExample example);

    int deleteByExample(FrontShareExample example);

    int deleteByPrimaryKey(Integer shareid);

    int insert(FrontShare record);

    int insertSelective(FrontShare record);

    List<FrontShare> selectByExample(FrontShareExample example);

    FrontShare selectByPrimaryKey(Integer shareid);

    int updateByExampleSelective(@Param("record") FrontShare record, @Param("example") FrontShareExample example);

    int updateByExample(@Param("record") FrontShare record, @Param("example") FrontShareExample example);

    int updateByPrimaryKeySelective(FrontShare record);

    int updateByPrimaryKey(FrontShare record);
}