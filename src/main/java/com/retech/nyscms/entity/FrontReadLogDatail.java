package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_read_log_datail
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontReadLogDatail implements Serializable {
    /**
     * 主键
     * Column:    readID
     * Nullable:  false
     */
    private Integer readid;

    /**
     * 用户Id
     * Column:    userID
     * Nullable:  true
     */
    private Integer userid;

    /**
     * 书籍Id
     * Column:    eBookID
     * Nullable:  true
     */
    private Integer ebookid;

    /**
     * 阅读时间
     * Column:    readTime
     * Nullable:  false
     */
    private Double readtime;

    /**
     * 阅读字数
     * Column:    totalWord
     * Nullable:  true
     */
    private Integer totalword;

    /**
     * 阅读进度
     * Column:    progress
     * Nullable:  true
     */
    private String progress;

    /**
     * Column:    createdTime
     * Nullable:  true
     */
    private Date createdtime;

    private static final long serialVersionUID = 1L;
}