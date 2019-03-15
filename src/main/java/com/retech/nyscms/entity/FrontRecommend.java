package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_recommend
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontRecommend implements Serializable {
    /**
     * 主键
     * Column:    recommendID
     * Nullable:  false
     */
    private Integer recommendid;

    /**
     * 用户Id
     * Column:    userID
     * Nullable:  true
     */
    private Integer userid;

    /**
     * 内容
     * Column:    content
     * Nullable:  true
     */
    private String content;

    /**
     * 创建时间
     * Column:    createdTime
     * Nullable:  true
     */
    private Date createdtime;

    /**
     * 0:推荐给好友 1:推荐给学生
     * Column:    type
     * Nullable:  true
     */
    private Integer type;

    private static final long serialVersionUID = 1L;
}