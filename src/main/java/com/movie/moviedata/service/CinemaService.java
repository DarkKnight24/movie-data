package com.movie.moviedata.service;

import java.util.List;
import com.movie.moviedata.entity.Cinema;
public interface CinemaService{


    int deleteByPrimaryKey(Long id);

    int insert(Cinema record);

    int insertOrUpdate(Cinema record);

    int insertOrUpdateSelective(Cinema record);

    int insertSelective(Cinema record);

    Cinema selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Cinema record);

    int updateByPrimaryKey(Cinema record);

    int updateBatch(List<Cinema> list);

    int updateBatchSelective(List<Cinema> list);

    int batchInsert(List<Cinema> list);

}
