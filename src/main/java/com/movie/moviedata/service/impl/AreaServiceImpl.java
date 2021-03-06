package com.movie.moviedata.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.movie.moviedata.dao.AreaMapper;
import com.movie.moviedata.entity.Area;
import com.movie.moviedata.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {
    
    @Resource
    private AreaMapper areaMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return areaMapper.deleteByPrimaryKey(id);
    }
    
    @Override
    public int insert(Area record) {
        return areaMapper.insert(record);
    }
    
    @Override
    public int insertOrUpdate(Area record) {
        return areaMapper.insertOrUpdate(record);
    }
    
    @Override
    public int insertOrUpdateSelective(Area record) {
        return areaMapper.insertOrUpdateSelective(record);
    }
    
    @Override
    public int insertSelective(Area record) {
        return areaMapper.insertSelective(record);
    }
    
    @Override
    public Area selectByPrimaryKey(Integer id) {
        return areaMapper.selectByPrimaryKey(id);
    }
    
    @Override
    public int updateByPrimaryKeySelective(Area record) {
        return areaMapper.updateByPrimaryKeySelective(record);
    }
    
    @Override
    public int updateByPrimaryKey(Area record) {
        return areaMapper.updateByPrimaryKey(record);
    }
    
    @Override
    public int updateBatch(List<Area> list) {
        return areaMapper.updateBatch(list);
    }
    
    @Override
    public int updateBatchSelective(List<Area> list) {
        return areaMapper.updateBatchSelective(list);
    }
    
    @Override
    public int batchInsert(List<Area> list) {
        return areaMapper.batchInsert(list);
    }
    
    @Override
    public List<Area> selectByProvince(String cityName) {
        
        Area area = areaMapper.selectByName(cityName);
        List<Area> areas = areaMapper.selectByPId(area.getId());
        
        return areas.size() <= 1 ? areaMapper.selectByPId(areas.get(0).getId()) : areas;
    }
    
    @Override
    public List<Area> selectAllProvince() {
        return areaMapper.selectByPId(1);
    }
    
    @Override
    public List<Area> selectBypId(Integer pId) {
        return areaMapper.selectByPId(pId);
    }
}
