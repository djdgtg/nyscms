package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: language
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Language implements Serializable {
    /**
     * 主键id
     * Column:    id
     * Nullable:  false
     */
    private Integer id;

    /**
     * 语言代码
     * Column:    languageCode
     * Nullable:  true
     */
    private String languagecode;

    /**
     * 语言
     * Column:    languageName
     * Nullable:  true
     */
    private String languagename;

    private static final long serialVersionUID = 1L;
}