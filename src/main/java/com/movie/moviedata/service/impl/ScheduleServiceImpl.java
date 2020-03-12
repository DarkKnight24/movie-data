package com.movie.moviedata.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.movie.moviedata.entity.Schedule;
import com.movie.moviedata.dao.ScheduleMapper;
import com.movie.moviedata.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Resource
    private ScheduleMapper scheduleMapper;

    @Override
    public int deleteByPrimaryKey(Long scheduleId) {
        return scheduleMapper.deleteByPrimaryKey(scheduleId);
    }

    @Override
    public int insert(Schedule record) {
        return scheduleMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Schedule record) {
        return scheduleMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Schedule record) {
        return scheduleMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Schedule record) {
        return scheduleMapper.insertSelective(record);
    }

    @Override
    public Schedule selectByPrimaryKey(Long scheduleId) {
        return scheduleMapper.selectByPrimaryKey(scheduleId);
    }

    @Override
    public int updateByPrimaryKeySelective(Schedule record) {
        return scheduleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Schedule record) {
        return scheduleMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Schedule> list) {
        return scheduleMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Schedule> list) {
        return scheduleMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Schedule> list) {
        return scheduleMapper.batchInsert(list);
    }

}

