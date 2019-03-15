package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_rent_read
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontRentRead implements Serializable {
    /**
     * Column:    seqID
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * Column:    eBookID
     * Nullable:  true
     */
    private Integer ebookid;

    /**
     * Column:    readDay
     * Nullable:  true
     */
    private Integer readday;

    /**
     * Column:    payMoney
     * Nullable:  true
     */
    private Double paymoney;

    /**
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    /**
     * Column:    createdTime
     * Nullable:  true
     */
    private Date createdtime;

    /**
     * Column:    modifyTime
     * Nullable:  true
     */
    private Date modifytime;

    /**
     * Column:    createrID
     * Nullable:  true
     */
    private Integer createrid;

    /**
     * Column:    creater
     * Nullable:  true
     */
    private String creater;

    /**
     * Column:    memo
     * Nullable:  true
     */
    private String memo;

    private static final long serialVersionUID = 1L;
}