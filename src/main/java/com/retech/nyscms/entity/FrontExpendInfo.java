package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_expend_info
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontExpendInfo implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 余额id
     * Column:    accountID
     * Nullable:  true
     */
    private String accountid;

    /**
     * 订单id
     * Column:    orderID
     * Nullable:  true
     */
    private String orderid;

    /**
     * 花费虚拟币
     * Column:    payMoney
     * Nullable:  true
     */
    private Float paymoney;

    /**
     * 花费积分
     * Column:    consumeScore
     * Nullable:  true
     */
    private Integer consumescore;

    /**
     * 备忘录
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