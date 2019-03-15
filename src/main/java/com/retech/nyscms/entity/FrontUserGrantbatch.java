package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_grantbatch
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserGrantbatch implements Serializable {
    /**
     * 主键
     * Column:    seqId
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 描述
     * Column:    content
     * Nullable:  true
     */
    private String content;

    /**
     * 书籍Id
     * Column:    bookId
     * Nullable:  true
     */
    private String bookid;

    /**
     * 用户Id
     * Column:    userId
     * Nullable:  true
     */
    private String userid;

    /**
     * 起始时间
     * Column:    startTime
     * Nullable:  true
     */
    private Date starttime;

    /**
     * 结束时间
     * Column:    endTime
     * Nullable:  true
     */
    private Date endtime;

    /**
     * 授权人Id
     * Column:    organizationId
     * Nullable:  true
     */
    private Integer organizationid;

    /**
     * 创建时间
     * Column:    createTime
     * Nullable:  true
     */
    private Date createtime;

    private static final long serialVersionUID = 1L;
}