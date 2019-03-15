package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_book_thematic
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontBookThematic implements Serializable {
    /**
     * Column:    seqID
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 书籍id
     * Column:    eBookID
     * Nullable:  true
     */
    private Integer ebookid;

    /**
     * 专题id
     * Column:    thematicID
     * Nullable:  true
     */
    private Integer thematicid;

    private static final long serialVersionUID = 1L;
}