package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserInfo;
import com.retech.nyscms.entity.FrontUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserInfoMapper {
    int countByExample(FrontUserInfoExample example);

    int deleteByExample(FrontUserInfoExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontUserInfo record);

    int insertSelective(FrontUserInfo record);

    List<FrontUserInfo> selectByExample(FrontUserInfoExample example);

    FrontUserInfo selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontUserInfo record, @Param("example") FrontUserInfoExample example);

    int updateByExample(@Param("record") FrontUserInfo record, @Param("example") FrontUserInfoExample example);

    int updateByPrimaryKeySelective(FrontUserInfo record);

    int updateByPrimaryKey(FrontUserInfo record);
}