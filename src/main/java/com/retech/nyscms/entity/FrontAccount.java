package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_account
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontAccount implements Serializable {
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
     * 虚拟币
     * Column:    balance
     * Nullable:  true
     */
    private Float balance;

    /**
     * 积分
     * Column:    score
     * Nullable:  true
     */
    private Integer score;

    /**
     * 备忘录
     * Column:    memo
     * Nullable:  true
     */
    private String memo;

    /**
     * 虚拟币
     * Column:    virtualcoin
     * Nullable:  true
     */
    private Float virtualcoin;

    /**
     * 充值赠送的虚拟币
     * Column:    givebalance
     * Nullable:  true
     */
    private Float givebalance;

    /**
     * 创建时间
     * Column:    createdtime
     * Nullable:  true
     */
    private Date createdtime;

    /**
     * 创建人
     * Column:    creatorid
     * Nullable:  true
     */
    private Integer creatorid;

    /**
     * 状态;逻辑删除，1正常，-1删除
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}