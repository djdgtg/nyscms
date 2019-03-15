package com.retech.nyscms.entity;

import java.io.Serializable;

public class FrontUserReadProgressKey implements Serializable {
    /**
     * 用户id
     * Column:    fk_user_id
     * Nullable:  false
     */
    private Integer fkUserId;

    /**
     * 图书id
     * Column:    fk_book_id
     * Nullable:  false
     */
    private Integer fkBookId;

    private static final long serialVersionUID = 1L;
}