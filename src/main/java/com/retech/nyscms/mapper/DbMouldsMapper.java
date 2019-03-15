package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.DbMoulds;
import com.retech.nyscms.entity.DbMouldsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbMouldsMapper {
    int countByExample(DbMouldsExample example);

    int deleteByExample(DbMouldsExample example);

    int deleteByPrimaryKey(Integer mouldid);

    int insert(DbMoulds record);

    int insertSelective(DbMoulds record);

    List<DbMoulds> selectByExample(DbMouldsExample example);

    DbMoulds selectByPrimaryKey(Integer mouldid);

    int updateByExampleSelective(@Param("record") DbMoulds record, @Param("example") DbMouldsExample example);

    int updateByExample(@Param("record") DbMoulds record, @Param("example") DbMouldsExample example);

    int updateByPrimaryKeySelective(DbMoulds record);

    int updateByPrimaryKey(DbMoulds record);
}