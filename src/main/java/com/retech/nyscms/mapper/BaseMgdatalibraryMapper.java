package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.BaseMgdatalibrary;
import com.retech.nyscms.entity.BaseMgdatalibraryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMgdatalibraryMapper {
    int countByExample(BaseMgdatalibraryExample example);

    int deleteByExample(BaseMgdatalibraryExample example);

    int insert(BaseMgdatalibrary record);

    int insertSelective(BaseMgdatalibrary record);

    List<BaseMgdatalibrary> selectByExample(BaseMgdatalibraryExample example);

    int updateByExampleSelective(@Param("record") BaseMgdatalibrary record, @Param("example") BaseMgdatalibraryExample example);

    int updateByExample(@Param("record") BaseMgdatalibrary record, @Param("example") BaseMgdatalibraryExample example);
}