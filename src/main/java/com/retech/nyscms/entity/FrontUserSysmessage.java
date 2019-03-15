package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_sysmessage
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserSysmessage implements Serializable {
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
     * 系统消息Id
     * Column:    sysmessageId
     * Nullable:  true
     */
    private String sysmessageid;

    /**
     * 是否阅读
     * Column:    ischeck
     * Nullable:  true
     */
    private String ischeck;

    /**
     * 发送时间
     * Column:    sendtime
     * Nullable:  true
     */
    private Date sendtime;

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