package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_activate
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontActivate implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 卡密
     * Column:    activatecode
     * Nullable:  true
     */
    private String activatecode;

    /**
     * 卡号
     * Column:    activatenumber
     * Nullable:  true
     */
    private String activatenumber;

    /**
     * 书籍id
     * Column:    bookids
     * Nullable:  true
     */
    private String bookids;

    /**
     * 书籍数量
     * Column:    bookcount
     * Nullable:  true
     */
    private Integer bookcount;

    /**
     * 激活状态：0.未激活，1.激活
     * Column:    activatetype
     * Nullable:  true
     */
    private String activatetype;

    /**
     * 激活用户
     * Column:    activateuser
     * Nullable:  true
     */
    private Integer activateuser;

    /**
     * 有效天数
     * Column:    effectiveDays
     * Nullable:  true
     */
    private Integer effectivedays;

    /**
     * 激活期限开始时间
     * Column:    startactivettime
     * Nullable:  true
     */
    private Date startactivettime;

    /**
     * 激活期限截止时间
     * Column:    endactivettime
     * Nullable:  true
     */
    private Date endactivettime;

    /**
     * 授权批次
     * Column:    grantbatchId
     * Nullable:  false
     */
    private Integer grantbatchid;

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