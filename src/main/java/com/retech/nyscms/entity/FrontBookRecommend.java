package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_book_recommend
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontBookRecommend implements Serializable {
    /**
     * Column:    id
     * Nullable:  false
     */
    private Integer id;

    /**
     * Column:    eBookID
     * Nullable:  true
     */
    private Integer ebookid;

    /**
     * Column:    userID
     * Nullable:  true
     */
    private Integer userid;

    /**
     * Column:    name
     * Nullable:  true
     */
    private String name;

    /**
     * Column:    content
     * Nullable:  true
     */
    private String content;

    /**
     * Column:    RecommendedID
     * Nullable:  true
     */
    private Integer recommendedid;

    /**
     * Column:    startTime
     * Nullable:  true
     */
    private Date starttime;

    /**
     * Column:    endTime
     * Nullable:  true
     */
    private Date endtime;

    private static final long serialVersionUID = 1L;
}