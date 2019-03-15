package com.retech.nyscms.controller;

import com.retech.nyscms.entity.custom.OptionsSearchBean;
import com.retech.nyscms.service.OptionsService;
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
@RequestMapping("/options")
public class OptionsController {

    @Autowired
    private OptionsService optionsService;

    @RequestMapping("/getMenuTreeOptionsByRole")
    public ActionResult getMenuTreeOptionsByRole(OptionsSearchBean optionsSearchBean) {
        ActionResult result = optionsService.getMenuTreeOptionsByRole(optionsSearchBean);
        return result;
    }

    @RequestMapping("/getClassTreeOptionsByParent")
    public ActionResult getClassTreeOptionsByParent(OptionsSearchBean optionsSearchBean) {
        ActionResult result = optionsService.getClassTreeOptionsByParent(optionsSearchBean);
        return result;
    }

    @RequestMapping("/getSeriesTreeOptionsByParent")
    public ActionResult getSeriesTreeOptionsByParent(OptionsSearchBean optionsSearchBean) {
        ActionResult result = optionsService.getSeriesTreeOptionsByParent(optionsSearchBean);
        return result;
    }

}

