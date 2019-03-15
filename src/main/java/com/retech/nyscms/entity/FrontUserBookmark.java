package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_bookmark
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserBookmark implements Serializable {
    /**
     * Column:    id
     * Nullable:  false
     */
    private Integer id;

    /**
     * 用户id
     * Column:    fk_user_id
     * Nullable:  false
     */
    private Long fkUserId;

    /**
     * 图书id
     * Column:    fk_book_id
     * Nullable:  false
     */
    private Long fkBookId;

    /**
     * 章节索引
     * Column:    chapter_index
     * Nullable:  false
     */
    private String chapterIndex;

    /**
     * 章节名称
     * Column:    chapter_name
     * Nullable:  false
     */
    private String chapterName;

    /**
     * 书签坐标
     * Column:    position
     * Nullable:  false
     */
    private String position;

    /**
     * 摘要内容
     * Column:    summary_content
     * Nullable:  false
     */
    private String summaryContent;

    /**
     * 添加时间
     * Column:    add_time
     * Nullable:  false
     */
    private Date addTime;

    /**
     * Column:    version
     * Nullable:  true
     */
    private Integer version;

    /**
     * Column:    position_end
     * Nullable:  true
     */
    private String positionEnd;

    /**
     * Column:    is_delete
     * Nullable:  true
     */
    private Integer isDelete;

    /**
     * Column:    platform
     * Nullable:  false
     */
    private String platform;

    private static final long serialVersionUID = 1L;
}