package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_note
 * Author: qinc
 * Date: 2019-03-04 11:42:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserNote implements Serializable {
    /**
     * Column:    id
     * Nullable:  false
     */
    private Integer id;

    /**
     * 用户id
     * Column:    fk_user_id
     * Nullable:  true
     */
    private Integer fkUserId;

    /**
     * 图书id
     * Column:    fk_book_id
     * Nullable:  true
     */
    private Integer fkBookId;

    /**
     * 章节索引
     * Column:    chapter_index
     * Nullable:  true
     */
    private String chapterIndex;

    /**
     * 章节名称
     * Column:    chapter_name
     * Nullable:  true
     */
    private String chapterName;

    /**
     * 笔记坐标
     * Column:    position
     * Nullable:  true
     */
    private String position;

    /**
     * 笔记坐标偏移量
     * Column:    position_offset
     * Nullable:  true
     */
    private String positionOffset;

    /**
     * 笔记内容
     * Column:    note_content
     * Nullable:  true
     */
    private String noteContent;

    /**
     * 摘要下划线颜色
     * Column:    summary_underline_color
     * Nullable:  true
     */
    private String summaryUnderlineColor;

    /**
     * Column:    add_time
     * Nullable:  false
     */
    private Date addTime;

    /**
     * Column:    info
     * Nullable:  true
     */
    private String info;

    /**
     * Column:    platform
     * Nullable:  true
     */
    private Integer platform;

    /**
     * Column:    platformType
     * Nullable:  true
     */
    private String platformtype;

    /**
     * Column:    is_delete
     * Nullable:  true
     */
    private Integer isDelete;

    /**
     * Column:    process
     * Nullable:  true
     */
    private String process;

    /**
     * 摘要内容
     * Column:    summary_content
     * Nullable:  true
     */
    private String summaryContent;

    private static final long serialVersionUID = 1L;
}