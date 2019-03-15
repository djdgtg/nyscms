package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: db_librarynexus
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class DbLibrarynexus implements Serializable {
    /**
     * Column:    nexusid
     * Nullable:  false
     */
    private Integer nexusid;

    /**
     * 表名
     * Column:    mdbname
     * Nullable:  true
     */
    private String mdbname;

    /**
     * 字段
     * Column:    mdbfield
     * Nullable:  true
     */
    private String mdbfield;

    /**
     * 关联的表名
     * Column:    sdbname
     * Nullable:  true
     */
    private String sdbname;

    /**
     * 关联字段
     * Column:    sdbnamefield
     * Nullable:  true
     */
    private String sdbnamefield;

    /**
     * 显示字段
     * Column:    sdbvaluefield
     * Nullable:  true
     */
    private String sdbvaluefield;

    /**
     * 查询语句
     * Column:    sdbsql
     * Nullable:  true
     */
    private String sdbsql;

    private static final long serialVersionUID = 1L;
}