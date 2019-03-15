package com.retech.nyscms.service;

import com.retech.nyscms.entity.BaseSeries;
import com.retech.nyscms.utils.ActionResult;

public interface SeriesService {
    ActionResult list();

    ActionResult add(BaseSeries series);

    ActionResult update(BaseSeries series);
}
