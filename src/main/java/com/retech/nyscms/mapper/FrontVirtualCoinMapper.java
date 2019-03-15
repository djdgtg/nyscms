package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontVirtualCoin;
import com.retech.nyscms.entity.FrontVirtualCoinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontVirtualCoinMapper {
    int countByExample(FrontVirtualCoinExample example);

    int deleteByExample(FrontVirtualCoinExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontVirtualCoin record);

    int insertSelective(FrontVirtualCoin record);

    List<FrontVirtualCoin> selectByExample(FrontVirtualCoinExample example);

    FrontVirtualCoin selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontVirtualCoin record, @Param("example") FrontVirtualCoinExample example);

    int updateByExample(@Param("record") FrontVirtualCoin record, @Param("example") FrontVirtualCoinExample example);

    int updateByPrimaryKeySelective(FrontVirtualCoin record);

    int updateByPrimaryKey(FrontVirtualCoin record);
}