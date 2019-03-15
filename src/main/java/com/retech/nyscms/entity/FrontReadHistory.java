package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_read_history
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontReadHistory implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 用户ID
     * Column:    userID
     * Nullable:  true
     */
    private Integer userid;

    /**
     * Column:    dispaly
     * Nullable:  true
     */
    private Integer dispaly;

    /**
     * 阅读时间
     * Column:    readTime
     * Nullable:  true
     */
    private Double readtime;

    /**
     * 阅读平均字数
     * Column:    averageWord
     * Nullable:  true
     */
    private Integer averageword;

    /**
     * 阅读总字数
     * Column:    totalWord
     * Nullable:  true
     */
    private Integer totalword;

    /**
     * 排名，（暂时未用）
     * Column:    ranking
     * Nullable:  true
     */
    private Integer ranking;

    /**
     * 创建时间
     * Column:    accessTime
     * Nullable:  true
     */
    private Date accesstime;

    /**
     * 阅读完成数量
     * Column:    readThrough
     * Nullable:  true
     */
    private Integer readthrough;

    /**
     * 阅读过的数量
     * Column:    readHave
     * Nullable:  true
     */
    private Integer readhave;

    private static final long serialVersionUID = 1L;
}