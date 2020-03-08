package com.movie.moviedata.controller;

import com.movie.base.utils.Util;
import com.movie.file.utils.Utils;
import com.movie.moviedata.service.MovieCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("movie")
@CrossOrigin
public class MovieCountryController {

    @Autowired
    private MovieCountryService movieCountryService;


    @ResponseBody
    @GetMapping("country/all")
    public Object getCountyAll() {
        return movieCountryService.selectAll();
    }


}
