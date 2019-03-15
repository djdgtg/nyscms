package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_recharge
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontRecharge implements Serializable {
    /**
     * 主键
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 充值类型
     * Column:    rechargeType
     * Nullable:  true
     */
    private Integer rechargetype;

    /**
     * 充值卡号
     * Column:    rechargeNum
     * Nullable:  true
     */
    private String rechargenum;

    /**
     * 充值卡密
     * Column:    rechargecode
     * Nullable:  true
     */
    private String rechargecode;

    /**
     * 激活期限截止日期
     * Column:    endtime
     * Nullable:  true
     */
    private Date endtime;

    /**
     * 激活状态：1激活，0未激活，2已失效
     * Column:    activeStatus
     * Nullable:  true
     */
    private Integer activestatus;

    /**
     * 激活人
     * Column:    activateuser
     * Nullable:  true
     */
    private Integer activateuser;

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