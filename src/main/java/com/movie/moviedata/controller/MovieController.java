package com.movie.moviedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.movie.base.utils.Page;
import com.movie.moviedata.entity.Movie;
import com.movie.moviedata.param.MovieSelectParam;
import com.movie.moviedata.service.MovieService;

@Controller
@RequestMapping("movie")
@CrossOrigin
public class MovieController {
    
    @Autowired
    private MovieService movieService;
    
    @ResponseBody
    @PostMapping("add-movie")
    public Object insertMovie(@RequestBody Movie movie) {
        return movieService.insert(movie) > 0 ? true : false;
    }
    
    @ResponseBody
    @PostMapping("update-movie")
    public Object updateMovie(@RequestBody Movie movie) {
        return movieService.updateByPrimaryKeySelective(movie) > 0 ? true : false;
    }
    
    @ResponseBody
    @GetMapping("find-all")
    public Object findAllMovies() {
        return movieService.selectAll();
    }
    
    @ResponseBody
    @GetMapping("detail/{movieId}")
    public Object findMovieById(@PathVariable(value = "movieId") Long movieId) {
        return movieService.selectByPrimaryKey(movieId);
    }
    
    @ResponseBody
    @GetMapping("findByParam")
    public Object findMovieByParam(MovieSelectParam param, Page page) {
        
        return movieService.selectByParam(param, page);
    }
    
    @ResponseBody
    @GetMapping("list/{cinemaTypeId}")
    public Object findMovieByCinemaType(@PathVariable Long cinemaTypeId) {
        return movieService.selectByCinemaType(cinemaTypeId);
    }
}
