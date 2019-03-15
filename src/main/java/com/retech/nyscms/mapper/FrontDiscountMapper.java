package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontDiscount;
import com.retech.nyscms.entity.FrontDiscountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontDiscountMapper {
    int countByExample(FrontDiscountExample example);

    int deleteByExample(FrontDiscountExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontDiscount record);

    int insertSelective(FrontDiscount record);

    List<FrontDiscount> selectByExample(FrontDiscountExample example);

    FrontDiscount selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontDiscount record, @Param("example") FrontDiscountExample example);

    int updateByExample(@Param("record") FrontDiscount record, @Param("example") FrontDiscountExample example);

    int updateByPrimaryKeySelective(FrontDiscount record);

    int updateByPrimaryKey(FrontDiscount record);
}