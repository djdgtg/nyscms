package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_coinrate
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontCoinrate implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 国内RMB比例
     * Column:    domesticrate
     * Nullable:  true
     */
    private Float domesticrate;

    /**
     * 国外RMB比例
     * Column:    foreignrate
     * Nullable:  true
     */
    private Float foreignrate;

    /**
     * 国内美元比例
     * Column:    domesticdollarrate
     * Nullable:  true
     */
    private Float domesticdollarrate;

    /**
     * 国外美元比例
     * Column:    foreigndollarrate
     * Nullable:  true
     */
    private Float foreigndollarrate;

    /**
     * 积分比例
     * Column:    integralrate
     * Nullable:  true
     */
    private Float integralrate;

    /**
     * 积分抵扣上限百分比
     * Column:    integralpercent
     * Nullable:  true
     */
    private Float integralpercent;

    /**
     * Column:    memo
     * Nullable:  true
     */
    private String memo;

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