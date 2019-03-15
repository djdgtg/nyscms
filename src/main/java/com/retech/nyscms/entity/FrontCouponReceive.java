package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_coupon_receive
 * Author: qinc
 * Date: 2019-03-04 11:42:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontCouponReceive implements Serializable {
    /**
     * 领取满减券活动表
     * Column:    seqId
     * Nullable:  true
     */
    private Integer seqid;

    /**
     * 标题
     * Column:    title
     * Nullable:  true
     */
    private String title;

    /**
     * 内容
     * Column:    content
     * Nullable:  true
     */
    private String content;

    /**
     * 活动开始时间
     * Column:    starttime
     * Nullable:  true
     */
    private Date starttime;

    /**
     * 活动结束时间
     * Column:    endtime
     * Nullable:  true
     */
    private Date endtime;

    /**
     * 创建时间
     * Column:    cratedTime
     * Nullable:  true
     */
    private Date cratedtime;

    private static final long serialVersionUID = 1L;
}