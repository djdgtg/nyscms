package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontCoinrate;
import com.retech.nyscms.entity.FrontCoinrateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontCoinrateMapper {
    int countByExample(FrontCoinrateExample example);

    int deleteByExample(FrontCoinrateExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontCoinrate record);

    int insertSelective(FrontCoinrate record);

    List<FrontCoinrate> selectByExample(FrontCoinrateExample example);

    FrontCoinrate selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontCoinrate record, @Param("example") FrontCoinrateExample example);

    int updateByExample(@Param("record") FrontCoinrate record, @Param("example") FrontCoinrateExample example);

    int updateByPrimaryKeySelective(FrontCoinrate record);

    int updateByPrimaryKey(FrontCoinrate record);
}