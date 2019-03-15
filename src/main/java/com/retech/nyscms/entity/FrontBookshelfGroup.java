package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_bookshelf_group
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontBookshelfGroup implements Serializable {
    /**
     * 组id
     * Column:    groupID
     * Nullable:  false
     */
    private Integer groupid;

    /**
     * 用户id
     * Column:    userID
     * Nullable:  true
     */
    private Integer userid;

    /**
     * 组名
     * Column:    groupName
     * Nullable:  true
     */
    private String groupname;

    /**
     * Column:    createdTime
     * Nullable:  true
     */
    private Date createdtime;

    private static final long serialVersionUID = 1L;
}