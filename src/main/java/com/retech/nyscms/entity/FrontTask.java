package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_task
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontTask implements Serializable {
    /**
     * 主键
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 活动类型
     * Column:    tasktype
     * Nullable:  true
     */
    private Integer tasktype;

    /**
     * 活动描述
     * Column:    taskdescribe
     * Nullable:  true
     */
    private String taskdescribe;

    /**
     * 英文活动描述
     * Column:    en_taskdescribe
     * Nullable:  true
     */
    private String enTaskdescribe;

    /**
     * 活动达成条件数量
     * Column:    taskreachcount
     * Nullable:  true
     */
    private Float taskreachcount;

    /**
     * 活动奖励值
     * Column:    taskreward
     * Nullable:  true
     */
    private Integer taskreward;

    /**
     * 活动奖励类型(虚拟币/积分) 
     * Column:    taskrewardtype
     * Nullable:  true
     */
    private Integer taskrewardtype;

    /**
     * Column:    createdtime
     * Nullable:  false
     */
    private Date createdtime;

    /**
     * Column:    creatorid
     * Nullable:  true
     */
    private Integer creatorid;

    /**
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    /**
     * 任务次数，0：每日任务，1：一次性任务
     * Column:    taskTimes
     * Nullable:  true
     */
    private Integer tasktimes;

    private static final long serialVersionUID = 1L;
}