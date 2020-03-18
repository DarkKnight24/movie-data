package com.movie.moviedata.service;

import com.movie.base.utils.Page;
import com.movie.moviedata.entity.CinemaMovieReleation;
import com.movie.moviedata.param.CinemaMovieRelationParam;

import java.util.List;

public interface CinemaMovieReleationService {


    int deleteByPrimaryKey(Long id);

    int insert(CinemaMovieReleation record);

    int insertOrUpdate(CinemaMovieReleation record);

    int insertOrUpdateSelective(CinemaMovieReleation record);

    int insertSelective(CinemaMovieReleation record);

    CinemaMovieReleation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CinemaMovieReleation record);

    int updateByPrimaryKey(CinemaMovieReleation record);

    int updateBatch(List<CinemaMovieReleation> list);

    int updateBatchSelective(List<CinemaMovieReleation> list);

    int batchInsert(List<CinemaMovieReleation> list);

    Page selectBySelective(CinemaMovieRelationParam param, Page page);
}
