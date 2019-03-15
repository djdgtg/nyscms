package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.BaseLogs;
import com.retech.nyscms.entity.BaseLogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseLogsMapper {
    int countByExample(BaseLogsExample example);

    int deleteByExample(BaseLogsExample example);

    int deleteByPrimaryKey(Integer logid);

    int insert(BaseLogs record);

    int insertSelective(BaseLogs record);

    List<BaseLogs> selectByExample(BaseLogsExample example);

    BaseLogs selectByPrimaryKey(Integer logid);

    int updateByExampleSelective(@Param("record") BaseLogs record, @Param("example") BaseLogsExample example);

    int updateByExample(@Param("record") BaseLogs record, @Param("example") BaseLogsExample example);

    int updateByPrimaryKeySelective(BaseLogs record);

    int updateByPrimaryKey(BaseLogs record);
}