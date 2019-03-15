package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserBookmark;
import com.retech.nyscms.entity.FrontUserBookmarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserBookmarkMapper {
    int countByExample(FrontUserBookmarkExample example);

    int deleteByExample(FrontUserBookmarkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FrontUserBookmark record);

    int insertSelective(FrontUserBookmark record);

    List<FrontUserBookmark> selectByExample(FrontUserBookmarkExample example);

    FrontUserBookmark selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FrontUserBookmark record, @Param("example") FrontUserBookmarkExample example);

    int updateByExample(@Param("record") FrontUserBookmark record, @Param("example") FrontUserBookmarkExample example);

    int updateByPrimaryKeySelective(FrontUserBookmark record);

    int updateByPrimaryKey(FrontUserBookmark record);
}