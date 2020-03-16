package com.movie.moviedata.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.movie.moviedata.entity.CinemaType;
import com.movie.moviedata.dao.CinemaTypeMapper;
import com.movie.moviedata.service.CinemaTypeService;
@Service
public class CinemaTypeServiceImpl implements CinemaTypeService{

    @Resource
    private CinemaTypeMapper cinemaTypeMapper;

    @Override
    public int deleteByPrimaryKey(Long cinemaId) {
        return cinemaTypeMapper.deleteByPrimaryKey(cinemaId);
    }

    @Override
    public int insert(CinemaType record) {
        return cinemaTypeMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CinemaType record) {
        return cinemaTypeMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CinemaType record) {
        return cinemaTypeMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CinemaType record) {
        return cinemaTypeMapper.insertSelective(record);
    }

    @Override
    public CinemaType selectByPrimaryKey(Long cinemaId) {
        return cinemaTypeMapper.selectByPrimaryKey(cinemaId);
    }

    @Override
    public int updateByPrimaryKeySelective(CinemaType record) {
        return cinemaTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CinemaType record) {
        return cinemaTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CinemaType> list) {
        return cinemaTypeMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<CinemaType> list) {
        return cinemaTypeMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<CinemaType> list) {
        return cinemaTypeMapper.batchInsert(list);
    }

    @Override
    public List<CinemaType> getAll() {
        return cinemaTypeMapper.getAll();
    }
}
