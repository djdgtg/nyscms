package com.retech.nyscms.aspect;

import com.retech.nyscms.entity.BaseLogs;
import com.retech.nyscms.entity.BaseManagers;
import com.retech.nyscms.service.SysLogsService;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;


/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
@Aspect
@Component
public class SysLogAspect {

    @Autowired
    private SysLogsService sysLogsService;

    @Autowired
    private HttpServletRequest request; //自动注入request


    @Autowired
    private static final Logger logger = LoggerFactory.getLogger(SysLogAspect.class);

    @Pointcut("@annotation(com.retech.nyscms.aspect.LogAnnotation)")
    public void actionAspect() {
    }

    @AfterReturning("actionAspect() && @annotation(logAnnotation)")
    public void afterReturn(LogAnnotation logAnnotation) {
        try {
            BaseManagers loginUser = (BaseManagers) request.getSession().getAttribute("USER_VALUE_OBJECT");
            String logType = logAnnotation.logtype();
            String logDetail = logAnnotation.logdetail();
            if (loginUser != null) {
                BaseLogs log = new BaseLogs();
                log.setLogtype(Integer.valueOf(logType));
                log.setLogdetail(logDetail);
                log.setCreatetime(new Date());
                log.setCreator(Integer.valueOf(loginUser.getUserid()));
                sysLogsService.insert(log);
            }
        } catch (Exception e) {
            logger.error("==后置通知异常==");
            logger.error("异常信息:{}", e.getMessage());
            e.printStackTrace();
        }
    }
}
