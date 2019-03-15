package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_favorite
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontFavorite implements Serializable {
    /**
     * Column:    seqID
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 用户id
     * Column:    userID
     * Nullable:  true
     */
    private Integer userid;

    /**
     * 图书id
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
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    /**
     * 对应平台
     * Column:    platform
     * Nullable:  true
     */
    private String platform;

    /**
     * Column:    sort
     * Nullable:  true
     */
    private String sort;

    private static final long serialVersionUID = 1L;
}