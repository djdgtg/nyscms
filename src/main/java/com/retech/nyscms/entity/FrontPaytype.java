package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_paytype
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontPaytype implements Serializable {
    /**
     * 主键
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 支付类型
     * Column:    paytype
     * Nullable:  true
     */
    private String paytype;

    /**
     * 英文支付类型
     * Column:    en_paytype
     * Nullable:  true
     */
    private String enPaytype;

    /**
     * 是否显示
     * Column:    isdisplay
     * Nullable:  true
     */
    private String isdisplay;

    /**
     * Column:    createdtime
     * Nullable:  false
     */
    private Date createdtime;

    /**
     * Column:    creatorid
     * Nullable:  true
     */
    private Integer creatorid;

    /**
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}