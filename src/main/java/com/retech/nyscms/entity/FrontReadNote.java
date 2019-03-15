package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_read_note
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontReadNote implements Serializable {
    /**
     * Column:    seqId
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * Column:    userId
     * Nullable:  true
     */
    private Integer userid;

    /**
     * Column:    bookId
     * Nullable:  true
     */
    private Integer bookid;

    /**
     * Column:    chapter
     * Nullable:  true
     */
    private String chapter;

    /**
     * Column:    createTime
     * Nullable:  true
     */
    private Date createtime;

    private static final long serialVersionUID = 1L;
}