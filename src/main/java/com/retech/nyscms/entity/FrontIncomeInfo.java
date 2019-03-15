package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_income_info
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontIncomeInfo implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 充值类型：0是虚拟币 1赠送积分, 2平台兑换,3赠送的虚拟币,>=4对应的任务类型id
     * Column:    incomeType
     * Nullable:  true
     */
    private String incometype;

    /**
     * 币种:0是人民币 1:美元
     * Column:    currency
     * Nullable:  true
     */
    private String currency;

    /**
     * 支付方式：0 充值卡充值  1 支付宝充值，2 微信充值，
     * Column:    payType
     * Nullable:  true
     */
    private String paytype;

    /**
     * 虚拟币充值金额
     * Column:    virtualMoney
     * Nullable:  true
     */
    private Float virtualmoney;

    /**
     * 赠送人？？？？
     * Column:    userName
     * Nullable:  true
     */
    private String username;

    /**
     * 现金金额
     * Column:    payMoney
     * Nullable:  true
     */
    private Float paymoney;

    /**
     * 赠送金额
     * Column:    discountMoney
     * Nullable:  true
     */
    private Float discountmoney;

    /**
     * Column:    payTime
     * Nullable:  true
     */
    private Date paytime;

    /**
     * 账户id
     * Column:    accountID
     * Nullable:  true
     */
    private String accountid;

    /**
     * Column:    addScore
     * Nullable:  true
     */
    private Integer addscore;

    /**
     * Column:    friendID
     * Nullable:  true
     */
    private String friendid;

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