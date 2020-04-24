package com.movie.moviedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.movie.base.utils.Page;
import com.movie.moviedata.entity.CinemaMovieReleation;
import com.movie.moviedata.param.CinemaMovieRelationParam;
import com.movie.moviedata.service.CinemaMovieReleationService;

@Controller
@RequestMapping("movie/cinema-relation")
@CrossOrigin
public class CinemaMovieReleationController {
    
    @Autowired
    private CinemaMovieReleationService cinemaMovieReleationService;
    
    @ResponseBody
    @PostMapping("insert")
    public Object insert(@RequestBody CinemaMovieReleation cinemaMovieReleation) {
        return cinemaMovieReleationService.insertSelective(cinemaMovieReleation) > 0;
    }
    
    @ResponseBody
    @GetMapping("select-by-param")
    public Object selectByParam(CinemaMovieRelationParam param, Page page) {
        return cinemaMovieReleationService.selectBySelective(param, page);
    }
    
    @ResponseBody
    @PostMapping("delete")
    public Object delete(CinemaMovieReleation releation) {
        releation.setDeleteMark(true);
        return cinemaMovieReleationService.updateByPrimaryKey(releation) > 0;
    }
    
    @ResponseBody
    @PostMapping("update")
    public Object update(CinemaMovieReleation releation) {
        return cinemaMovieReleationService.updateByPrimaryKey(releation) > 0;
    }
}
