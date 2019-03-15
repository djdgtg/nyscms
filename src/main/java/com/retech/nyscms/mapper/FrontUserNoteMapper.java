package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserNote;
import com.retech.nyscms.entity.FrontUserNoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserNoteMapper {
    int countByExample(FrontUserNoteExample example);

    int deleteByExample(FrontUserNoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FrontUserNote record);

    int insertSelective(FrontUserNote record);

    List<FrontUserNote> selectByExampleWithBLOBs(FrontUserNoteExample example);

    List<FrontUserNote> selectByExample(FrontUserNoteExample example);

    FrontUserNote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FrontUserNote record, @Param("example") FrontUserNoteExample example);

    int updateByExampleWithBLOBs(@Param("record") FrontUserNote record, @Param("example") FrontUserNoteExample example);

    int updateByExample(@Param("record") FrontUserNote record, @Param("example") FrontUserNoteExample example);

    int updateByPrimaryKeySelective(FrontUserNote record);

    int updateByPrimaryKeyWithBLOBs(FrontUserNote record);

    int updateByPrimaryKey(FrontUserNote record);
}