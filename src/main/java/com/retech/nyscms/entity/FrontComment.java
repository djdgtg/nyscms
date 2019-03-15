package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_comment
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontComment implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 用户id
     * Column:    userID
     * Nullable:  true
     */
    private Integer userid;

    /**
     * 图书id
     * Column:    eBookID
     * Nullable:  true
     */
    private Integer ebookid;

    /**
     * 图书评分
     * Column:    bookscore
     * Nullable:  true
     */
    private Integer bookscore;

    /**
     * 订单id
     * Column:    orderID
     * Nullable:  true
     */
    private String orderid;

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

    /**
     * 订单详情id
     * Column:    orderdetailid
     * Nullable:  true
     */
    private Integer orderdetailid;

    private static final long serialVersionUID = 1L;
}