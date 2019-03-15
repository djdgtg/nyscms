package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.Language;
import com.retech.nyscms.entity.LanguageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LanguageMapper {
    int countByExample(LanguageExample example);

    int deleteByExample(LanguageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Language record);

    int insertSelective(Language record);

    List<Language> selectByExample(LanguageExample example);

    Language selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Language record, @Param("example") LanguageExample example);

    int updateByExample(@Param("record") Language record, @Param("example") LanguageExample example);

    int updateByPrimaryKeySelective(Language record);

    int updateByPrimaryKey(Language record);
}