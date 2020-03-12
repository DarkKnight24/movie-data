package com.movie.moviedata.service;

import java.util.List;
import com.movie.moviedata.entity.Hall;
public interface HallService{


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

    int batchInsert(List<Hall> list);

}
