package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontIncomeInfo;
import com.retech.nyscms.entity.FrontIncomeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontIncomeInfoMapper {
    int countByExample(FrontIncomeInfoExample example);

    int deleteByExample(FrontIncomeInfoExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontIncomeInfo record);

    int insertSelective(FrontIncomeInfo record);

    List<FrontIncomeInfo> selectByExample(FrontIncomeInfoExample example);

    FrontIncomeInfo selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontIncomeInfo record, @Param("example") FrontIncomeInfoExample example);

    int updateByExample(@Param("record") FrontIncomeInfo record, @Param("example") FrontIncomeInfoExample example);

    int updateByPrimaryKeySelective(FrontIncomeInfo record);

    int updateByPrimaryKey(FrontIncomeInfo record);
}