package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_task
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserTask implements Serializable {
    /**
     * 主键
     * Column:    seqID
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 用户Id
     * Column:    userID
     * Nullable:  true
     */
    private Integer userid;

    /**
     * 任务Id
     * Column:    taskID
     * Nullable:  true
     */
    private Integer taskid;

    /**
     * 任务进度
     * Column:    progress
     * Nullable:  true
     */
    private String progress;

    /**
     * 3：已完成 4：奖励已领取
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    /**
     * 创建时间
     * Column:    createTime
     * Nullable:  true
     */
    private Date createtime;

    private static final long serialVersionUID = 1L;
}