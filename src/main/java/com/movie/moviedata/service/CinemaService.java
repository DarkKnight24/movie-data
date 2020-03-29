package com.movie.moviedata.service;

import java.util.List;

import com.movie.base.utils.Page;
import com.movie.moviedata.dto.CinemaDetailDto;
import com.movie.moviedata.dto.CinemaDto;
import com.movie.moviedata.entity.Cinema;
import com.movie.moviedata.param.CinemaSelectParam;

public interface CinemaService{


    int deleteByPrimaryKey(Long id);

    int insert(Cinema record);

    int insertOrUpdate(Cinema record);

    int insertOrUpdateSelective(Cinema record);

    int insertSelective(Cinema record);

    CinemaDetailDto selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Cinema record);

    int updateByPrimaryKey(Cinema record);

    int updateBatch(List<Cinema> list);

    int updateBatchSelective(List<Cinema> list);

    int batchInsert(List<Cinema> list);

    Page selectByParam(Page page, CinemaSelectParam param);

    List<Cinema> selectCinema(Long cinemaType);
}
