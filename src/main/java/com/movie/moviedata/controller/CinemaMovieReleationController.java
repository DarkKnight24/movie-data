package com.movie.moviedata.controller;

import com.movie.base.utils.Page;
import com.movie.moviedata.entity.CinemaMovieReleation;
import com.movie.moviedata.param.CinemaMovieRelationParam;
import com.movie.moviedata.service.CinemaMovieReleationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("movie")
@CrossOrigin
public class CinemaMovieReleationController {

    @Autowired
    private CinemaMovieReleationService cinemaMovieReleationService;

    @ResponseBody
    @PostMapping("cinema-relation/insert")
    public Object insert(@RequestBody CinemaMovieReleation cinemaMovieReleation) {
        return cinemaMovieReleationService.insertSelective(cinemaMovieReleation) > 0;
    }

    @ResponseBody
    @GetMapping("cinema-relation/select-by-param")
    public Object selectByParam(CinemaMovieRelationParam param, Page page) {
        return cinemaMovieReleationService.selectBySelective(param, page);
    }
}
