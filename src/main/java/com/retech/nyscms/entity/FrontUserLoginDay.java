package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_login_day
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserLoginDay implements Serializable {
    /**
     * 主键
     * Column:    loginid
     * Nullable:  false
     */
    private Integer loginid;

    /**
     * 用户id
     * Column:    userid
     * Nullable:  true
     */
    private Integer userid;

    /**
     * 登陆天数
     * Column:    daylogintime
     * Nullable:  true
     */
    private Double daylogintime;

    /**
     * Column:    createdtime
     * Nullable:  true
     */
    private Date createdtime;

    private static final long serialVersionUID = 1L;
}