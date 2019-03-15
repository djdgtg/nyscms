package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontFavorite;
import com.retech.nyscms.entity.FrontFavoriteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontFavoriteMapper {
    int countByExample(FrontFavoriteExample example);

    int deleteByExample(FrontFavoriteExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontFavorite record);

    int insertSelective(FrontFavorite record);

    List<FrontFavorite> selectByExample(FrontFavoriteExample example);

    FrontFavorite selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontFavorite record, @Param("example") FrontFavoriteExample example);

    int updateByExample(@Param("record") FrontFavorite record, @Param("example") FrontFavoriteExample example);

    int updateByPrimaryKeySelective(FrontFavorite record);

    int updateByPrimaryKey(FrontFavorite record);
}