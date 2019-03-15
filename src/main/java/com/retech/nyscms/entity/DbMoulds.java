package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: db_moulds
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class DbMoulds implements Serializable {
    /**
     * 模型ID
     * Column:    MouldID
     * Nullable:  false
     */
    private Integer mouldid;

    /**
     * 模型名称
     * Column:    MouldName
     * Nullable:  false
     */
    private String mouldname;

    /**
     * Column:    MouldType
     * Nullable:  true
     */
    private Integer mouldtype;

    /**
     * 模型描述
     * Column:    Description
     * Nullable:  true
     */
    private String description;

    private static final long serialVersionUID = 1L;
}