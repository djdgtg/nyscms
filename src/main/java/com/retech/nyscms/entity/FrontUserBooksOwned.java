package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_books_owned
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserBooksOwned implements Serializable {
    /**
     * 主键
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 用户Id
     * Column:    userId
     * Nullable:  true
     */
    private Integer userid;

    /**
     * 书籍Id
     * Column:    eBookId
     * Nullable:  true
     */
    private Integer ebookid;

    /**
     * 系列Id
     * Column:    serialId
     * Nullable:  true
     */
    private Integer serialid;

    /**
     * 书籍来源：0购买，1租赁，2机构授权，3阅读卡
     * Column:    type
     * Nullable:  true
     */
    private Integer type;

    /**
     * 购买/租阅的是    0/null：单本书，1：系列，2平台 3，专题
     * Column:    buyType
     * Nullable:  true
     */
    private Integer buytype;

    /**
     * 开始时间
     * Column:    startTime
     * Nullable:  true
     */
    private Date starttime;

    /**
     * 结束时间
     * Column:    endTime
     * Nullable:  true
     */
    private Date endtime;

    /**
     * 机构Id
     * Column:    grantauthorityId
     * Nullable:  true
     */
    private Integer grantauthorityid;

    /**
     * 授权批次
     * Column:    grantbatchId
     * Nullable:  true
     */
    private Integer grantbatchid;

    /**
     * 书籍状态
     * Column:    bookstatus
     * Nullable:  true
     */
    private Integer bookstatus;

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
     * 1:正常可以看，0:授权过期或租阅时间过期
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}