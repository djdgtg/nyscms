package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontSysmessage;
import com.retech.nyscms.entity.FrontSysmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontSysmessageMapper {
    int countByExample(FrontSysmessageExample example);

    int deleteByExample(FrontSysmessageExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontSysmessage record);

    int insertSelective(FrontSysmessage record);

    List<FrontSysmessage> selectByExample(FrontSysmessageExample example);

    FrontSysmessage selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontSysmessage record, @Param("example") FrontSysmessageExample example);

    int updateByExample(@Param("record") FrontSysmessage record, @Param("example") FrontSysmessageExample example);

    int updateByPrimaryKeySelective(FrontSysmessage record);

    int updateByPrimaryKey(FrontSysmessage record);
}