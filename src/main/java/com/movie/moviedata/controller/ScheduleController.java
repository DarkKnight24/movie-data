package com.movie.moviedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.movie.base.utils.Page;
import com.movie.moviedata.entity.Schedule;
import com.movie.moviedata.param.SelectScheduleParam;
import com.movie.moviedata.service.ScheduleService;

import io.swagger.annotations.Api;

@Controller
@RequestMapping("movie/schedule")
@Api("场次服务接口")
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
    
    @ResponseBody
    @GetMapping("list/{cinemaId}")
    public Object listScheduleByCinemaId(@PathVariable Long cinemaId) {
        return scheduleService.listScheduleByCinemaId(cinemaId);
    }
    
}
