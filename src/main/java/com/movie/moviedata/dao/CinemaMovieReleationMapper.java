package com.movie.moviedata.dao;

import com.movie.moviedata.dto.CinemaMovieDto;
import com.movie.moviedata.entity.CinemaMovieReleation;
import com.movie.moviedata.param.CinemaMovieRelationParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CinemaMovieReleationMapper {
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

    int batchInsert(@Param("list") List<CinemaMovieReleation> list);

    List<CinemaMovieDto> selectBySelective(@Param("param") CinemaMovieRelationParam param);
}