package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: base_managers
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class BaseManagers implements Serializable {
    /**
     * 用户ID
     * Column:    UserID
     * Nullable:  false
     */
    private Integer userid;

    /**
     * 用户名
     * Column:    UserName
     * Nullable:  false
     */
    private String username;

    /**
     * 真实姓名
     * Column:    RealName
     * Nullable:  false
     */
    private String realname;

    /**
     * 电话
     * Column:    Phone
     * Nullable:  true
     */
    private String phone;

    /**
     * 邮箱
     * Column:    Email
     * Nullable:  true
     */
    private String email;

    /**
     * 上次登录时间
     * Column:    LastLoginTime
     * Nullable:  true
     */
    private Date lastlogintime;

    /**
     * 创建者
     * Column:    Creator
     * Nullable:  false
     */
    private Integer creator;

    /**
     * 创建时间
     * Column:    CreateTime
     * Nullable:  false
     */
    private Date createtime;

    /**
     * 更新者
     * Column:    Modifier
     * Nullable:  true
     */
    private Integer modifier;

    /**
     * 更新时间
     * Column:    ModifyTime
     * Nullable:  true
     */
    private Date modifytime;

    /**
     * 密码
     * Column:    Passwd
     * Nullable:  false
     */
    private String passwd;

    /**
     * Column:    Status
     * Nullable:  true
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}