package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_file_md5
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontFileMd5 implements Serializable {
    /**
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * Column:    filemd5
     * Nullable:  true
     */
    private String filemd5;

    /**
     * Column:    filepath
     * Nullable:  true
     */
    private String filepath;

    /**
     * Column:    machienip
     * Nullable:  true
     */
    private String machienip;

    private static final long serialVersionUID = 1L;
}