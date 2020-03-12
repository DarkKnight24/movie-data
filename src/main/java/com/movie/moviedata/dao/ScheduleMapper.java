package com.movie.moviedata.dao;

import com.movie.moviedata.entity.Schedule;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleMapper {
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

    int batchInsert(@Param("list") List<Schedule> list);
}