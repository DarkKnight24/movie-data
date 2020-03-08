package com.movie.moviedata.controller;

import com.movie.file.utils.Utils;
import com.movie.moviedata.entity.Movie;
import com.movie.moviedata.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("movie")
@CrossOrigin
public class MovieController {

    @Autowired
    private Utils utils;
    @Autowired
    private MovieService movieService;

    @ResponseBody
    @PostMapping("file-upload")
    public Object fileUpload(@RequestParam(value = "file") MultipartFile file){
        try {
            byte[] bytes = file.getBytes();
            String fileName = utils.upLoadFile(bytes, file.getOriginalFilename());
            return fileName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @ResponseBody
    @PostMapping("add-movie")
    public Object insertMovie(@RequestBody Movie movie){
        return movieService.insert(movie)>0?true:false;
    }

    @ResponseBody
    @PostMapping("update-movie")
    public Object updateMovie(@RequestBody Movie movie){
        return movieService.updateByPrimaryKeySelective(movie)>0?true:false;
    }

    @ResponseBody
    @GetMapping("find-all")
    public Object findAllMovies(){
       return movieService.selectAll();
    }

    @ResponseBody
    @GetMapping("detail/{movieId}")
    public Object findMovieById(@PathVariable(value = "movieId")Long movieId){
        return movieService.selectByPrimaryKey(movieId);
    }
}
