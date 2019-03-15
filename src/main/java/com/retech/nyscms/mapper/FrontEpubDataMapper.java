package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontEpubData;
import com.retech.nyscms.entity.FrontEpubDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontEpubDataMapper {
    int countByExample(FrontEpubDataExample example);

    int deleteByExample(FrontEpubDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FrontEpubData record);

    int insertSelective(FrontEpubData record);

    List<FrontEpubData> selectByExampleWithBLOBs(FrontEpubDataExample example);

    List<FrontEpubData> selectByExample(FrontEpubDataExample example);

    FrontEpubData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FrontEpubData record, @Param("example") FrontEpubDataExample example);

    int updateByExampleWithBLOBs(@Param("record") FrontEpubData record, @Param("example") FrontEpubDataExample example);

    int updateByExample(@Param("record") FrontEpubData record, @Param("example") FrontEpubDataExample example);

    int updateByPrimaryKeySelective(FrontEpubData record);

    int updateByPrimaryKeyWithBLOBs(FrontEpubData record);

    int updateByPrimaryKey(FrontEpubData record);
}