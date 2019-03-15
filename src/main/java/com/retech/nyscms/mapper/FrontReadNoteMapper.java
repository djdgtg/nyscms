package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontReadNote;
import com.retech.nyscms.entity.FrontReadNoteExample;
import com.retech.nyscms.entity.FrontReadNoteWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontReadNoteMapper {
    int countByExample(FrontReadNoteExample example);

    int deleteByExample(FrontReadNoteExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontReadNoteWithBLOBs record);

    int insertSelective(FrontReadNoteWithBLOBs record);

    List<FrontReadNoteWithBLOBs> selectByExampleWithBLOBs(FrontReadNoteExample example);

    List<FrontReadNote> selectByExample(FrontReadNoteExample example);

    FrontReadNoteWithBLOBs selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontReadNoteWithBLOBs record, @Param("example") FrontReadNoteExample example);

    int updateByExampleWithBLOBs(@Param("record") FrontReadNoteWithBLOBs record, @Param("example") FrontReadNoteExample example);

    int updateByExample(@Param("record") FrontReadNote record, @Param("example") FrontReadNoteExample example);

    int updateByPrimaryKeySelective(FrontReadNoteWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FrontReadNoteWithBLOBs record);

    int updateByPrimaryKey(FrontReadNote record);
}