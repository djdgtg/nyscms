package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_verifi
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserVerifi implements Serializable {
    /**
     * 主键
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 手机号或邮箱
     * Column:    account
     * Nullable:  true
     */
    private String account;

    /**
     * 用户ID
     * Column:    userId
     * Nullable:  true
     */
    private Integer userid;

    /**
     * 验证码
     * Column:    verifi
     * Nullable:  true
     */
    private Integer verifi;

    /**
     * 过期时间
     * Column:    expirationDate
     * Nullable:  true
     */
    private Date expirationdate;

    /**
     * 1:手机验证，2:邮箱验证
     * Column:    type
     * Nullable:  true
     */
    private Integer type;

    private static final long serialVersionUID = 1L;
}