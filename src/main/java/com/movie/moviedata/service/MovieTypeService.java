package com.movie.moviedata.service;

import com.movie.moviedata.entity.MovieType;

import java.util.List;

public interface MovieTypeService {


    int deleteByPrimaryKey(Long id);

    int insert(MovieType record);

    int insertOrUpdate(MovieType record);

    int insertOrUpdateSelective(MovieType record);

    int insertSelective(MovieType record);

    MovieType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MovieType record);

    int updateByPrimaryKey(MovieType record);

    int updateBatch(List<MovieType> list);

    int updateBatchSelective(List<MovieType> list);

    int batchInsert(List<MovieType> list);

    List<MovieType> selectAll();

}
