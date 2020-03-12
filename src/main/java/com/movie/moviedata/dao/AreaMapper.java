package com.movie.moviedata.dao;

import com.movie.moviedata.entity.Area;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}