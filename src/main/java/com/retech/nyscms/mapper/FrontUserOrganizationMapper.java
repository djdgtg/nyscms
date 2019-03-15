package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontUserOrganization;
import com.retech.nyscms.entity.FrontUserOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserOrganizationMapper {
    int countByExample(FrontUserOrganizationExample example);

    int deleteByExample(FrontUserOrganizationExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontUserOrganization record);

    int insertSelective(FrontUserOrganization record);

    List<FrontUserOrganization> selectByExample(FrontUserOrganizationExample example);

    FrontUserOrganization selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontUserOrganization record, @Param("example") FrontUserOrganizationExample example);

    int updateByExample(@Param("record") FrontUserOrganization record, @Param("example") FrontUserOrganizationExample example);

    int updateByPrimaryKeySelective(FrontUserOrganization record);

    int updateByPrimaryKey(FrontUserOrganization record);
}