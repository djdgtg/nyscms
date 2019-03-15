package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: country
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Country implements Serializable {
    /**
     * Column:    id
     * Nullable:  false
     */
    private Integer id;

    /**
     * 国家名
     * Column:    en_name
     * Nullable:  true
     */
    private String enName;

    /**
     * 国家英文名
     * Column:    zh_name
     * Nullable:  true
     */
    private String zhName;

    /**
     * 大洲
     * Column:    zone
     * Nullable:  true
     */
    private String zone;

    /**
     * 缩写
     * Column:    abbreviation
     * Nullable:  true
     */
    private String abbreviation;

    /**
     * 短信码
     * Column:    areacode
     * Nullable:  true
     */
    private String areacode;

    private static final long serialVersionUID = 1L;
}