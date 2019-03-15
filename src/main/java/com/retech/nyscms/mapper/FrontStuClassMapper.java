package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontStuClass;
import com.retech.nyscms.entity.FrontStuClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontStuClassMapper {
    int countByExample(FrontStuClassExample example);

    int deleteByExample(FrontStuClassExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontStuClass record);

    int insertSelective(FrontStuClass record);

    List<FrontStuClass> selectByExample(FrontStuClassExample example);

    FrontStuClass selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontStuClass record, @Param("example") FrontStuClassExample example);

    int updateByExample(@Param("record") FrontStuClass record, @Param("example") FrontStuClassExample example);

    int updateByPrimaryKeySelective(FrontStuClass record);

    int updateByPrimaryKey(FrontStuClass record);
}