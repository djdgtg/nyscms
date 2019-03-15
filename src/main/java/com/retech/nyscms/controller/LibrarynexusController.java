package com.retech.nyscms.controller;

import com.retech.nyscms.service.LibrarynexusService;
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
@RequestMapping("/librarynexus")
public class LibrarynexusController {

    @Autowired
    private LibrarynexusService librarynexusService;

    @RequestMapping("/listTabdata")
    public ActionResult listTabdata(String mdbname, String mdbfield) {
        return librarynexusService.listTabdata(mdbname, mdbfield);
    }

    @RequestMapping("/listCustom")
    public ActionResult listCustom(Integer mouldId, Integer databaseId) {
        return librarynexusService.listCustom(mouldId, databaseId);
    }

}
