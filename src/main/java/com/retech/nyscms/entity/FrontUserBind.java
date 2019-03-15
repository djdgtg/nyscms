package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_bind
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserBind implements Serializable {
    /**
     * Column:    seqId
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 用户ID
     * Column:    userId
     * Nullable:  true
     */
    private Integer userid;

    /**
     * 国际移动设备身份码
     * Column:    imei
     * Nullable:  true
     */
    private String imei;

    /**
     * 设备名称
     * Column:    deviceName
     * Nullable:  true
     */
    private String devicename;

    /**
     * 操作系统0:安卓 1:IOS,2Web端
     * Column:    system
     * Nullable:  true
     */
    private String system;

    /**
     * Column:    createdTime
     * Nullable:  true
     */
    private Date createdtime;

    /**
     * Column:    useing
     * Nullable:  true
     */
    private Integer useing;

    private static final long serialVersionUID = 1L;
}