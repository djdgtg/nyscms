package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.BaseSeries;
import com.retech.nyscms.entity.BaseSeriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseSeriesMapper {
    int countByExample(BaseSeriesExample example);

    int deleteByExample(BaseSeriesExample example);

    int deleteByPrimaryKey(Integer serialid);

    int insert(BaseSeries record);

    int insertSelective(BaseSeries record);

    List<BaseSeries> selectByExample(BaseSeriesExample example);

    BaseSeries selectByPrimaryKey(Integer serialid);

    int updateByExampleSelective(@Param("record") BaseSeries record, @Param("example") BaseSeriesExample example);

    int updateByExample(@Param("record") BaseSeries record, @Param("example") BaseSeriesExample example);

    int updateByPrimaryKeySelective(BaseSeries record);

    int updateByPrimaryKey(BaseSeries record);
}