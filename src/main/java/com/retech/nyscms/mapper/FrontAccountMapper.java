package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontAccount;
import com.retech.nyscms.entity.FrontAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontAccountMapper {
    int countByExample(FrontAccountExample example);

    int deleteByExample(FrontAccountExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontAccount record);

    int insertSelective(FrontAccount record);

    List<FrontAccount> selectByExample(FrontAccountExample example);

    FrontAccount selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontAccount record, @Param("example") FrontAccountExample example);

    int updateByExample(@Param("record") FrontAccount record, @Param("example") FrontAccountExample example);

    int updateByPrimaryKeySelective(FrontAccount record);

    int updateByPrimaryKey(FrontAccount record);
}