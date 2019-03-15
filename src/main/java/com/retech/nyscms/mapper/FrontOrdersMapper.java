package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontOrders;
import com.retech.nyscms.entity.FrontOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontOrdersMapper {
    int countByExample(FrontOrdersExample example);

    int deleteByExample(FrontOrdersExample example);

    int deleteByPrimaryKey(String seqid);

    int insert(FrontOrders record);

    int insertSelective(FrontOrders record);

    List<FrontOrders> selectByExample(FrontOrdersExample example);

    FrontOrders selectByPrimaryKey(String seqid);

    int updateByExampleSelective(@Param("record") FrontOrders record, @Param("example") FrontOrdersExample example);

    int updateByExample(@Param("record") FrontOrders record, @Param("example") FrontOrdersExample example);

    int updateByPrimaryKeySelective(FrontOrders record);

    int updateByPrimaryKey(FrontOrders record);
}