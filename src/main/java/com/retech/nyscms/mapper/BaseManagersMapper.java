package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.BaseManagers;
import com.retech.nyscms.entity.BaseManagersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseManagersMapper {
    int countByExample(BaseManagersExample example);

    int deleteByExample(BaseManagersExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(BaseManagers record);

    int insertSelective(BaseManagers record);

    List<BaseManagers> selectByExample(BaseManagersExample example);

    BaseManagers selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") BaseManagers record, @Param("example") BaseManagersExample example);

    int updateByExample(@Param("record") BaseManagers record, @Param("example") BaseManagersExample example);

    int updateByPrimaryKeySelective(BaseManagers record);

    int updateByPrimaryKey(BaseManagers record);
}