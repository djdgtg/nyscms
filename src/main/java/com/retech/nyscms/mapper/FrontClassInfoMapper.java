package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontClassInfo;
import com.retech.nyscms.entity.FrontClassInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontClassInfoMapper {
    int countByExample(FrontClassInfoExample example);

    int deleteByExample(FrontClassInfoExample example);

    int deleteByPrimaryKey(Integer classid);

    int insert(FrontClassInfo record);

    int insertSelective(FrontClassInfo record);

    List<FrontClassInfo> selectByExampleWithBLOBs(FrontClassInfoExample example);

    List<FrontClassInfo> selectByExample(FrontClassInfoExample example);

    FrontClassInfo selectByPrimaryKey(Integer classid);

    int updateByExampleSelective(@Param("record") FrontClassInfo record, @Param("example") FrontClassInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") FrontClassInfo record, @Param("example") FrontClassInfoExample example);

    int updateByExample(@Param("record") FrontClassInfo record, @Param("example") FrontClassInfoExample example);

    int updateByPrimaryKeySelective(FrontClassInfo record);

    int updateByPrimaryKeyWithBLOBs(FrontClassInfo record);

    int updateByPrimaryKey(FrontClassInfo record);
}