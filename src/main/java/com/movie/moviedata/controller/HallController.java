package com.movie.moviedata.controller;

import com.movie.moviedata.service.HallTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @作者 ：soul
 * @创建日期 ：Created in 2020/3/13 21:44
 * @描述：
 */
@RequestMapping("movie/hall")
@CrossOrigin
@Controller
public class HallController {

    @Autowired
    private HallTypeService hallTypeService;
    @GetMapping("type/all")
    @ResponseBody
    public Object getAll(){
        return hallTypeService.getAll();
    }
}
