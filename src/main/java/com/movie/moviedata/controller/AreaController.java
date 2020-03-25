package com.movie.moviedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.movie.moviedata.service.AreaService;

/**
 * @author Mengcc
 */
@Controller
@CrossOrigin
@RequestMapping("area")
public class AreaController {
    
    @Autowired
    private AreaService areaService;
    
    @ResponseBody
    @PostMapping("city")
    public Object getCityByProvince(@RequestBody String cityName) {
        return areaService.selectByProvince(cityName);
    }
}
