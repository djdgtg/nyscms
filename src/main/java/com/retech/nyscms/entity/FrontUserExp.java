package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_exp
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserExp implements Serializable {
    /**
     * Column:    expID
     * Nullable:  false
     */
    private Integer expid;

    /**
     * Column:    beginTime
     * Nullable:  false
     */
    private Date begintime;

    /**
     * Column:    expTime
     * Nullable:  true
     */
    private Integer exptime;

    private static final long serialVersionUID = 1L;
}