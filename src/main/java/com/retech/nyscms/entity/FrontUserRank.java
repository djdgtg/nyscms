package com.retech.nyscms.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_rank
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserRank implements Serializable {
    /**
     * 主键
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 用户Id
     * Column:    userId
     * Nullable:  true
     */
    private Integer userid;

    /**
     * 排名
     * Column:    ranking
     * Nullable:  true
     */
    private Integer ranking;

    private static final long serialVersionUID = 1L;
}