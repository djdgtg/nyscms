package com.retech.nyscms.controller;

import com.retech.nyscms.aspect.LogAnnotation;
import com.retech.nyscms.aspect.LogType;
import com.retech.nyscms.entity.BaseClasses;
import com.retech.nyscms.service.ClassesService;
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
@RequestMapping("/classes")
public class ClassesController {

    @Autowired
    private ClassesService classesService;


    @RequestMapping("/listCustom")
    @LogAnnotation(logtype = LogType.OPERATION_5, logdetail = "分类查询")
    public ActionResult listCustom() {
        return classesService.listCustom();
    }

    @RequestMapping("/add")
    @LogAnnotation(logtype = LogType.OPERATION_2, logdetail = "新增分类")
    public ActionResult add(BaseClasses baseClasses) {
        if (classesService.checkUniqueness(baseClasses)) {
            ActionResult.build(400, "该分类已存在！");
        }
        return classesService.add(baseClasses);
    }

    @RequestMapping("/update")
    @LogAnnotation(logtype = LogType.OPERATION_3, logdetail = "更新分类")
    public ActionResult update(BaseClasses baseClasses) {
        return classesService.update(baseClasses);
    }

    @RequestMapping("/del")
    @LogAnnotation(logtype = LogType.OPERATION_4, logdetail = "删除分类")
    public ActionResult del(Integer classid) {
        return classesService.del(classid);
    }

    @RequestMapping("/treeList")
    @LogAnnotation(logtype = LogType.OPERATION_5, logdetail = "分类查询")
    public ActionResult treeList() {
        return classesService.treeList();
    }

}
