package com.retech.nyscms.mapper;

import com.retech.nyscms.entity.FrontBookQrcode;
import com.retech.nyscms.entity.FrontBookQrcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontBookQrcodeMapper {
    int countByExample(FrontBookQrcodeExample example);

    int deleteByExample(FrontBookQrcodeExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(FrontBookQrcode record);

    int insertSelective(FrontBookQrcode record);

    List<FrontBookQrcode> selectByExample(FrontBookQrcodeExample example);

    FrontBookQrcode selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") FrontBookQrcode record, @Param("example") FrontBookQrcodeExample example);

    int updateByExample(@Param("record") FrontBookQrcode record, @Param("example") FrontBookQrcodeExample example);

    int updateByPrimaryKeySelective(FrontBookQrcode record);

    int updateByPrimaryKey(FrontBookQrcode record);
}