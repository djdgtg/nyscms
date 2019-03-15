package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_orders
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontOrders implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private String seqid;

    /**
     * 用户Id
     * Column:    userID
     * Nullable:  true
     */
    private Integer userid;

    /**
     * 支付类型: 0：虚拟币支付 1:苹果支付 ；2：支付宝支付;3:微信支付
     * Column:    payType
     * Nullable:  true
     */
    private String paytype;

    /**
     * 订单总价钱（原价）
     * Column:    totalMoney
     * Nullable:  true
     */
    private Float totalmoney;

    /**
     * 使用的满减券
     * Column:    fullMinusCost
     * Nullable:  true
     */
    private String fullminuscost;

    /**
     * 充值虚拟币
     * Column:    rechargeMoney
     * Nullable:  true
     */
    private Float rechargemoney;

    /**
     * 充值虚拟币类型id,没有id为0
     * Column:    rechargeId
     * Nullable:  true
     */
    private Integer rechargeid;

    /**
     * 使用的积分
     * Column:    score
     * Nullable:  true
     */
    private Integer score;

    /**
     * 最终订单价钱（参与过积分抵扣或者满减后的价钱）
     * Column:    finalTotalMoney
     * Nullable:  true
     */
    private Float finaltotalmoney;

    /**
     * 订单状态:0:未完成  1:已经完成; 2:已评论; 3:支付中,4:取消,5:删除
     * Column:    orderStatus
     * Nullable:  true
     */
    private String orderstatus;

    /**
     * 0:普通购买 1: 租阅,2:续租,3:充值订单,4:租赁全站
     * Column:    orderType
     * Nullable:  true
     */
    private String ordertype;

    /**
     * Column:    tradeTime
     * Nullable:  true
     */
    private Date tradetime;

    /**
     * Column:    modifyTime
     * Nullable:  true
     */
    private Date modifytime;

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
     * 逻辑删除：0：未删除 1：已删除
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    /**
     * 国内或国外订单，0国内，1国外
     * Column:    domorfore
     * Nullable:  true
     */
    private Integer domorfore;

    private static final long serialVersionUID = 1L;
}