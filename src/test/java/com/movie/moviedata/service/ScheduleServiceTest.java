package com.movie.moviedata.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.movie.base.utils.JsonUtil;

@SpringBootTest
public class ScheduleServiceTest {
    
    @Autowired
    private ScheduleService scheduleService;
    
    @Test
    public void listScheduleByCinemaId() {
        Object o = scheduleService.listScheduleByCinemaId(1L);
        System.out.println(JsonUtil.toJson(o));
    }
}
