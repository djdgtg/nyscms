package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: base_mgrole
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class BaseMgrole implements Serializable {
    /**
     * 用户ID
     * Column:    UserID
     * Nullable:  true
     */
    private Integer userid;

    /**
     * 角色ID
     * Column:    RoleID
     * Nullable:  true
     */
    private Integer roleid;

    private static final long serialVersionUID = 1L;
}