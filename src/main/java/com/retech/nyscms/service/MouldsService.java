package com.retech.nyscms.service;

import com.retech.nyscms.entity.DbMoulds;
import com.retech.nyscms.utils.ActionResult;

/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
public interface MouldsService {

    ActionResult add(DbMoulds dbMoulds);

    ActionResult update(DbMoulds dbMoulds);

    ActionResult delBatch(String mouldIds);

    ActionResult list();

    boolean checkUniqueness(DbMoulds dbMoulds);

}
