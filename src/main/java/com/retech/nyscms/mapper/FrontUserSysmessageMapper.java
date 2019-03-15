package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserSysmessage;
import com.retech.nyscms.entity.FrontUserSysmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserSysmessageMapper {
    int countByExample(FrontUserSysmessageExample example);

    int deleteByExample(FrontUserSysmessageExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontUserSysmessage record);

    int insertSelective(FrontUserSysmessage record);

    List<FrontUserSysmessage> selectByExample(FrontUserSysmessageExample example);

    FrontUserSysmessage selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontUserSysmessage record, @Param("example") FrontUserSysmessageExample example);

    int updateByExample(@Param("record") FrontUserSysmessage record, @Param("example") FrontUserSysmessageExample example);

    int updateByPrimaryKeySelective(FrontUserSysmessage record);

    int updateByPrimaryKey(FrontUserSysmessage record);
}