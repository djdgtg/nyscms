package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: base_dics
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class BaseDics implements Serializable {
    /**
     * 字典ID
     * Column:    DicID
     * Nullable:  false
     */
    private Integer dicid;

    /**
     * 字典类型
     * Column:    DicType
     * Nullable:  true
     */
    private String dictype;

    /**
     * 字典名
     * Column:    DicName
     * Nullable:  true
     */
    private String dicname;

    /**
     * 字典值
     * Column:    DicValue
     * Nullable:  true
     */
    private String dicvalue;

    /**
     * 字典类型中文名
     * Column:    DicTypeName
     * Nullable:  true
     */
    private String dictypename;

    /**
     * 是否字典类型
     * Column:    IsDicType
     * Nullable:  true
     */
    private Integer isdictype;

    private static final long serialVersionUID = 1L;
}