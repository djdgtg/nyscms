package com.retech.nyscms.mapper.custom;

import com.retech.nyscms.entity.DbMoulds;
import com.retech.nyscms.entity.custom.MouldsManageSearchBean;

import java.util.List;


/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
public interface MouldsManageCustomMapper {

    List<DbMoulds> listCustom();

    int count(MouldsManageSearchBean mouldsManageSearchBean);

    int checkUniqueness(DbMoulds dbMoulds);

    int deleteBatch(List<String> mouldids);
}
