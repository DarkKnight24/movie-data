package com.movie.moviedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.movie.base.utils.Page;
import com.movie.moviedata.entity.Hall;
import com.movie.moviedata.param.HallSelectParam;
import com.movie.moviedata.service.HallService;
import com.movie.moviedata.service.HallTypeService;

/**
 * @作者 ：soul
 * @创建日期 ：Created in 2020/3/13 21:44 @描述：
 */
@RequestMapping("movie/hall")
@CrossOrigin
@Controller
public class HallController {
    
    @Autowired
    private HallTypeService hallTypeService;
    
    @Autowired
    private HallService hallService;
    
    @GetMapping("type/all")
    @ResponseBody
    public Object getAll() {
        return hallTypeService.getAll();
    }
    
    @ResponseBody
    @PostMapping("insert")
    public Object insert(Hall hall) {
        return hallService.insertSelective(hall) > 0;
    }
    
    @ResponseBody
    @GetMapping("all")
    public Object selectByParam(HallSelectParam param, Page page) {
        return hallService.selectByParam(param, page);
    }
    
    @ResponseBody
    @PostMapping("delete")
    public Object deleteHall(Long hallId) {
        return hallService.deleteByPrimaryKey(hallId) > 0;
    }
    
    @ResponseBody
    @GetMapping("list")
    public Object hallList(HallSelectParam param) {
        return hallService.selectByParam(param);
    }
}
