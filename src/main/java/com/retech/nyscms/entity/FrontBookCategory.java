package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_book_category
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontBookCategory implements Serializable {
    /**
     * Column:    seqID
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 分类id
     * Column:    ClassID
     * Nullable:  true
     */
    private Integer classid;

    /**
     * 图书id
     * Column:    eBookID
     * Nullable:  true
     */
    private Integer ebookid;

    private static final long serialVersionUID = 1L;
}