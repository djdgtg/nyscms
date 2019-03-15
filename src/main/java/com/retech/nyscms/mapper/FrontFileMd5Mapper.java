package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontFileMd5;
import com.retech.nyscms.entity.FrontFileMd5Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontFileMd5Mapper {
    int countByExample(FrontFileMd5Example example);

    int deleteByExample(FrontFileMd5Example example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontFileMd5 record);

    int insertSelective(FrontFileMd5 record);

    List<FrontFileMd5> selectByExample(FrontFileMd5Example example);

    FrontFileMd5 selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontFileMd5 record, @Param("example") FrontFileMd5Example example);

    int updateByExample(@Param("record") FrontFileMd5 record, @Param("example") FrontFileMd5Example example);

    int updateByPrimaryKeySelective(FrontFileMd5 record);

    int updateByPrimaryKey(FrontFileMd5 record);
}