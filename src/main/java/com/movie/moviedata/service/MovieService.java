package com.movie.moviedata.service;

import java.util.List;

import com.movie.base.dto.MovieDetailDto;
import com.movie.base.dto.MovieDto;
import com.movie.base.utils.Page;
import com.movie.moviedata.entity.Movie;
import com.movie.moviedata.param.MovieSelectParam;

public interface MovieService {
    
    int deleteByPrimaryKey(Long movieId);
    
    int insert(Movie record);
    
    int insertOrUpdate(Movie record);
    
    int insertOrUpdateSelective(Movie record);
    
    int insertSelective(Movie record);
    
    MovieDetailDto selectByPrimaryKey(Long movieId);
    
    int updateByPrimaryKeySelective(Movie record);
    
    int updateByPrimaryKey(Movie record);
    
    int updateBatch(List<Movie> list);
    
    int updateBatchSelective(List<Movie> list);
    
    int batchInsert(List<Movie> list);
    
    List<MovieDto> selectAll();
    
    Page selectByParam(MovieSelectParam param, Page page);
    
    List<Movie> selectByCinemaType(Long cinemaTypeId);
}
