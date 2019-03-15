package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_login_total
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserLoginTotal implements Serializable {
    /**
     * Column:    loginid
     * Nullable:  false
     */
    private Integer loginid;

    /**
     * Column:    userid
     * Nullable:  true
     */
    private Integer userid;

    /**
     * Column:    totallogintime
     * Nullable:  true
     */
    private Double totallogintime;

    private static final long serialVersionUID = 1L;
}