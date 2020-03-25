package com.movie.moviedata.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.movie.moviedata.entity.Area;

@Mapper
public interface AreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Area record);

    int insertOrUpdate(Area record);

    int insertOrUpdateSelective(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);

    int updateBatch(List<Area> list);

    int updateBatchSelective(List<Area> list);

    int batchInsert(@Param("list") List<Area> list);

    Area selectByName(String cityName);

    List<Area> selectByPId(Integer id);
}