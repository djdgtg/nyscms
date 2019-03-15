package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_coupon
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontCoupon implements Serializable {
    /**
     * Column:    couponID
     * Nullable:  false
     */
    private Integer couponid;

    /**
     * Column:    passwd
     * Nullable:  true
     */
    private String passwd;

    /**
     * Column:    price
     * Nullable:  true
     */
    private Double price;

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
     * Column:    expDate
     * Nullable:  true
     */
    private Date expdate;

    /**
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}