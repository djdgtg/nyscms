package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_search_record
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontSearchRecord implements Serializable {
    /**
     * Column:    serachID
     * Nullable:  false
     */
    private Integer serachid;

    /**
     * Column:    userID
     * Nullable:  true
     */
    private Integer userid;

    /**
     * Column:    serachValue
     * Nullable:  true
     */
    private String serachvalue;

    /**
     * Column:    serachDate
     * Nullable:  true
     */
    private Date serachdate;

    private static final long serialVersionUID = 1L;
}