package com.movie.moviedata.service.impl;

import com.movie.moviedata.dao.MovieCountryMapper;
import com.movie.moviedata.entity.MovieCountry;
import com.movie.moviedata.service.MovieCountryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class MovieCountryServiceImpl implements MovieCountryService {

    @Resource
    private MovieCountryMapper movieCountryMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return movieCountryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MovieCountry record) {
        return movieCountryMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(MovieCountry record) {
        return movieCountryMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(MovieCountry record) {
        return movieCountryMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(MovieCountry record) {
        return movieCountryMapper.insertSelective(record);
    }

    @Override
    public MovieCountry selectByPrimaryKey(Integer id) {
        return movieCountryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MovieCountry record) {
        return movieCountryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MovieCountry record) {
        return movieCountryMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<MovieCountry> list) {
        return movieCountryMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<MovieCountry> list) {
        return movieCountryMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<MovieCountry> list) {
        return movieCountryMapper.batchInsert(list);
    }

    @Override
    public List<MovieCountry> selectAll() {
        return movieCountryMapper.selectAll();
    }
}
