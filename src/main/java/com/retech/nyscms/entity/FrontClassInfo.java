package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_class_info
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontClassInfo implements Serializable {
    /**
     * Column:    classID
     * Nullable:  false
     */
    private Integer classid;

    /**
     * 班级名字
     * Column:    className
     * Nullable:  true
     */
    private String classname;

    /**
     * 学生数量
     * Column:    studentNum
     * Nullable:  true
     */
    private Integer studentnum;

    /**
     * 学校名字
     * Column:    schoolName
     * Nullable:  true
     */
    private String schoolname;

    /**
     * 学校地址
     * Column:    schoolAddress
     * Nullable:  true
     */
    private String schooladdress;

    /**
     * 创建时间
     * Column:    createdTime
     * Nullable:  true
     */
    private Date createdtime;

    /**
     * 创建人ID（机构Id）
     * Column:    createrID
     * Nullable:  true
     */
    private Integer createrid;

    /**
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    /**
     * 老师id
     * Column:    teacherId
     * Nullable:  true
     */
    private Integer teacherid;

    /**
     * 头像地址
     * Column:    iconUrl
     * Nullable:  true
     */
    private String iconurl;

    /**
     * 班级概况
     * Column:    introduce
     * Nullable:  true
     */
    private String introduce;

    private static final long serialVersionUID = 1L;
}