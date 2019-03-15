package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_keyword
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontKeyword implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 关键词
     * Column:    keyword
     * Nullable:  true
     */
    private String keyword;

    /**
     * 英文关键词
     * Column:    en_keyword
     * Nullable:  true
     */
    private String enKeyword;

    /**
     * 排序
     * Column:    sort
     * Nullable:  true
     */
    private Integer sort;

    /**
     * 是否展示:1展示，0不展示
     * Column:    isdisplay
     * Nullable:  true
     */
    private String isdisplay;

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