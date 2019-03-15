package com.retech.nyscms.service;

import com.retech.nyscms.entity.custom.OptionsSearchBean;
import com.retech.nyscms.utils.ActionResult;

/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
public interface OptionsService {

    ActionResult getMenuTreeOptionsByRole(OptionsSearchBean optionsSearchBean);

    ActionResult getClassTreeOptionsByParent(OptionsSearchBean optionsSearchBean);

    ActionResult getSeriesTreeOptionsByParent(OptionsSearchBean optionsSearchBean);
}
