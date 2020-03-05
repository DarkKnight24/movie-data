package com.movie.moviedata.controller;

import com.movie.moviedata.service.MovieTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("movie")
@CrossOrigin
public class MovieTypeController {


    @Autowired
    private MovieTypeService movieTypeService;

    @RequestMapping("type/getAll")
    @ResponseBody
    public Object getMovieType() {
        return movieTypeService.selectAll();
    }
}
