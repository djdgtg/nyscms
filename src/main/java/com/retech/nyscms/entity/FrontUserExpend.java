package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_expend
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserExpend implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * Column:    userid
     * Nullable:  true
     */
    private String userid;

    /**
     * Column:    weekbook
     * Nullable:  true
     */
    private Integer weekbook;

    /**
     * Column:    monthbook
     * Nullable:  true
     */
    private Integer monthbook;

    /**
     * Column:    weekmoney
     * Nullable:  true
     */
    private Float weekmoney;

    /**
     * Column:    monthmoney
     * Nullable:  true
     */
    private Float monthmoney;

    /**
     * Column:    weekscore
     * Nullable:  true
     */
    private Integer weekscore;

    /**
     * Column:    monthscore
     * Nullable:  true
     */
    private Integer monthscore;

    /**
     * Column:    createdtime
     * Nullable:  false
     */
    private Date createdtime;

    /**
     * Column:    creatorid
     * Nullable:  true
     */
    private Integer creatorid;

    /**
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}