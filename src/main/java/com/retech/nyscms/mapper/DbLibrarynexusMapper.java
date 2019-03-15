package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.DbLibrarynexus;
import com.retech.nyscms.entity.DbLibrarynexusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbLibrarynexusMapper {
    int countByExample(DbLibrarynexusExample example);

    int deleteByExample(DbLibrarynexusExample example);

    int deleteByPrimaryKey(Integer nexusid);

    int insert(DbLibrarynexus record);

    int insertSelective(DbLibrarynexus record);

    List<DbLibrarynexus> selectByExample(DbLibrarynexusExample example);

    DbLibrarynexus selectByPrimaryKey(Integer nexusid);

    int updateByExampleSelective(@Param("record") DbLibrarynexus record, @Param("example") DbLibrarynexusExample example);

    int updateByExample(@Param("record") DbLibrarynexus record, @Param("example") DbLibrarynexusExample example);

    int updateByPrimaryKeySelective(DbLibrarynexus record);

    int updateByPrimaryKey(DbLibrarynexus record);
}