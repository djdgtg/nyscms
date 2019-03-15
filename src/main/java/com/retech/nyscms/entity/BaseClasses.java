package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: base_classes
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class BaseClasses implements Serializable {
    /**
     * 分类ID
     * Column:    ClassID
     * Nullable:  false
     */
    private Integer classid;

    /**
     * 父分类
     * Column:    ParentClassID
     * Nullable:  false
     */
    private Integer parentclassid;

    /**
     * 分类名
     * Column:    ClassName
     * Nullable:  false
     */
    private String classname;

    /**
     * 英文分类名
     * Column:    en_ClassName
     * Nullable:  true
     */
    private String enClassname;

    /**
     * 备注
     * Column:    Remarks
     * Nullable:  true
     */
    private String remarks;

    private static final long serialVersionUID = 1L;
}