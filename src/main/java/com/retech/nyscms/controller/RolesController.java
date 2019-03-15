package com.retech.nyscms.controller;

import com.retech.nyscms.aspect.LogAnnotation;
import com.retech.nyscms.aspect.LogType;
import com.retech.nyscms.entity.BaseRoles;
import com.retech.nyscms.service.RolesService;
import com.retech.nyscms.utils.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
@RestController
@RequestMapping("/roles")
public class RolesController {

    @Autowired
    private RolesService rolesService;

    @RequestMapping("/list")
    @LogAnnotation(logtype = LogType.OPERATION_5, logdetail = "查询角色")
    public List<BaseRoles> list() {
        return rolesService.list();
    }

    @RequestMapping("/add")
    @LogAnnotation(logtype = LogType.OPERATION_2, logdetail = "新增角色")
    public ActionResult add(BaseRoles baseRoles) {
        if (!rolesService.checkUniqueness(baseRoles)) {
            rolesService.add(baseRoles);
            return ActionResult.ok();
        } else {
            return ActionResult.build(400, "该角色已存在！");
        }
    }

    @RequestMapping("/update")
    @LogAnnotation(logtype = LogType.OPERATION_3, logdetail = "更新角色")
    public ActionResult update(BaseRoles baseRoles) {
        if (!rolesService.checkUniqueness(baseRoles)) {
            rolesService.update(baseRoles);
            return ActionResult.ok();
        } else {
            return ActionResult.build(400, "该角色已存在！");
        }
    }

    @RequestMapping("/delBatch")
    @LogAnnotation(logtype = LogType.OPERATION_2, logdetail = "删除角色")
    public ActionResult delBatch(String roleIds) {
        ActionResult result = rolesService.delBatch(roleIds);
        return result;
    }

}
