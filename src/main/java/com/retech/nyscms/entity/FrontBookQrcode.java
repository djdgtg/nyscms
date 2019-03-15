package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_book_qrcode
 * Author: qinc
 * Date: 2019-03-14 13:47:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontBookQrcode implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 图书
     * Column:    book_id
     * Nullable:  true
     */
    private Integer bookId;

    /**
     * 二维码图片
     * Column:    image_url
     * Nullable:  true
     */
    private String imageUrl;

    /**
     * 是否已经使用
     * Column:    is_used
     * Nullable:  true
     */
    private Integer isUsed;

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

    private static final long serialVersionUID = 1L;
}