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
    
    @ResponseBody
    @GetMapping("province/all")
    public Object getAllProvince() {
        return areaService.selectAllProvince();
    }
    
    @ResponseBody
    @GetMapping("select/by-pid/{pId}")
    public Object getAreaBypId(@PathVariable Integer pId) {
        return areaService.selectBypId(pId);
    }
}
