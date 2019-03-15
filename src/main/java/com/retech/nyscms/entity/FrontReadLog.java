package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_read_log
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontReadLog implements Serializable {
    /**
     * 主题
     * Column:    readID
     * Nullable:  false
     */
    private Integer readid;

    /**
     * 用户Id
     * Column:    userID
     * Nullable:  false
     */
    private Integer userid;

    /**
     * 书籍Id
     * Column:    ebookID
     * Nullable:  true
     */
    private Integer ebookid;

    /**
     * 阅读进度
     * Column:    read_progress
     * Nullable:  true
     */
    private Double readProgress;

    /**
     * 阅读时间
     * Column:    readTime
     * Nullable:  true
     */
    private Double readtime;

    /**
     * 阅读字数
     * Column:    totalWord
     * Nullable:  true
     */
    private Integer totalword;

    /**
     * Column:    createdTime
     * Nullable:  true
     */
    private Date createdtime;

    /**
     * 信息来源
     * Column:    platform
     * Nullable:  true
     */
    private String platform;

    /**
     * 当前页
     * Column:    chapter_index
     * Nullable:  true
     */
    private String chapterIndex;

    /**
     * 阅读坐标
     * Column:    position
     * Nullable:  true
     */
    private String position;

    private static final long serialVersionUID = 1L;
}