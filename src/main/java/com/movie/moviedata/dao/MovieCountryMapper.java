package com.movie.moviedata.dao;

import com.movie.moviedata.entity.MovieCountry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MovieCountryMapper {
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

    int batchInsert(@Param("list") List<MovieCountry> list);
}