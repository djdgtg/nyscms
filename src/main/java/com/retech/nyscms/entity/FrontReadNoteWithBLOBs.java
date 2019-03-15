package com.retech.nyscms.entity;

import java.io.Serializable;

public class FrontReadNoteWithBLOBs extends FrontReadNote implements Serializable {
    /**
     * Column:    originalText
     * Nullable:  true
     */
    private String originaltext;

    /**
     * Column:    annotation
     * Nullable:  true
     */
    private String annotation;

    private static final long serialVersionUID = 1L;
}