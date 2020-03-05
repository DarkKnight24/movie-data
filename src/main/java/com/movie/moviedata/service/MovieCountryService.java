package com.movie.moviedata.service;

import com.movie.moviedata.entity.MovieCountry;

import java.util.List;

public interface MovieCountryService {


    int deleteByPrimaryKey(Integer id);

    int insert(MovieCountry record);

    int insertOrUpdate(MovieCountry record);

    int insertOrUpdateSelective(MovieCountry record);

    int insertSelective(MovieCountry record);

    MovieCountry selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MovieCountry record);

    int updateByPrimaryKey(MovieCountry record);

    int updateBatch(List<MovieCountry> list);

    int updateBatchSelective(List<MovieCountry> list);

    int batchInsert(List<MovieCountry> list);


}
