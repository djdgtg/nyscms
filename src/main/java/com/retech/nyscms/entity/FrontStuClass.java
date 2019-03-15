package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_stu_class
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontStuClass implements Serializable {
    /**
     * Column:    seqID
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * Column:    userID
     * Nullable:  true
     */
    private Integer userid;

    /**
     * Column:    classID
     * Nullable:  true
     */
    private Integer classid;

    private static final long serialVersionUID = 1L;
}