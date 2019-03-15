package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontCouponReceive;
import com.retech.nyscms.entity.FrontCouponReceiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontCouponReceiveMapper {
    int countByExample(FrontCouponReceiveExample example);

    int deleteByExample(FrontCouponReceiveExample example);

    int insert(FrontCouponReceive record);

    int insertSelective(FrontCouponReceive record);

    List<FrontCouponReceive> selectByExample(FrontCouponReceiveExample example);

    int updateByExampleSelective(@Param("record") FrontCouponReceive record, @Param("example") FrontCouponReceiveExample example);

    int updateByExample(@Param("record") FrontCouponReceive record, @Param("example") FrontCouponReceiveExample example);
}