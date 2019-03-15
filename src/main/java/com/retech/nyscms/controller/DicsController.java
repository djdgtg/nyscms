package com.retech.nyscms.controller;

import com.retech.nyscms.aspect.LogAnnotation;
import com.retech.nyscms.aspect.LogType;
import com.retech.nyscms.entity.BaseDics;
import com.retech.nyscms.service.DicsService;
import com.retech.nyscms.utils.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
@RestController
@RequestMapping("/dics")
public class DicsController {

    @Autowired
    private DicsService dicsService;

    @RequestMapping("/list")
    public ActionResult list(BaseDics baseDics) {
        return dicsService.list(baseDics);
    }

    @RequestMapping("/add")
    @LogAnnotation(logtype = LogType.OPERATION_2, logdetail = "新增字典")
    public ActionResult add(BaseDics baseDics) {
        if (dicsService.checkUniquenessByTypeOrName(baseDics)) {
            return ActionResult.build(400, "该字典已存在！");
        }
        return dicsService.add(baseDics);
    }

    @RequestMapping("/update")
    @LogAnnotation(logtype = LogType.OPERATION_3, logdetail = "更新字典")
    public ActionResult update(BaseDics baseDics) {
        if (dicsService.checkUniqueness(baseDics)) {
            return ActionResult.build(400, "该字典已存在！");
        }
        return dicsService.update(baseDics);
    }

    @RequestMapping("/del")
    @LogAnnotation(logtype = LogType.OPERATION_4, logdetail = "删除字典类型")
    public ActionResult del(BaseDics baseDics) {
        return dicsService.del(baseDics);
    }

    @RequestMapping("/delBatch")
    @LogAnnotation(logtype = LogType.OPERATION_4, logdetail = "删除字典")
    public ActionResult delBatch(String dicIds) {
        return dicsService.delBatch(dicIds);
    }

}
