package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_book_coupon
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontBookCoupon implements Serializable {
    /**
     * Column:    seqID
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * Column:    eBookID
     * Nullable:  true
     */
    private Integer ebookid;

    /**
     * Column:    giftID
     * Nullable:  true
     */
    private Integer giftid;

    private static final long serialVersionUID = 1L;
}