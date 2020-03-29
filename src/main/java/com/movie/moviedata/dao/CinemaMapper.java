package com.movie.moviedata.dao;

import com.movie.moviedata.dto.CinemaDto;
import com.movie.moviedata.entity.Cinema;
import java.util.List;

import com.movie.moviedata.param.CinemaSelectParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CinemaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Cinema record);

    int insertOrUpdate(Cinema record);

    int insertOrUpdateSelective(Cinema record);

    int insertSelective(Cinema record);

    CinemaDto selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Cinema record);

    int updateByPrimaryKey(Cinema record);

    int updateBatch(List<Cinema> list);

    int updateBatchSelective(List<Cinema> list);

    int batchInsert(@Param("list") List<Cinema> list);

    List<CinemaDto> selectByPyParam(CinemaSelectParam param);

    List<Cinema> selectCinemaAll(Long cinemaType);
}