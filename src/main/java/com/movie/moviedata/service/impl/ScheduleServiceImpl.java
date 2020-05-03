package com.movie.moviedata.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.movie.moviedata.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.movie.base.utils.BeanUtil;
import com.movie.base.utils.Page;
import com.movie.moviedata.dao.ScheduleMapper;
import com.movie.moviedata.dto.ScheduleDto;
import com.movie.moviedata.entity.Hall;
import com.movie.moviedata.entity.Schedule;
import com.movie.moviedata.param.SelectScheduleParam;
import com.movie.moviedata.service.HallService;
import com.movie.moviedata.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    
    @Resource
    private ScheduleMapper scheduleMapper;
    
    @Autowired
    private HallService hallService;

    @Autowired
    private MovieService movieService;
    
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
        Hall hall = hallService.selectByPrimaryKey(record.getHallId());
        record.setScheduleRemain(hall.getHallCapacity());
        return scheduleMapper.insertSelective(record);
    }
    
    @Override
    public ScheduleDto selectByPrimaryKey(Long scheduleId) {
        ScheduleDto scheduleDto = scheduleMapper.selectByPrimaryKey(scheduleId);
        scheduleDto.setMovieDto(movieService.selectByPrimaryKey(scheduleDto.getMovieId()));
        return scheduleDto;
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
    
    @Override
    public Object listScheduleByCinemaId(Long cinemaId) {
        
        return scheduleMapper.listScheduleByCinemaId(cinemaId);
    }
}
