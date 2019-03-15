package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_fullminustype
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontFullminustype implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 满减类型
     * Column:    fullminusType
     * Nullable:  true
     */
    private String fullminustype;

    /**
     * 英文满减类型
     * Column:    en_fullminusType
     * Nullable:  true
     */
    private String enFullminustype;

    /**
     * 满额
     * Column:    fullMoney
     * Nullable:  true
     */
    private Float fullmoney;

    /**
     * 减额
     * Column:    minusMoney
     * Nullable:  true
     */
    private Float minusmoney;

    /**
     * 备忘录
     * Column:    memo
     * Nullable:  true
     */
    private String memo;

    /**
     * 开始时间
     * Column:    starttime
     * Nullable:  true
     */
    private Date starttime;

    /**
     * 结束时间
     * Column:    endtime
     * Nullable:  true
     */
    private Date endtime;

    /**
     * 英文备忘录
     * Column:    en_memo
     * Nullable:  true
     */
    private String enMemo;

    /**
     * 满减券数量
     * Column:    num
     * Nullable:  true
     */
    private Integer num;

    /**
     * 线上卡：1  线下卡：0
     * Column:    isonline
     * Nullable:  true
     */
    private Integer isonline;

    /**
     * 是否生成卡券：否:0,是:1。
     * Column:    isbuild
     * Nullable:  true
     */
    private Integer isbuild;

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