package com.retech.nyscms.controller;

import com.retech.nyscms.aspect.LogAnnotation;
import com.retech.nyscms.aspect.LogType;
import com.retech.nyscms.entity.BaseManagers;
import com.retech.nyscms.entity.BaseMenus;
import com.retech.nyscms.service.MenusService;
import com.retech.nyscms.utils.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
@RestController
@RequestMapping("/menus")
public class MenusController {

    @Autowired
    private MenusService menusService;

    @RequestMapping("/getRolesMenus")
    public ActionResult getRolesMenus(HttpServletRequest request) {
        // 获取登录用户
        BaseManagers loginUser = (BaseManagers) request.getSession().getAttribute("USER_VALUE_OBJECT");
        // 执行查询
        String htmlmenu = menusService.gethtmlmenu(loginUser.getUserid());
        return ActionResult.ok(htmlmenu);
    }

    @RequestMapping("/listCustom")
    @LogAnnotation(logtype = LogType.OPERATION_5, logdetail = "查询菜单")
    public ActionResult listCustom() {
        return menusService.listCustom();
    }

    @RequestMapping("/add")
    @LogAnnotation(logtype = LogType.OPERATION_2, logdetail = "新增菜单")
    public ActionResult add(BaseMenus baseMenus) {
        return menusService.add(baseMenus);
    }

    @RequestMapping("/update")
    @LogAnnotation(logtype = LogType.OPERATION_3, logdetail = "更新菜单")
    public ActionResult update(BaseMenus baseMenus) {
        return menusService.update(baseMenus);
    }

    @RequestMapping("/del")
    @LogAnnotation(logtype = LogType.OPERATION_4, logdetail = "删除菜单")
    public ActionResult del(Integer menuId) {
        return menusService.del(menuId);
    }

}
