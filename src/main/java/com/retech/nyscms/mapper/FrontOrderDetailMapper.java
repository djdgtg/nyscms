package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontOrderDetail;
import com.retech.nyscms.entity.FrontOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontOrderDetailMapper {
    int countByExample(FrontOrderDetailExample example);

    int deleteByExample(FrontOrderDetailExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontOrderDetail record);

    int insertSelective(FrontOrderDetail record);

    List<FrontOrderDetail> selectByExample(FrontOrderDetailExample example);

    FrontOrderDetail selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontOrderDetail record, @Param("example") FrontOrderDetailExample example);

    int updateByExample(@Param("record") FrontOrderDetail record, @Param("example") FrontOrderDetailExample example);

    int updateByPrimaryKeySelective(FrontOrderDetail record);

    int updateByPrimaryKey(FrontOrderDetail record);
}