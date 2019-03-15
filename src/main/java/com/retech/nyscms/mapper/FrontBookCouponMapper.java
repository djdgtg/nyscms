package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontBookCoupon;
import com.retech.nyscms.entity.FrontBookCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontBookCouponMapper {
    int countByExample(FrontBookCouponExample example);

    int deleteByExample(FrontBookCouponExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontBookCoupon record);

    int insertSelective(FrontBookCoupon record);

    List<FrontBookCoupon> selectByExample(FrontBookCouponExample example);

    FrontBookCoupon selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontBookCoupon record, @Param("example") FrontBookCouponExample example);

    int updateByExample(@Param("record") FrontBookCoupon record, @Param("example") FrontBookCouponExample example);

    int updateByPrimaryKeySelective(FrontBookCoupon record);

    int updateByPrimaryKey(FrontBookCoupon record);
}