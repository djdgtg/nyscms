package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_recommend_info
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontRecommendInfo implements Serializable {
    /**
     * 主键
     * Column:    seqID
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 推荐表主键
     * Column:    recommendID
     * Nullable:  true
     */
    private Integer recommendid;

    /**
     * 被推荐用户Id
     * Column:    RecommendedID
     * Nullable:  true
     */
    private Integer recommendedid;

    /**
     * 书籍Id
     * Column:    eBookID
     * Nullable:  true
     */
    private Integer ebookid;

    /**
     * 0未阅，1已阅
     * Column:    type
     * Nullable:  true
     */
    private Integer type;

    private static final long serialVersionUID = 1L;
}