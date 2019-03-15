package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_feed_back
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontFeedBack implements Serializable {
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
    private String userid;

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
     * 积分是否已经赠送
     * Column:    isgiven
     * Nullable:  true
     */
    private Integer isgiven;

    /**
     * 设备版本
     * Column:    phoneModel
     * Nullable:  true
     */
    private String phonemodel;

    /**
     * 系统
     * Column:    mobileSystem
     * Nullable:  true
     */
    private String mobilesystem;

    /**
     * app版本
     * Column:    appVersion
     * Nullable:  true
     */
    private String appversion;

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