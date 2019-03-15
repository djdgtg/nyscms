package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontAdvertisement;
import com.retech.nyscms.entity.FrontAdvertisementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontAdvertisementMapper {
    int countByExample(FrontAdvertisementExample example);

    int deleteByExample(FrontAdvertisementExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontAdvertisement record);

    int insertSelective(FrontAdvertisement record);

    List<FrontAdvertisement> selectByExample(FrontAdvertisementExample example);

    FrontAdvertisement selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontAdvertisement record, @Param("example") FrontAdvertisementExample example);

    int updateByExample(@Param("record") FrontAdvertisement record, @Param("example") FrontAdvertisementExample example);

    int updateByPrimaryKeySelective(FrontAdvertisement record);

    int updateByPrimaryKey(FrontAdvertisement record);
}