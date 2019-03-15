package com.retech.nyscms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: front_user_info
 * Author: qinc
 * Date: 2019-03-04 11:42:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FrontUserInfo implements Serializable {
    /**
     * 主键
     * Column:    seqid
     * Nullable:  false
     */
    private Integer seqid;

    /**
     * 手机号
     * Column:    phone
     * Nullable:  true
     */
    private String phone;

    /**
     * 名称
     * Column:    name
     * Nullable:  true
     */
    private String name;

    /**
     * 密码
     * Column:    passwd
     * Nullable:  true
     */
    private String passwd;

    /**
     * 年龄
     * Column:    age
     * Nullable:  true
     */
    private Integer age;

    /**
     * 生日
     * Column:    birthday
     * Nullable:  true
     */
    private Date birthday;

    /**
     * 0:男,1:女
     * Column:    sex
     * Nullable:  true
     */
    private String sex;

    /**
     * 邮箱
     * Column:    email
     * Nullable:  true
     */
    private String email;

    /**
     * 地址
     * Column:    address
     * Nullable:  true
     */
    private String address;

    /**
     * 兴趣
     * Column:    interest
     * Nullable:  true
     */
    private String interest;

    /**
     * 用户类型1:普通用户,3:机构用户,4:教师用户,5:学生用户
     * Column:    userType
     * Nullable:  true
     */
    private Integer usertype;

    /**
     * 国家ID
     * Column:    country
     * Nullable:  true
     */
    private Integer country;

    /**
     * 国家名称
     * Column:    countryName
     * Nullable:  true
     */
    private String countryname;

    /**
     * 0:汉语,1:英语,2:其他语种
     * Column:    motherTongue
     * Nullable:  true
     */
    private String mothertongue;

    /**
     * 学习年限
     * Column:    leanCHYear
     * Nullable:  true
     */
    private Integer leanchyear;

    /**
     * 国际移动设备身份码
     * Column:    imei
     * Nullable:  true
     */
    private String imei;

    /**
     * 国际移动用户识别码
     * Column:    imsi
     * Nullable:  true
     */
    private String imsi;

    /**
     * 学校类型：1.小学，2.中学，3.大学，4.教育机构
     * Column:    schoolType
     * Nullable:  true
     */
    private Integer schooltype;

    /**
     * 1可以查看0：不可查看
     * Column:    canview
     * Nullable:  true
     */
    private Integer canview;

    /**
     * 机构Id
     * Column:    organizationId
     * Nullable:  true
     */
    private Integer organizationid;

    /**
     * 教师状态
     * Column:    teacherstatus
     * Nullable:  true
     */
    private String teacherstatus;

    /**
     * Column:    payPass
     * Nullable:  true
     */
    private String paypass;

    /**
     * 教师状态
     * Column:    classID
     * Nullable:  true
     */
    private Integer classid;

    /**
     * 0未验证，1验证成功
     * Column:    emailStatus
     * Nullable:  true
     */
    private Integer emailstatus;

    /**
     * 0未验证，1验证成功
     * Column:    phoneStatus
     * Nullable:  true
     */
    private Integer phonestatus;

    /**
     * 登陆地址
     * Column:    loginIP
     * Nullable:  true
     */
    private String loginip;

    /**
     * 最后登陆时间
     * Column:    lastLoginTime
     * Nullable:  true
     */
    private Date lastlogintime;

    /**
     * 最后登陆Ip
     * Column:    lastIP
     * Nullable:  true
     */
    private String lastip;

    /**
     * Column:    terminalCode
     * Nullable:  true
     */
    private String terminalcode;

    /**
     * 登陆验证token
     * Column:    token
     * Nullable:  true
     */
    private String token;

    /**
     * Column:    modifyTime
     * Nullable:  true
     */
    private Date modifytime;

    /**
     * Column:    license
     * Nullable:  true
     */
    private String license;

    /**
     * 头像
     * Column:    iconUrl
     * Nullable:  true
     */
    private String iconurl;

    /**
     * Column:    readFinishNum
     * Nullable:  true
     */
    private Integer readfinishnum;

    /**
     * 1:正常，0：锁定，2未激活
     * Column:    userStatus
     * Nullable:  true
     */
    private String userstatus;

    /**
     * Column:    userName
     * Nullable:  true
     */
    private String username;

    /**
     * Column:    userId
     * Nullable:  true
     */
    private Integer userid;

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
     * 1正常使用，0删除或未激活
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    /**
     * 备注
     * Column:    remark
     * Nullable:  true
     */
    private String remark;

    /**
     * 学校名称
     * Column:    schoolName
     * Nullable:  true
     */
    private String schoolname;

    /**
     * 可创建学习汉语学生数
     * Column:    learnChNum
     * Nullable:  true
     */
    private Integer learnchnum;

    /**
     * 微信登陆唯一标识
     * Column:    unionid
     * Nullable:  true
     */
    private String unionid;

    /**
     * zas单点登录唯一标识
     * Column:    accessId
     * Nullable:  true
     */
    private Integer accessid;

    /**
     * 用户在zas上所属的机构id
     * Column:    zasBranchId
     * Nullable:  true
     */
    private Integer zasbranchid;

    /**
     * Column:    roletype
     * Nullable:  true
     */
    private Integer roletype;

    /**
     * 国家短信前置编码
     * Column:    areacode
     * Nullable:  true
     */
    private Integer areacode;

    /**
     * 目前绑定数量
     * Column:    bindingNum
     * Nullable:  true
     */
    private Integer bindingnum;

    /**
     * 最大绑定数量
     * Column:    maxbindingNum
     * Nullable:  true
     */
    private Integer maxbindingnum;

    /**
     * 0失效,1包月全平台
     * Column:    allbooks
     * Nullable:  false
     */
    private Integer allbooks;

    /**
     * 平台包月起始时间
     * Column:    starttime
     * Nullable:  true
     */
    private Date starttime;

    /**
     * 平台包月结束时间
     * Column:    endtime
     * Nullable:  true
     */
    private Date endtime;

    private static final long serialVersionUID = 1L;
}