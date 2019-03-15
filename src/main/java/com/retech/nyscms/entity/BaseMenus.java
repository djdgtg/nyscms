package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: base_menus
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class BaseMenus implements Serializable {
    /**
     * 菜单ID
     * Column:    MenuID
     * Nullable:  false
     */
    private Integer menuid;

    /**
     * 菜单名
     * Column:    MenuName
     * Nullable:  false
     */
    private String menuname;

    /**
     * 父菜单
     * Column:    ParentMenuID
     * Nullable:  true
     */
    private Integer parentmenuid;

    /**
     * 路径
     * Column:    Path
     * Nullable:  true
     */
    private String path;

    /**
     * 描述
     * Column:    Description
     * Nullable:  true
     */
    private String description;

    /**
     * 排序
     * Column:    Sort
     * Nullable:  false
     */
    private Integer sort;

    /**
     * Column:    IsOutLink
     * Nullable:  true
     */
    private Integer isoutlink;

    private static final long serialVersionUID = 1L;
}