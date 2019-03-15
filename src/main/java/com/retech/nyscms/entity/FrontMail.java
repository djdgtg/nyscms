package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_mail
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontMail implements Serializable {
    /**
     * Column:    seqID
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
     * 用户名
     * Column:    name
     * Nullable:  true
     */
    private String name;

    /**
     * 被推荐的用户id
     * Column:    RecommendedID
     * Nullable:  true
     */
    private Integer recommendedid;

    /**
     * 内容
     * Column:    message
     * Nullable:  true
     */
    private String message;

    /**
     * Column:    createdTime
     * Nullable:  true
     */
    private Date createdtime;

    /**
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    /**
     * 阅读状态0：未读1：已读
     * Column:    type
     * Nullable:  true
     */
    private Integer type;

    /**
     * 站内信批次标识
     * Column:    batch
     * Nullable:  true
     */
    private Integer batch;

    /**
     * Column:    grantauth
     * Nullable:  true
     */
    private Integer grantauth;

    private static final long serialVersionUID = 1L;
}