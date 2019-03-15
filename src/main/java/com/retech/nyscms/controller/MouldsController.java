package com.retech.nyscms.controller;

import com.retech.nyscms.entity.DbMoulds;
import com.retech.nyscms.service.MouldsService;
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
@RequestMapping("/moulds")
public class MouldsController {

    @Autowired
    private MouldsService mouldsService;

    @RequestMapping("/list")
    public ActionResult list() {
        return mouldsService.list();
    }

    @RequestMapping("/add")
    public ActionResult add(DbMoulds dbMoulds) {
        if (mouldsService.checkUniqueness(dbMoulds)) {
            return ActionResult.build(400, "该模型已存在,请输入其他模型名!");
        }
        return mouldsService.add(dbMoulds);

    }

    @RequestMapping("/update")
    public ActionResult update(DbMoulds dbMoulds) {
        if (mouldsService.checkUniqueness(dbMoulds)) {
            return ActionResult.build(400, "该模型已存在,请输入其他模型名!");
        }
        return mouldsService.update(dbMoulds);
    }

    @RequestMapping("/delBatch")
    public ActionResult delBatch(String mouldIds) {
        return mouldsService.delBatch(mouldIds);
    }

}
