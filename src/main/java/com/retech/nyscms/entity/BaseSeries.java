package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: base_series
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class BaseSeries implements Serializable {
    /**
     * 分类ID
     * Column:    serialID
     * Nullable:  false
     */
    private Integer serialid;

    /**
     * 父分类
     * Column:    parentserialID
     * Nullable:  true
     */
    private Integer parentserialid;

    /**
     * Column:    en_serialName
     * Nullable:  true
     */
    private String enSerialname;

    /**
     * 分类名
     * Column:    serialName
     * Nullable:  true
     */
    private String serialname;

    /**
     * Column:    en_serialUrl
     * Nullable:  true
     */
    private String enSerialurl;

    /**
     * Column:    serialUrl
     * Nullable:  true
     */
    private String serialurl;

    /**
     * Column:    Remarks
     * Nullable:  true
     */
    private String remarks;

    /**
     * Column:    sort
     * Nullable:  true
     */
    private String sort;

    /**
     * Column:    isdisplay
     * Nullable:  true
     */
    private Integer isdisplay;

    /**
     * Column:    createTime
     * Nullable:  true
     */
    private Date createtime;

    /**
     * Column:    modifyTime
     * Nullable:  true
     */
    private Date modifytime;

    /**
     * Column:    createrid
     * Nullable:  false
     */
    private Integer createrid;

    private static final long serialVersionUID = 1L;
}