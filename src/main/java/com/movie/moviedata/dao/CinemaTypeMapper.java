package com.movie.moviedata.dao;

import com.movie.moviedata.entity.CinemaType;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CinemaTypeMapper {
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

    int batchInsert(@Param("list") List<CinemaType> list);
}