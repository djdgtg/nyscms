package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontExpendInfo;
import com.retech.nyscms.entity.FrontExpendInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontExpendInfoMapper {
    int countByExample(FrontExpendInfoExample example);

    int deleteByExample(FrontExpendInfoExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontExpendInfo record);

    int insertSelective(FrontExpendInfo record);

    List<FrontExpendInfo> selectByExample(FrontExpendInfoExample example);

    FrontExpendInfo selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontExpendInfo record, @Param("example") FrontExpendInfoExample example);

    int updateByExample(@Param("record") FrontExpendInfo record, @Param("example") FrontExpendInfoExample example);

    int updateByPrimaryKeySelective(FrontExpendInfo record);

    int updateByPrimaryKey(FrontExpendInfo record);
}