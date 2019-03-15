package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontBrowseLog;
import com.retech.nyscms.entity.FrontBrowseLogExample;
import com.retech.nyscms.entity.FrontBrowseLogKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontBrowseLogMapper {
    int countByExample(FrontBrowseLogExample example);

    int deleteByExample(FrontBrowseLogExample example);

    int deleteByPrimaryKey(FrontBrowseLogKey key);

    int insert(FrontBrowseLog record);

    int insertSelective(FrontBrowseLog record);

    List<FrontBrowseLog> selectByExample(FrontBrowseLogExample example);

    FrontBrowseLog selectByPrimaryKey(FrontBrowseLogKey key);

    int updateByExampleSelective(@Param("record") FrontBrowseLog record, @Param("example") FrontBrowseLogExample example);

    int updateByExample(@Param("record") FrontBrowseLog record, @Param("example") FrontBrowseLogExample example);

    int updateByPrimaryKeySelective(FrontBrowseLog record);

    int updateByPrimaryKey(FrontBrowseLog record);
}