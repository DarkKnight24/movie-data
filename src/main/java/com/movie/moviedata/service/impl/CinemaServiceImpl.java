package com.movie.moviedata.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.movie.moviedata.entity.Cinema;
import com.movie.moviedata.dao.CinemaMapper;
import com.movie.moviedata.service.CinemaService;
@Service
public class CinemaServiceImpl implements CinemaService{

    @Resource
    private CinemaMapper cinemaMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cinemaMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Cinema record) {
        return cinemaMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Cinema record) {
        return cinemaMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Cinema record) {
        return cinemaMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Cinema record) {
        return cinemaMapper.insertSelective(record);
    }

    @Override
    public Cinema selectByPrimaryKey(Long id) {
        return cinemaMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Cinema record) {
        return cinemaMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Cinema record) {
        return cinemaMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Cinema> list) {
        return cinemaMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Cinema> list) {
        return cinemaMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Cinema> list) {
        return cinemaMapper.batchInsert(list);
    }

}
