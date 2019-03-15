package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_card
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserCard implements Serializable {
    /**
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
     * 1:阅读券 2:充值券 3:满减券
     * Column:    cardType
     * Nullable:  true
     */
    private String cardtype;

    /**
     * 满减券的cardNum
     * Column:    cardNum
     * Nullable:  true
     */
    private String cardnum;

    /**
     * 满减券描述
     * Column:    cardInfo
     * Nullable:  true
     */
    private String cardinfo;

    /**
     * 截止日期
     * Column:    endtime
     * Nullable:  true
     */
    private Date endtime;

    /**
     * 1激活2失效,已使用0未激活
     * Column:    activeStatus
     * Nullable:  true
     */
    private String activestatus;

    /**
     * 创建时间
     * Column:    createdtime
     * Nullable:  true
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