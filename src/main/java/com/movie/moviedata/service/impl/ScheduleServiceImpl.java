package com.movie.moviedata.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.movie.base.utils.BeanUtil;
import com.movie.base.utils.Page;
import com.movie.moviedata.dao.ScheduleMapper;
import com.movie.moviedata.dto.ScheduleDto;
import com.movie.moviedata.entity.Schedule;
import com.movie.moviedata.param.SelectScheduleParam;
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
    
    @Override
    public Page selectSchedule(SelectScheduleParam param, Page page) {
        PageHelper.startPage(page);
        List<ScheduleDto> scheduleDtos = scheduleMapper.selectSchedule(param);
        page.setList(scheduleDtos);
        BeanUtil.copyProperties(new PageInfo(scheduleDtos), page);
        return page;
    }
}
