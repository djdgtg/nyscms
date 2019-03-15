package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.BaseMgrole;
import com.retech.nyscms.entity.BaseMgroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMgroleMapper {
    int countByExample(BaseMgroleExample example);

    int deleteByExample(BaseMgroleExample example);

    int insert(BaseMgrole record);

    int insertSelective(BaseMgrole record);

    List<BaseMgrole> selectByExample(BaseMgroleExample example);

    int updateByExampleSelective(@Param("record") BaseMgrole record, @Param("example") BaseMgroleExample example);

    int updateByExample(@Param("record") BaseMgrole record, @Param("example") BaseMgroleExample example);
}