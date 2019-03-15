package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_series_all_price
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontSeriesAllPrice implements Serializable {
    /**
     * 主键
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 时间
     * Column:    day
     * Nullable:  true
     */
    private Integer day;

    /**
     * 国内人名币
     * Column:    domesticPrice
     * Nullable:  true
     */
    private Float domesticprice;

    /**
     * 国外人名币
     * Column:    foreignPrice
     * Nullable:  true
     */
    private Float foreignprice;

    /**
     * 国内美元
     * Column:    foreignDollar
     * Nullable:  true
     */
    private Float foreigndollar;

    /**
     * 国外美元
     * Column:    domesticDollar
     * Nullable:  true
     */
    private Float domesticdollar;

    /**
     * 1: 是 0:不是
     * Column:    isApplePay
     * Nullable:  true
     */
    private Integer isapplepay;

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