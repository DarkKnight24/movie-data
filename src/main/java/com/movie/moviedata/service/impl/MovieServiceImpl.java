package com.movie.moviedata.service.impl;

import com.movie.moviedata.dao.MovieMapper;
import com.movie.moviedata.entity.Movie;
import com.movie.moviedata.service.MovieService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

    @Resource
    private MovieMapper movieMapper;

    @Override
    public int deleteByPrimaryKey(Long movieId) {
        return movieMapper.deleteByPrimaryKey(movieId);
    }

    @Override
    public int insert(Movie record) {
        return movieMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Movie record) {
        return movieMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Movie record) {
        return movieMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Movie record) {
        return movieMapper.insertSelective(record);
    }

    @Override
    public Movie selectByPrimaryKey(Long movieId) {
        return movieMapper.selectByPrimaryKey(movieId);
    }

    @Override
    public int updateByPrimaryKeySelective(Movie record) {
        return movieMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Movie record) {
        return movieMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Movie> list) {
        return movieMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Movie> list) {
        return movieMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Movie> list) {
        return movieMapper.batchInsert(list);
    }

}
