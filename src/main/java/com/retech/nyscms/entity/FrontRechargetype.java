package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_rechargetype
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontRechargetype implements Serializable {
    /**
     * 主键
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 充值类型描述
     * Column:    rechargeType
     * Nullable:  true
     */
    private String rechargetype;

    /**
     * 充值类型金额
     * Column:    rechargeValue
     * Nullable:  true
     */
    private Float rechargevalue;

    /**
     * 创建时间
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
     * 状态
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}