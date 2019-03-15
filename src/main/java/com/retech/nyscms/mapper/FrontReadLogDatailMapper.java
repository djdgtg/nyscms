package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontReadLogDatail;
import com.retech.nyscms.entity.FrontReadLogDatailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontReadLogDatailMapper {
    int countByExample(FrontReadLogDatailExample example);

    int deleteByExample(FrontReadLogDatailExample example);

    int deleteByPrimaryKey(Integer readid);

    int insert(FrontReadLogDatail record);

    int insertSelective(FrontReadLogDatail record);

    List<FrontReadLogDatail> selectByExample(FrontReadLogDatailExample example);

    FrontReadLogDatail selectByPrimaryKey(Integer readid);

    int updateByExampleSelective(@Param("record") FrontReadLogDatail record, @Param("example") FrontReadLogDatailExample example);

    int updateByExample(@Param("record") FrontReadLogDatail record, @Param("example") FrontReadLogDatailExample example);

    int updateByPrimaryKeySelective(FrontReadLogDatail record);

    int updateByPrimaryKey(FrontReadLogDatail record);
}