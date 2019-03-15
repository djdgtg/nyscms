package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_organization
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserOrganization implements Serializable {
    /**
     * Column:    seqId
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * Column:    userId
     * Nullable:  true
     */
    private Integer userid;

    /**
     * 1：个人用户
            2：机构用户
            3：机构管理员
            4：机构教师
            5：团体个人用户
            
     * Column:    userType
     * Nullable:  true
     */
    private Integer usertype;

    /**
     * Column:    classId
     * Nullable:  true
     */
    private Integer classid;

    /**
     * Column:    teacherId
     * Nullable:  true
     */
    private Integer teacherid;

    /**
     * Column:    organizationId
     * Nullable:  true
     */
    private Integer organizationid;

    /**
     * Column:    createTime
     * Nullable:  true
     */
    private Date createtime;

    private static final long serialVersionUID = 1L;
}