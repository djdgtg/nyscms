package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_bookshelf
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontBookshelf implements Serializable {
    /**
     * Column:    shelfID
     * Nullable:  false
     */
    private Integer shelfid;

    /**
     * Column:    userID
     * Nullable:  true
     */
    private Integer userid;

    /**
     * Column:    eBookID
     * Nullable:  true
     */
    private Integer ebookid;

    /**
     * Column:    createdTime
     * Nullable:  true
     */
    private Date createdtime;

    /**
     * 1已分组，0未分组
            
     * Column:    type
     * Nullable:  true
     */
    private Integer type;

    /**
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    /**
     * Column:    groupID
     * Nullable:  true
     */
    private Integer groupid;

    private static final long serialVersionUID = 1L;
}