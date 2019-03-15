package com.retech.nyscms.mapper.custom;

import com.retech.nyscms.entity.DbMetadatas;
import com.retech.nyscms.entity.custom.MetadatasCustomBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
public interface MetadatasManageCustomMapper {

    int checkUniqueness(DbMetadatas dbMetadatas);

    int deleteBatch(List<String> metadataids);

    List<MetadatasCustomBean> selectByExample(String mouldid);

    List<DbMetadatas> selectByDbname(@Param("databaseName") String databaseName);
}
