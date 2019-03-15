package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontBookshelfGroup;
import com.retech.nyscms.entity.FrontBookshelfGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontBookshelfGroupMapper {
    int countByExample(FrontBookshelfGroupExample example);

    int deleteByExample(FrontBookshelfGroupExample example);

    int deleteByPrimaryKey(Integer groupid);

    int insert(FrontBookshelfGroup record);

    int insertSelective(FrontBookshelfGroup record);

    List<FrontBookshelfGroup> selectByExample(FrontBookshelfGroupExample example);

    FrontBookshelfGroup selectByPrimaryKey(Integer groupid);

    int updateByExampleSelective(@Param("record") FrontBookshelfGroup record, @Param("example") FrontBookshelfGroupExample example);

    int updateByExample(@Param("record") FrontBookshelfGroup record, @Param("example") FrontBookshelfGroupExample example);

    int updateByPrimaryKeySelective(FrontBookshelfGroup record);

    int updateByPrimaryKey(FrontBookshelfGroup record);
}