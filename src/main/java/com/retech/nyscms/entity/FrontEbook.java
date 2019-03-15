package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_ebook
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontEbook implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 图书分类
     * Column:    ClassID
     * Nullable:  true
     */
    private String classid;

    /**
     * 书名
     * Column:    name
     * Nullable:  true
     */
    private String name;

    /**
     * 价格
     * Column:    price
     * Nullable:  true
     */
    private Float price;

    /**
     * Column:    eBookPrice
     * Nullable:  true
     */
    private Float ebookprice;

    /**
     * 作者
     * Column:    author
     * Nullable:  true
     */
    private String author;

    /**
     * 出版时间
     * Column:    publishTime
     * Nullable:  true
     */
    private Date publishtime;

    /**
     * 图书状态：1未定价，2已定价，3未上架，4已上架
     * Column:    ebookStatus
     * Nullable:  true
     */
    private String ebookstatus;

    /**
     * 促销价格
     * Column:    eBookTPrice
     * Nullable:  true
     */
    private Float ebooktprice;

    /**
     * 系列id
     * Column:    serialID
     * Nullable:  true
     */
    private String serialid;

    /**
     * 1:pdf 2:epub 3:超媒体
     * Column:    eBookFormat
     * Nullable:  true
     */
    private String ebookformat;

    /**
     * Column:    title
     * Nullable:  true
     */
    private String title;

    /**
     * 评分
     * Column:    score
     * Nullable:  true
     */
    private Float score;

    /**
     * 国际标准书号
     * Column:    ISBN
     * Nullable:  true
     */
    private String isbn;

    /**
     * Column:    EISBN
     * Nullable:  true
     */
    private String eisbn;

    /**
     * 出版社
     * Column:    publishHouse
     * Nullable:  true
     */
    private String publishhouse;

    /**
     * 页数
     * Column:    page
     * Nullable:  true
     */
    private Integer page;

    /**
     * Column:    lessonType
     * Nullable:  true
     */
    private Integer lessontype;

    /**
     * Column:    applicableage
     * Nullable:  true
     */
    private Integer applicableage;

    /**
     * Column:    languageClass
     * Nullable:  true
     */
    private String languageclass;

    /**
     * 满减类型
     * Column:    fullminusType
     * Nullable:  true
     */
    private Integer fullminustype;

    /**
     * 封面图片地址
     * Column:    iconUrl
     * Nullable:  true
     */
    private String iconurl;

    /**
     * 总字数
     * Column:    totalWord
     * Nullable:  true
     */
    private Integer totalword;

    /**
     * 收藏人数
     * Column:    favoriteNum
     * Nullable:  true
     */
    private Integer favoritenum;

    /**
     * 销量
     * Column:    salesVolume
     * Nullable:  true
     */
    private Integer salesvolume;

    /**
     * 评论人数
     * Column:    commentNumber
     * Nullable:  true
     */
    private Integer commentnumber;

    /**
     * 文件存放地址
     * Column:    locationUrl
     * Nullable:  true
     */
    private String locationurl;

    /**
     * 试读文件存放地址
     * Column:    academicProbationUrl
     * Nullable:  true
     */
    private String academicprobationurl;

    /**
     * Column:    integraldeduction
     * Nullable:  true
     */
    private Float integraldeduction;

    /**
     * 英文书名
     * Column:    en_name
     * Nullable:  true
     */
    private String enName;

    /**
     * 英文作者
     * Column:    en_author
     * Nullable:  true
     */
    private String enAuthor;

    /**
     * Column:    en_title
     * Nullable:  true
     */
    private String enTitle;

    /**
     * Column:    en_publishHouse
     * Nullable:  true
     */
    private String enPublishhouse;

    /**
     * Column:    en_lessonType
     * Nullable:  true
     */
    private Integer enLessontype;

    /**
     * Column:    en_languageClass
     * Nullable:  true
     */
    private String enLanguageclass;

    /**
     * Column:    createdtime
     * Nullable:  true
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

    /**
     * 是否系列展示：1是，0否
     * Column:    isdisplay
     * Nullable:  true
     */
    private Integer isdisplay;

    /**
     * 排序
     * Column:    sort
     * Nullable:  true
     */
    private Integer sort;

    /**
     * 是否推荐展示：1是，0否
     * Column:    isRecommend
     * Nullable:  true
     */
    private Integer isrecommend;

    /**
     * 是否新书展示：1代表是，0代表否
     * Column:    isNewbook
     * Nullable:  true
     */
    private Integer isnewbook;

    /**
     * 专题id
     * Column:    themeId
     * Nullable:  true
     */
    private Integer themeid;

    /**
     * Column:    bookdes
     * Nullable:  true
     */
    private String bookdes;

    /**
     * 文件大小
     * Column:    locationsize
     * Nullable:  true
     */
    private Long locationsize;

    /**
     * 试读文件大小
     * Column:    academicsize
     * Nullable:  true
     */
    private Long academicsize;

    /**
     * 是否全平台包月：1是，0否
     * Column:    isallseries
     * Nullable:  true
     */
    private String isallseries;

    private static final long serialVersionUID = 1L;
}