package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_thematic
 * Author: qinc
 * Date: 2019-03-04 11:42:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontThematic implements Serializable {
    /**
     * 主键
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 标题
     * Column:    title
     * Nullable:  true
     */
    private String title;

    /**
     * 英文标题
     * Column:    en_title
     * Nullable:  true
     */
    private String enTitle;

    /**
     * 模板图片
     * Column:    templetimg
     * Nullable:  true
     */
    private String templetimg;

    /**
     * 专题图片
     * Column:    imgURL
     * Nullable:  true
     */
    private String imgurl;

    /**
     * 背景图片
     * Column:    backgroundimg
     * Nullable:  true
     */
    private String backgroundimg;

    /**
     * app模板图片
     * Column:    app_templetimg
     * Nullable:  true
     */
    private String appTempletimg;

    /**
     * app专题图片
     * Column:    app_imgURL
     * Nullable:  true
     */
    private String appImgurl;

    /**
     * 排序
     * Column:    sort
     * Nullable:  true
     */
    private Integer sort;

    /**
     * 描述
     * Column:    description
     * Nullable:  true
     */
    private String description;

    /**
     * 描述
     * Column:    en_description
     * Nullable:  true
     */
    private String enDescription;

    /**
     * 英文描述
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