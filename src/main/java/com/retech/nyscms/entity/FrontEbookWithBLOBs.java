package com.retech.nyscms.entity;

import java.io.Serializable;

public class FrontEbookWithBLOBs extends FrontEbook implements Serializable {
    /**
     * 内容简介
     * Column:    contentValidity
     * Nullable:  true
     */
    private String contentvalidity;

    /**
     * 作者简介
     * Column:    authorValidity
     * Nullable:  true
     */
    private String authorvalidity;

    /**
     * 目录
     * Column:    catalogue
     * Nullable:  true
     */
    private String catalogue;

    /**
     * Column:    editorsChoice
     * Nullable:  true
     */
    private String editorschoice;

    /**
     * 英文简介
     * Column:    en_contentValidity
     * Nullable:  true
     */
    private String enContentvalidity;

    /**
     * 英文作者简介
     * Column:    en_authorValidity
     * Nullable:  true
     */
    private String enAuthorvalidity;

    /**
     * 英文目录
     * Column:    en_catalogue
     * Nullable:  true
     */
    private String enCatalogue;

    /**
     * Column:    en_editorsChoice
     * Nullable:  true
     */
    private String enEditorschoice;

    private static final long serialVersionUID = 1L;
}