package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_share
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontShare implements Serializable {
    /**
     * 主键
     * Column:    shareID
     * Nullable:  false
     */
    private Integer shareid;

    /**
     * 分享标题
     * Column:    shareTitle
     * Nullable:  true
     */
    private String sharetitle;

    /**
     * 书籍Id
     * Column:    eBookID
     * Nullable:  true
     */
    private Integer ebookid;

    /**
     * 用户Id
     * Column:    userID
     * Nullable:  true
     */
    private Integer userid;

    /**
     * 好友Id
     * Column:    friendID
     * Nullable:  true
     */
    private Integer friendid;

    /**
     * Column:    createTime
     * Nullable:  true
     */
    private Date createtime;

    /**
     * 分享的阅读历史Id
     * Column:    readHistoryID
     * Nullable:  true
     */
    private Integer readhistoryid;

    private static final long serialVersionUID = 1L;
}