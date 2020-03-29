package com.movie.moviedata.controller;

import com.movie.base.utils.Page;
import com.movie.moviedata.param.CinemaSelectParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.movie.moviedata.entity.Cinema;
import com.movie.moviedata.service.CinemaService;
import com.movie.moviedata.service.CinemaTypeService;

/**
 * @作者 ：soul
 * @创建日期 ：Created in 2020/3/13 21:37 @描述：
 */
@Controller
@CrossOrigin
@RequestMapping("movie/cinema")
public class CinemaController {
    
    @Autowired
    private CinemaTypeService cinemaTypeService;
    
    @Autowired
    private CinemaService cinemaService;
    
    @GetMapping("type/all")
    @ResponseBody
    public Object getCinema() {
        return cinemaTypeService.getAll();
    }
    
    @ResponseBody
    @PostMapping("insert")
    public Object insertCinema(Cinema cinema) {
        return cinemaService.insertSelective(cinema) > 0;
    }

    @ResponseBody
    @GetMapping("all")
    public Object selectCinemaByParam(Page page, CinemaSelectParam param){
        return cinemaService.selectByParam(page,param);
    }

    @ResponseBody
    @GetMapping("get-cinema/{cinemaTypeId}")
    public Object selectCinemaAll(@PathVariable Long cinemaTypeId){
        return cinemaService.selectCinema(cinemaTypeId);
    }

    @ResponseBody
    @GetMapping("detail/{cinemaId}")
    public Object selectCinemaById(@PathVariable Long cinemaId){
        return cinemaService.selectByPrimaryKey(cinemaId);
    }

    @ResponseBody
    @PostMapping("delete")
    public Object deleteCinema(Cinema cinema){
        cinema.setDeleteMark(true);
        return cinemaService.updateByPrimaryKeySelective(cinema)>0;
    }

    @ResponseBody
    @PostMapping("update")
    public Object updateCinema(Cinema cinema){
        return cinemaService.updateByPrimaryKeySelective(cinema)>0;
    }
}
