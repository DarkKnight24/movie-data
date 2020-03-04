package com.movie.moviedata.dao;

import com.movie.moviedata.entity.Movie;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
}