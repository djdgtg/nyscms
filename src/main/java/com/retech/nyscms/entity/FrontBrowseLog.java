package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_browse_log
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontBrowseLog extends FrontBrowseLogKey implements Serializable {
    /**
     * Column:    ebookID
     * Nullable:  true
     */
    private Integer ebookid;

    /**
     * Column:    createdTime
     * Nullable:  true
     */
    private Date createdtime;

    private static final long serialVersionUID = 1L;
}