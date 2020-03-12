package com.movie.moviedata.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.movie.moviedata.dao.HallMapper;
import com.movie.moviedata.entity.Hall;
import com.movie.moviedata.service.HallService;
@Service
public class HallServiceImpl implements HallService{

    @Resource
    private HallMapper hallMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return hallMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Hall record) {
        return hallMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Hall record) {
        return hallMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Hall record) {
        return hallMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Hall record) {
        return hallMapper.insertSelective(record);
    }

    @Override
    public Hall selectByPrimaryKey(Long id) {
        return hallMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Hall record) {
        return hallMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Hall record) {
        return hallMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Hall> list) {
        return hallMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Hall> list) {
        return hallMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Hall> list) {
        return hallMapper.batchInsert(list);
    }

}
