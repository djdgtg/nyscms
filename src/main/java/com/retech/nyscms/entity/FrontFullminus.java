package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_fullminus
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontFullminus implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 满减券类型
     * Column:    fullminusType
     * Nullable:  true
     */
    private Integer fullminustype;

    /**
     * 卡号
     * Column:    fullminusNum
     * Nullable:  true
     */
    private String fullminusnum;

    /**
     * 卡密
     * Column:    fullminuscode
     * Nullable:  true
     */
    private String fullminuscode;

    /**
     * 激活用户
     * Column:    activateuser
     * Nullable:  true
     */
    private Integer activateuser;

    /**
     * 激活状态；0：未激活，1：激活
     * Column:    activeStatus
     * Nullable:  true
     */
    private String activestatus;

    /**
     * Column:    createdtime
     * Nullable:  false
     */
    private Date createdtime;

    /**
     * Column:    creatorid
     * Nullable:  true
     */
    private Integer creatorid;

    /**
     * 逻辑删除： 0：未删除；1：逻辑删除
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}