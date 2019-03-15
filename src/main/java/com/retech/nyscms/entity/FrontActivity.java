package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_activity
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontActivity implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * Column:    activityName
     * Nullable:  true
     */
    private String activityname;

    /**
     * Column:    en_activityName
     * Nullable:  true
     */
    private String enActivityname;

    /**
     * Column:    activityTitle
     * Nullable:  true
     */
    private String activitytitle;

    /**
     * Column:    en_activityTitle
     * Nullable:  true
     */
    private String enActivitytitle;

    /**
     * Column:    starttime
     * Nullable:  true
     */
    private Date starttime;

    /**
     * Column:    endtime
     * Nullable:  true
     */
    private Date endtime;

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