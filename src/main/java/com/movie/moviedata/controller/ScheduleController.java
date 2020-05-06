package com.movie.moviedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.movie.base.interfaces.ScheduleClient;
import com.movie.base.utils.Page;
import com.movie.moviedata.entity.Schedule;
import com.movie.moviedata.param.SelectScheduleParam;
import com.movie.moviedata.service.ScheduleService;

import io.swagger.annotations.Api;

@Controller
@RequestMapping("movie/schedule")
@Api(tags = "场次服务接口")
public class ScheduleController implements ScheduleClient {
    
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
    
    @Override
    @ResponseBody
    @GetMapping("detail/{scheduleId}")
    public Object detail(@PathVariable Long scheduleId) {
        return scheduleService.selectByPrimaryKey(scheduleId);
    }
    
    @ResponseBody
    @PostMapping("delete")
    public Object delete(Schedule schedule) {
        schedule.setScheduleState(0);
        return scheduleService.updateByPrimaryKeySelective(schedule) > 0;
    }
    
    @ResponseBody
    @PostMapping("update")
    public Object update(Schedule schedule) {
        return scheduleService.updateByPrimaryKeySelective(schedule) > 0;
    }
}
