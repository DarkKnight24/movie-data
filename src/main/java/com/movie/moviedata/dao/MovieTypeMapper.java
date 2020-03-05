package com.movie.moviedata.dao;

import com.movie.moviedata.entity.MovieType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MovieTypeMapper {
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

    int batchInsert(@Param("list") List<MovieType> list);

    List<MovieType> selectAll();
}