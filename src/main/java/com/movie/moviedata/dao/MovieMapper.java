package com.movie.moviedata.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.movie.moviedata.dto.MovieDto;
import com.movie.moviedata.entity.Movie;
import com.movie.moviedata.param.MovieSelectParam;

@Mapper
public interface MovieMapper {
    int deleteByPrimaryKey(Long movieId);
    
    int insert(Movie record);
    
    int insertOrUpdate(Movie record);
    
    int insertOrUpdateSelective(Movie record);
    
    int insertSelective(Movie record);
    
    Movie selectByPrimaryKey(Long movieId);
    
    int updateByPrimaryKeySelective(Movie record);
    
    int updateByPrimaryKey(Movie record);
    
    int updateBatch(List<Movie> list);
    
    int updateBatchSelective(List<Movie> list);
    
    int batchInsert(@Param("list") List<Movie> list);
    
    List<Movie> selectAll();
    
    List<MovieDto> selectByParam(@Param("param") MovieSelectParam param);
    
    List<Movie> selectByCinemaType(Long cinemaTypeId);
}