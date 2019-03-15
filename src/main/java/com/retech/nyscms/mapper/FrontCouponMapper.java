package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontCoupon;
import com.retech.nyscms.entity.FrontCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontCouponMapper {
    int countByExample(FrontCouponExample example);

    int deleteByExample(FrontCouponExample example);

    int deleteByPrimaryKey(Integer couponid);

    int insert(FrontCoupon record);

    int insertSelective(FrontCoupon record);

    List<FrontCoupon> selectByExample(FrontCouponExample example);

    FrontCoupon selectByPrimaryKey(Integer couponid);

    int updateByExampleSelective(@Param("record") FrontCoupon record, @Param("example") FrontCouponExample example);

    int updateByExample(@Param("record") FrontCoupon record, @Param("example") FrontCouponExample example);

    int updateByPrimaryKeySelective(FrontCoupon record);

    int updateByPrimaryKey(FrontCoupon record);
}