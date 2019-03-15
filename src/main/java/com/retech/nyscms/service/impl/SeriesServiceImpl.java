package com.retech.nyscms.service.impl;

import com.retech.nyscms.entity.BaseSeries;
import com.retech.nyscms.entity.BaseSeriesExample;
import com.retech.nyscms.mapper.BaseSeriesMapper;
import com.retech.nyscms.service.SeriesService;
import com.retech.nyscms.utils.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qinc
 * @date 2019/3/4
 */
@Service
public class SeriesServiceImpl implements SeriesService {

    @Autowired
    private BaseSeriesMapper seriesMapper;

    @Override
    public ActionResult list() {
        return ActionResult.ok(seriesMapper.selectByExample(new BaseSeriesExample()));
    }

    @Override
    public ActionResult add(BaseSeries series) {
        int count = seriesMapper.insert(series);
        if(count>0){
            return  ActionResult.ok();
        }
        return ActionResult.build(-1,"操作失败");
    }

    @Override
    public ActionResult update(BaseSeries series) {
        int count = seriesMapper.updateByPrimaryKeySelective(series);
        if(count>0){
            return  ActionResult.ok();
        }
        return ActionResult.build(-1,"操作失败");
    }
}
