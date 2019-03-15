package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserExpend;
import com.retech.nyscms.entity.FrontUserExpendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserExpendMapper {
    int countByExample(FrontUserExpendExample example);

    int deleteByExample(FrontUserExpendExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontUserExpend record);

    int insertSelective(FrontUserExpend record);

    List<FrontUserExpend> selectByExample(FrontUserExpendExample example);

    FrontUserExpend selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontUserExpend record, @Param("example") FrontUserExpendExample example);

    int updateByExample(@Param("record") FrontUserExpend record, @Param("example") FrontUserExpendExample example);

    int updateByPrimaryKeySelective(FrontUserExpend record);

    int updateByPrimaryKey(FrontUserExpend record);
}