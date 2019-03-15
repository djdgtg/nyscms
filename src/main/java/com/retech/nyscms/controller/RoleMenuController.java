package com.retech.nyscms.controller;

import com.retech.nyscms.aspect.LogAnnotation;
import com.retech.nyscms.aspect.LogType;
import com.retech.nyscms.service.RoleMenuService;
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
@RequestMapping("/rolemenu")
public class RoleMenuController {

    @Autowired
    private RoleMenuService roleMenuService;

    @RequestMapping("/list")
    @LogAnnotation(logtype = LogType.OPERATION_5, logdetail = "查询角色菜单")
    public ActionResult list(Integer roleId) {
        return roleMenuService.listtree(roleId);
    }

    @RequestMapping("/setRoleMenus")
    @LogAnnotation(logtype = LogType.OPERATION_3, logdetail = "配置角色菜单")
    public ActionResult setRoleMenus(Integer roleId, String menuIds) {
        return roleMenuService.setRoleMenus(roleId, menuIds);
    }

}
