package com.movie.moviedata.controller;

import com.movie.moviedata.service.MovieCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("movie")
@CrossOrigin
public class MovieCountryController {

    @Autowired
    private MovieCountryService movieCountryService;

    @ResponseBody
    @GetMapping("county/all")
    public Object getCountyAll() {
        return movieCountryService.selectAll();
    }
}
