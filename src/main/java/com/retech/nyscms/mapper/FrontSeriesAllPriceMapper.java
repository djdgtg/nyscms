package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontSeriesAllPrice;
import com.retech.nyscms.entity.FrontSeriesAllPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontSeriesAllPriceMapper {
    int countByExample(FrontSeriesAllPriceExample example);

    int deleteByExample(FrontSeriesAllPriceExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontSeriesAllPrice record);

    int insertSelective(FrontSeriesAllPrice record);

    List<FrontSeriesAllPrice> selectByExample(FrontSeriesAllPriceExample example);

    FrontSeriesAllPrice selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontSeriesAllPrice record, @Param("example") FrontSeriesAllPriceExample example);

    int updateByExample(@Param("record") FrontSeriesAllPrice record, @Param("example") FrontSeriesAllPriceExample example);

    int updateByPrimaryKeySelective(FrontSeriesAllPrice record);

    int updateByPrimaryKey(FrontSeriesAllPrice record);
}