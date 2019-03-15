package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_friend
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontFriend implements Serializable {
    /**
     * Column:    seqID
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 用户id
     * Column:    userID
     * Nullable:  false
     */
    private Integer userid;

    /**
     * 好友id
     * Column:    friendID
     * Nullable:  false
     */
    private Integer friendid;

    /**
     * Column:    createdTime
     * Nullable:  true
     */
    private Date createdtime;

    private static final long serialVersionUID = 1L;
}