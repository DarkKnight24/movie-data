package com.movie.moviedata.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.movie.moviedata.dto.ScheduleDto;
import com.movie.moviedata.entity.Schedule;
import com.movie.moviedata.param.SelectScheduleParam;

@Mapper
public interface ScheduleMapper {
    int deleteByPrimaryKey(Long scheduleId);
    
    int insert(Schedule record);
    
    int insertOrUpdate(Schedule record);
    
    int insertOrUpdateSelective(Schedule record);
    
    int insertSelective(Schedule record);
    
    ScheduleDto selectByPrimaryKey(Long scheduleId);
    
    int updateByPrimaryKeySelective(Schedule record);
    
    int updateByPrimaryKey(Schedule record);
    
    int updateBatch(List<Schedule> list);
    
    int updateBatchSelective(List<Schedule> list);
    
    int batchInsert(@Param("list") List<Schedule> list);
    
    List<ScheduleDto> selectSchedule(SelectScheduleParam param);
    
    List<ScheduleDto> listScheduleByCinemaId(Long cinemaId);
}