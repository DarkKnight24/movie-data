package com.movie.moviedata.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.movie.moviedata.dao.HallTypeMapper;
import com.movie.moviedata.entity.HallType;
import com.movie.moviedata.service.HallTypeService;
@Service
public class HallTypeServiceImpl implements HallTypeService{

    @Resource
    private HallTypeMapper hallTypeMapper;

    @Override
    public int deleteByPrimaryKey(Integer hallId) {
        return hallTypeMapper.deleteByPrimaryKey(hallId);
    }

    @Override
    public int insert(HallType record) {
        return hallTypeMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(HallType record) {
        return hallTypeMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(HallType record) {
        return hallTypeMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(HallType record) {
        return hallTypeMapper.insertSelective(record);
    }

    @Override
    public HallType selectByPrimaryKey(Integer hallId) {
        return hallTypeMapper.selectByPrimaryKey(hallId);
    }

    @Override
    public int updateByPrimaryKeySelective(HallType record) {
        return hallTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HallType record) {
        return hallTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<HallType> list) {
        return hallTypeMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<HallType> list) {
        return hallTypeMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<HallType> list) {
        return hallTypeMapper.batchInsert(list);
    }

}
