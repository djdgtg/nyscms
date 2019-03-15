package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontRecharge;
import com.retech.nyscms.entity.FrontRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontRechargeMapper {
    int countByExample(FrontRechargeExample example);

    int deleteByExample(FrontRechargeExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontRecharge record);

    int insertSelective(FrontRecharge record);

    List<FrontRecharge> selectByExample(FrontRechargeExample example);

    FrontRecharge selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontRecharge record, @Param("example") FrontRechargeExample example);

    int updateByExample(@Param("record") FrontRecharge record, @Param("example") FrontRechargeExample example);

    int updateByPrimaryKeySelective(FrontRecharge record);

    int updateByPrimaryKey(FrontRecharge record);
}