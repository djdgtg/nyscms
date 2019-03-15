package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: db_metadatas
 * Author: qinc
 * Date: 2019-03-11 10:32:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class DbMetadatas implements Serializable {
    /**
     * 字段ID
     * Column:    MetaDataID
     * Nullable:  false
     */
    private Integer metadataid;

    /**
     * 字段英文名
     * Column:    ColumnName
     * Nullable:  false
     */
    private String columnname;

    /**
     * 字段中文名
     * Column:    ColumnCName
     * Nullable:  false
     */
    private String columncname;

    /**
     * 字段类型
     * Column:    ColumnType
     * Nullable:  false
     */
    private Integer columntype;

    /**
     * 字段来源
     * Column:    ColumnSource
     * Nullable:  true
     */
    private Integer columnsource;

    /**
     * 类型规则
     * Column:    ColumnTypeRule
     * Nullable:  true
     */
    private String columntyperule;

    /**
     * 数据类型
     * Column:    DataType
     * Nullable:  false
     */
    private String datatype;

    /**
     * 字段长度
     * Column:    ColumnLength
     * Nullable:  true
     */
    private Integer columnlength;

    /**
     * 默认值
     * Column:    DefaultValue
     * Nullable:  true
     */
    private String defaultvalue;

    /**
     * 模型ID
     * Column:    MouldID
     * Nullable:  false
     */
    private Integer mouldid;

    /**
     * 排序
     * Column:    Sorts
     * Nullable:  false
     */
    private Integer sorts;

    /**
     * 表单显示;1显示，0不显示
     * Column:    FormShow
     * Nullable:  false
     */
    private Integer formshow;

    /**
     * 列表显示;1显示，0不显示
     * Column:    GridShow
     * Nullable:  false
     */
    private Integer gridshow;

    /**
     * 搜索条件显示;1显示，0不显示
     * Column:    SearchShow
     * Nullable:  true
     */
    private Integer searchshow;

    /**
     * excel表格导入导出;1显示，0不显示
     * Column:    ImportAndExportShow
     * Nullable:  true
     */
    private Integer importandexportshow;

    /**
     * Column:    Required
     * Nullable:  true
     */
    private Integer required;

    /**
     * Column:    Editable
     * Nullable:  true
     */
    private Integer editable;

    /**
     * Column:    Only
     * Nullable:  true
     */
    private Integer only;

    /**
     * 表单验证正则表达式
     * Column:    ValidExp
     * Nullable:  true
     */
    private String validexp;

    /**
     * 验证失败显示语句
     * Column:    ValidMsg
     * Nullable:  true
     */
    private String validmsg;

    private static final long serialVersionUID = 1L;
}