package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_login
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserLogin implements Serializable {
    /**
     * 主键
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 用户Id
     * Column:    userid
     * Nullable:  true
     */
    private Integer userid;

    /**
     * 登陆时长
     * Column:    logintime
     * Nullable:  true
     */
    private Double logintime;

    /**
     * 登陆地点
     * Column:    loginadd
     * Nullable:  true
     */
    private String loginadd;

    /**
     * 创建时间
     * Column:    createdtime
     * Nullable:  true
     */
    private Date createdtime;

    /**
     * Column:    creatorid
     * Nullable:  true
     */
    private Integer creatorid;

    /**
     * 状态
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}