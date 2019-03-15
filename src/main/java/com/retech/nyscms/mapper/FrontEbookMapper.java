package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontEbook;
import com.retech.nyscms.entity.FrontEbookExample;
import com.retech.nyscms.entity.FrontEbookWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontEbookMapper {
    int countByExample(FrontEbookExample example);

    int deleteByExample(FrontEbookExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontEbookWithBLOBs record);

    int insertSelective(FrontEbookWithBLOBs record);

    List<FrontEbookWithBLOBs> selectByExampleWithBLOBs(FrontEbookExample example);

    List<FrontEbook> selectByExample(FrontEbookExample example);

    FrontEbookWithBLOBs selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontEbookWithBLOBs record, @Param("example") FrontEbookExample example);

    int updateByExampleWithBLOBs(@Param("record") FrontEbookWithBLOBs record, @Param("example") FrontEbookExample example);

    int updateByExample(@Param("record") FrontEbook record, @Param("example") FrontEbookExample example);

    int updateByPrimaryKeySelective(FrontEbookWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FrontEbookWithBLOBs record);

    int updateByPrimaryKey(FrontEbook record);
}