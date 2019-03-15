package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_read_progress
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserReadProgress extends FrontUserReadProgressKey implements Serializable {
    /**
     * 章节索引
     * Column:    chapter_index
     * Nullable:  false
     */
    private String chapterIndex;

    /**
     * 阅读坐标
     * Column:    position
     * Nullable:  false
     */
    private String position;

    /**
     * 阅读进度
     * Column:    progress
     * Nullable:  false
     */
    private String progress;

    /**
     * 添加时间
     * Column:    add_time
     * Nullable:  false
     */
    private Date addTime;

    /**
     * 更新时间
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}