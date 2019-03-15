package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_order_detail
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontOrderDetail implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 订单id
     * Column:    orderID
     * Nullable:  true
     */
    private String orderid;

    /**
     * 图书id
     * Column:    eBookID
     * Nullable:  true
     */
    private Integer ebookid;

    /**
     * 系列id
     * Column:    serialID
     * Nullable:  true
     */
    private Integer serialid;

    /**
     * 专题id
     * Column:    themeId
     * Nullable:  true
     */
    private Integer themeid;

    /**
     * 价格
     * Column:    price
     * Nullable:  true
     */
    private Float price;

    /**
     * 书名
     * Column:    name
     * Nullable:  true
     */
    private String name;

    /**
     * 购买数量
     * Column:    quantity
     * Nullable:  true
     */
    private Integer quantity;

    /**
     * 购买/租阅的 0/null:单本书，1：系列，2：平台，3专题
     * Column:    buyType
     * Nullable:  true
     */
    private Integer buytype;

    /**
     * Column:    readDay
     * Nullable:  true
     */
    private Integer readday;

    /**
     * 评论状态 0:未评论 1:已评论
     * Column:    commentStatus
     * Nullable:  true
     */
    private Integer commentstatus;

    /**
     * 使用的优惠券Id
     * Column:    couponId
     * Nullable:  true
     */
    private Integer couponid;

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