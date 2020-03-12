package com.movie.moviedata.dao;

import com.movie.moviedata.entity.Hall;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HallMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Hall record);

    int insertOrUpdate(Hall record);

    int insertOrUpdateSelective(Hall record);

    int insertSelective(Hall record);

    Hall selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Hall record);

    int updateByPrimaryKey(Hall record);

    int updateBatch(List<Hall> list);

    int updateBatchSelective(List<Hall> list);

    int batchInsert(@Param("list") List<Hall> list);
}