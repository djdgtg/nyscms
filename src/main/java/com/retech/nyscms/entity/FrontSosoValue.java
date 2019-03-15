package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_soso_value
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontSosoValue implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * Column:    sosovalue
     * Nullable:  true
     */
    private String sosovalue;

    /**
     * 0：中文，1：英文
     * Column:    sosoType
     * Nullable:  true
     */
    private Integer sosotype;

    /**
     * Column:    createtime
     * Nullable:  true
     */
    private Date createtime;

    private static final long serialVersionUID = 1L;
}