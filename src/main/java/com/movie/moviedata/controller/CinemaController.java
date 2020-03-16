package com.movie.moviedata.controller;

import com.movie.moviedata.service.CinemaService;
import com.movie.moviedata.service.CinemaTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @作者 ：soul
 * @创建日期 ：Created in 2020/3/13 21:37
 * @描述：
 */
@Controller
@CrossOrigin
@RequestMapping("movie/cinema")
public class CinemaController {

    @Autowired
    private CinemaTypeService cinemaTypeService;
    @GetMapping("type/all")
    @ResponseBody
    public Object getCinema(){
        return cinemaTypeService.getAll();
    }
}
