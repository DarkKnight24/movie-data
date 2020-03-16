package com.movie.moviedata.service;

import java.util.List;
import com.movie.moviedata.entity.CinemaType;
public interface CinemaTypeService{


    int deleteByPrimaryKey(Long cinemaId);

    int insert(CinemaType record);

    int insertOrUpdate(CinemaType record);

    int insertOrUpdateSelective(CinemaType record);

    int insertSelective(CinemaType record);

    CinemaType selectByPrimaryKey(Long cinemaId);

    int updateByPrimaryKeySelective(CinemaType record);

    int updateByPrimaryKey(CinemaType record);

    int updateBatch(List<CinemaType> list);

    int updateBatchSelective(List<CinemaType> list);

    int batchInsert(List<CinemaType> list);

    List<CinemaType> getAll();
}
