package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: db_datalibrarys
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class DbDatalibrarys implements Serializable {
    /**
     * 库ID
     * Column:    DataBaseID
     * Nullable:  false
     */
    private Integer databaseid;

    /**
     * 库英文名
     * Column:    DataBaseName
     * Nullable:  false
     */
    private String databasename;

    /**
     * 库中文名
     * Column:    DataBaseCName
     * Nullable:  false
     */
    private String databasecname;

    /**
     * 库描述
     * Column:    Description
     * Nullable:  true
     */
    private String description;

    /**
     * 模型ID
     * Column:    MouldID
     * Nullable:  false
     */
    private Integer mouldid;

    /**
     * 状态
     * Column:    Status
     * Nullable:  false
     */
    private Integer status;

    /**
     * Column:    DataStepType
     * Nullable:  true
     */
    private Integer datasteptype;

    /**
     * Column:    DataStatus
     * Nullable:  true
     */
    private Integer datastatus;

    /**
     * Column:    IsWare
     * Nullable:  false
     */
    private Integer isware;

    /**
     * Column:    PerfectFileCol
     * Nullable:  true
     */
    private String perfectfilecol;

    /**
     * Column:    ProcessFileCol
     * Nullable:  true
     */
    private String processfilecol;

    /**
     * Column:    ReadFileCol
     * Nullable:  true
     */
    private String readfilecol;

    /**
     * Column:    ParentMenuId
     * Nullable:  true
     */
    private Integer parentmenuid;

    private static final long serialVersionUID = 1L;
}