package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_advertisement
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontAdvertisement implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 广告链接地址
     * Column:    adurl
     * Nullable:  true
     */
    private String adurl;

    /**
     * 广告图片地址
     * Column:    imghref
     * Nullable:  true
     */
    private String imghref;

    /**
     * app广告图片地址
     * Column:    app_imghref
     * Nullable:  true
     */
    private String appImghref;

    /**
     * 浏览次数
     * Column:    viewcount
     * Nullable:  true
     */
    private Integer viewcount;

    /**
     * 广告标题
     * Column:    adtitle
     * Nullable:  true
     */
    private String adtitle;

    /**
     * 排序
     * Column:    sort
     * Nullable:  true
     */
    private Integer sort;

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
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}