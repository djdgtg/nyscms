package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: base_rolemenu
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class BaseRolemenu implements Serializable {
    /**
     * 角色ID
     * Column:    RoleID
     * Nullable:  true
     */
    private Integer roleid;

    /**
     * 菜单ID
     * Column:    MenuID
     * Nullable:  true
     */
    private Integer menuid;

    private static final long serialVersionUID = 1L;
}