package com.movie.moviedata.service;

import java.util.List;
import com.movie.moviedata.entity.Schedule;

public interface ScheduleService {


    int deleteByPrimaryKey(Long scheduleId);

    int insert(Schedule record);

    int insertOrUpdate(Schedule record);

    int insertOrUpdateSelective(Schedule record);

    int insertSelective(Schedule record);

    Schedule selectByPrimaryKey(Long scheduleId);

    int updateByPrimaryKeySelective(Schedule record);

    int updateByPrimaryKey(Schedule record);

    int updateBatch(List<Schedule> list);

    int updateBatchSelective(List<Schedule> list);

    int batchInsert(List<Schedule> list);

}
