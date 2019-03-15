package com.retech.nyscms.controller;

import com.retech.nyscms.entity.BaseManagers;
import com.retech.nyscms.entity.BaseSeries;
import com.retech.nyscms.service.SeriesService;
import com.retech.nyscms.utils.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author qinc
 * @date 2019/3/4
 */
@RestController
@RequestMapping("/series")
public class SeriesController {

    @Autowired
    private SeriesService seriesService;

    @RequestMapping("/listCustom")
    public ActionResult listCustom(){
        return seriesService.list();
    }

    @RequestMapping("/add")
    public ActionResult add(BaseSeries series, HttpServletRequest request){
        BaseManagers loginUser = (BaseManagers) request.getSession().getAttribute("USER_VALUE_OBJECT");
        series.setCreaterid(loginUser.getUserid());
        return seriesService.add(series);
    }

    @RequestMapping("/update")
    public ActionResult update(BaseSeries series){
        return seriesService.update(series);
    }
}
