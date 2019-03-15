package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: base_roles
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class BaseRoles implements Serializable {
    /**
     * 角色ID
     * Column:    RoleID
     * Nullable:  false
     */
    private Integer roleid;

    /**
     * 角色名
     * Column:    RoleName
     * Nullable:  false
     */
    private String rolename;

    /**
     * 角色描述
     * Column:    Description
     * Nullable:  false
     */
    private String description;

    private static final long serialVersionUID = 1L;
}