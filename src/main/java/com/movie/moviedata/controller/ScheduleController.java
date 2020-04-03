package com.movie.moviedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.movie.base.utils.Page;
import com.movie.moviedata.entity.Schedule;
import com.movie.moviedata.param.SelectScheduleParam;
import com.movie.moviedata.service.ScheduleService;

@Controller
@RequestMapping("movie/schedule")
public class ScheduleController {
    
    @Autowired
    private ScheduleService scheduleService;
    
    @ResponseBody
    @PostMapping("insert")
    public Object insertSchedule(Schedule schedule) {
        return scheduleService.insertSelective(schedule) > 0;
    }
    
    @ResponseBody
    @GetMapping("all")
    public Object selectSchedule(SelectScheduleParam param, Page page) {
        return scheduleService.selectSchedule(param, page);
    }
    
}
