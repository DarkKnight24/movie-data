package com.movie.moviedata.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.movie.moviedata.entity.AreaType;
import com.movie.moviedata.dao.AreaTypeMapper;
import com.movie.moviedata.service.AreaTypeService;
@Service
public class AreaTypeServiceImpl implements AreaTypeService{

    @Resource
    private AreaTypeMapper areaTypeMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return areaTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AreaType record) {
        return areaTypeMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(AreaType record) {
        return areaTypeMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(AreaType record) {
        return areaTypeMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(AreaType record) {
        return areaTypeMapper.insertSelective(record);
    }

    @Override
    public AreaType selectByPrimaryKey(Long id) {
        return areaTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AreaType record) {
        return areaTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AreaType record) {
        return areaTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<AreaType> list) {
        return areaTypeMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<AreaType> list) {
        return areaTypeMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<AreaType> list) {
        return areaTypeMapper.batchInsert(list);
    }

}
