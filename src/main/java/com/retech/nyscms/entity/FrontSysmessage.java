package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_sysmessage
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontSysmessage implements Serializable {
    /**
     * 主键
     * Column:    seqid
     * Nullable:  false
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
     * 英文标题
     * Column:    en_title
     * Nullable:  true
     */
    private String enTitle;

    /**
     * 英文内容
     * Column:    en_content
     * Nullable:  true
     */
    private String enContent;

    /**
     * 消息发送状态 1：已发送，2：未发送
     * Column:    sendstatus
     * Nullable:  true
     */
    private String sendstatus;

    /**
     * 发送时间
     * Column:    sendtime
     * Nullable:  true
     */
    private Date sendtime;

    /**
     * 1:立即发送2：定时发送
     * Column:    sendmsgtype
     * Nullable:  true
     */
    private Integer sendmsgtype;

    /**
     * 内容地址
     * Column:    url
     * Nullable:  true
     */
    private String url;

    /**
     * 专题
     * Column:    themeid
     * Nullable:  true
     */
    private Integer themeid;

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