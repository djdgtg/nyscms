package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserBind;
import com.retech.nyscms.entity.FrontUserBindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserBindMapper {
    int countByExample(FrontUserBindExample example);

    int deleteByExample(FrontUserBindExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontUserBind record);

    int insertSelective(FrontUserBind record);

    List<FrontUserBind> selectByExample(FrontUserBindExample example);

    FrontUserBind selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontUserBind record, @Param("example") FrontUserBindExample example);

    int updateByExample(@Param("record") FrontUserBind record, @Param("example") FrontUserBindExample example);

    int updateByPrimaryKeySelective(FrontUserBind record);

    int updateByPrimaryKey(FrontUserBind record);
}