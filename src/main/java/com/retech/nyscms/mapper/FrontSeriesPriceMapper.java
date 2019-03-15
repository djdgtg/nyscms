package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontSeriesPrice;
import com.retech.nyscms.entity.FrontSeriesPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontSeriesPriceMapper {
    int countByExample(FrontSeriesPriceExample example);

    int deleteByExample(FrontSeriesPriceExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontSeriesPrice record);

    int insertSelective(FrontSeriesPrice record);

    List<FrontSeriesPrice> selectByExample(FrontSeriesPriceExample example);

    FrontSeriesPrice selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontSeriesPrice record, @Param("example") FrontSeriesPriceExample example);

    int updateByExample(@Param("record") FrontSeriesPrice record, @Param("example") FrontSeriesPriceExample example);

    int updateByPrimaryKeySelective(FrontSeriesPrice record);

    int updateByPrimaryKey(FrontSeriesPrice record);
}