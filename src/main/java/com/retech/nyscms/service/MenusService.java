package com.retech.nyscms.service;

import com.retech.nyscms.entity.BaseMenus;
import com.retech.nyscms.utils.ActionResult;

/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
public interface MenusService {

    String gethtmlmenu(Integer loginId);

    ActionResult listCustom();

    ActionResult add(BaseMenus menus);

    ActionResult update(BaseMenus menus);

    ActionResult del(Integer menuId);

}
