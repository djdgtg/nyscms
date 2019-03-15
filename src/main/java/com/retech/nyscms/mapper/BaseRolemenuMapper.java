package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.BaseRolemenu;
import com.retech.nyscms.entity.BaseRolemenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseRolemenuMapper {
    int countByExample(BaseRolemenuExample example);

    int deleteByExample(BaseRolemenuExample example);

    int insert(BaseRolemenu record);

    int insertSelective(BaseRolemenu record);

    List<BaseRolemenu> selectByExample(BaseRolemenuExample example);

    int updateByExampleSelective(@Param("record") BaseRolemenu record, @Param("example") BaseRolemenuExample example);

    int updateByExample(@Param("record") BaseRolemenu record, @Param("example") BaseRolemenuExample example);
}