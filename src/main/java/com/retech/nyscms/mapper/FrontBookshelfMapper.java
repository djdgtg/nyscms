package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontBookshelf;
import com.retech.nyscms.entity.FrontBookshelfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontBookshelfMapper {
    int countByExample(FrontBookshelfExample example);

    int deleteByExample(FrontBookshelfExample example);

    int deleteByPrimaryKey(Integer shelfid);

    int insert(FrontBookshelf record);

    int insertSelective(FrontBookshelf record);

    List<FrontBookshelf> selectByExample(FrontBookshelfExample example);

    FrontBookshelf selectByPrimaryKey(Integer shelfid);

    int updateByExampleSelective(@Param("record") FrontBookshelf record, @Param("example") FrontBookshelfExample example);

    int updateByExample(@Param("record") FrontBookshelf record, @Param("example") FrontBookshelfExample example);

    int updateByPrimaryKeySelective(FrontBookshelf record);

    int updateByPrimaryKey(FrontBookshelf record);
}