package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_read_history_share
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontReadHistoryShare implements Serializable {
    /**
     * 主键
     * Column:    seqID
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
     * 平均字数
     * Column:    averageWord
     * Nullable:  true
     */
    private Integer averageword;

    /**
     * 总字数
     * Column:    totalWord
     * Nullable:  true
     */
    private Integer totalword;

    /**
     * 排名
     * Column:    ranking
     * Nullable:  true
     */
    private Integer ranking;

    /**
     * Column:    createTime
     * Nullable:  true
     */
    private Date createtime;

    /**
     * 阅读完的书籍
     * Column:    readThrough
     * Nullable:  true
     */
    private Integer readthrough;

    /**
     * 阅读过的书籍
     * Column:    readHave
     * Nullable:  true
     */
    private Integer readhave;

    /**
     * 当天阅读字数
     * Column:    sameDayWord
     * Nullable:  true
     */
    private Integer samedayword;

    private static final long serialVersionUID = 1L;
}