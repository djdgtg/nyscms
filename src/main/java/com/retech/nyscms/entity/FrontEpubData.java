package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_epub_data
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontEpubData implements Serializable {
    /**
     * Column:    id
     * Nullable:  false
     */
    private Integer id;

    /**
     * 书籍id
     * Column:    book_id
     * Nullable:  true
     */
    private Long bookId;

    /**
     * 1是试读，0否代表不是试读
     * Column:    is_trial
     * Nullable:  true
     */
    private Integer isTrial;

    /**
     * 1代表msg，2代表pageNum
     * Column:    msg_type
     * Nullable:  true
     */
    private Integer msgType;

    /**
     * Column:    code
     * Nullable:  true
     */
    private Integer code;

    /**
     * epub书籍解析信息
     * Column:    msg
     * Nullable:  true
     */
    private String msg;

    private static final long serialVersionUID = 1L;
}