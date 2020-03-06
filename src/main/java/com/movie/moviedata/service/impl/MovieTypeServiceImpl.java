package com.movie.moviedata.service.impl;

import com.movie.moviedata.dao.MovieTypeMapper;
import com.movie.moviedata.entity.MovieType;
import com.movie.moviedata.service.MovieTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MovieTypeServiceImpl implements MovieTypeService {

    @Resource
    private MovieTypeMapper movieTypeMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return movieTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MovieType record) {
        return movieTypeMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(MovieType record) {
        return movieTypeMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(MovieType record) {
        return movieTypeMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(MovieType record) {
        return movieTypeMapper.insertSelective(record);
    }

    @Override
    public MovieType selectByPrimaryKey(Long id) {
        return movieTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MovieType record) {
        return movieTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MovieType record) {
        return movieTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<MovieType> list) {
        return movieTypeMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<MovieType> list) {
        return movieTypeMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<MovieType> list) {
        return movieTypeMapper.batchInsert(list);
    }

    @Override
    public List<MovieType> selectAll() {
        return movieTypeMapper.selectAll();
    }
}
