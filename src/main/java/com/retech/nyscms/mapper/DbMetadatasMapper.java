package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.DbMetadatas;
import com.retech.nyscms.entity.DbMetadatasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbMetadatasMapper {
    int countByExample(DbMetadatasExample example);

    int deleteByExample(DbMetadatasExample example);

    int deleteByPrimaryKey(Integer metadataid);

    int insert(DbMetadatas record);

    int insertSelective(DbMetadatas record);

    List<DbMetadatas> selectByExample(DbMetadatasExample example);

    DbMetadatas selectByPrimaryKey(Integer metadataid);

    int updateByExampleSelective(@Param("record") DbMetadatas record, @Param("example") DbMetadatasExample example);

    int updateByExample(@Param("record") DbMetadatas record, @Param("example") DbMetadatasExample example);

    int updateByPrimaryKeySelective(DbMetadatas record);

    int updateByPrimaryKey(DbMetadatas record);
}