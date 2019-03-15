package com.retech.nyscms.job;

import com.retech.nyscms.entity.FrontSysmessage;
import com.retech.nyscms.entity.FrontUserInfo;
import com.retech.nyscms.entity.FrontUserInfoExample;
import com.retech.nyscms.mapper.FrontSysmessageMapper;
import com.retech.nyscms.mapper.FrontUserInfoMapper;
import com.retech.nyscms.mapper.custom.SqlCustomMapper;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @author qinc
 * @date 2019/3/12
 */
public class SendSysMsgJob implements Job {

    @Autowired
    private FrontSysmessageMapper sysmessageMapper;

    @Autowired
    private FrontUserInfoMapper userInfoMapper;

    @Autowired
    private SqlCustomMapper sqlCustomMapper;

    @Override
    public void execute(JobExecutionContext context) {
        JobDataMap dataMap = context.getJobDetail().getJobDataMap();
        Integer seqid = (Integer) dataMap.get("data1");
        Integer userid = (Integer) dataMap.get("data2");
        FrontSysmessage sysmessage = sysmessageMapper.selectByPrimaryKey(seqid);
        List<FrontUserInfo> infos = userInfoMapper.selectByExample(new FrontUserInfoExample());
        Date date=new Date();
        String format = DateFormatUtils.format(date, "yyyy-MM-dd hh:mm:ss");
        StringBuilder sql=new StringBuilder().append("INSERT INTO front_user_sysmessage VALUES ");
        for (FrontUserInfo userinfo : infos) {
            sql.append("(null, ")
                    .append(userinfo.getSeqid()).append(", '")
                    .append(sysmessage.getSeqid()).append("', '").append("0', '")
                    .append(format).append("', '")
                    .append(format).append("', ")
                    .append(userid).append(", 1),");
        }
        String sqlstr = sql.toString().substring(0, sql.toString().length() - 1);
        sqlCustomMapper.insertUserMsgs(sqlstr);
        sysmessage.setSendstatus("1");
        sysmessageMapper.updateByPrimaryKey(sysmessage);
    }
}
