package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontComment;
import com.retech.nyscms.entity.FrontCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontCommentMapper {
    int countByExample(FrontCommentExample example);

    int deleteByExample(FrontCommentExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontComment record);

    int insertSelective(FrontComment record);

    List<FrontComment> selectByExample(FrontCommentExample example);

    FrontComment selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontComment record, @Param("example") FrontCommentExample example);

    int updateByExample(@Param("record") FrontComment record, @Param("example") FrontCommentExample example);

    int updateByPrimaryKeySelective(FrontComment record);

    int updateByPrimaryKey(FrontComment record);
}