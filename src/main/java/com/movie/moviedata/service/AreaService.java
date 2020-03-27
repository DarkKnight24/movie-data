package com.movie.moviedata.service;

import java.util.List;

import com.movie.moviedata.entity.Area;

public interface AreaService {
    
    int deleteByPrimaryKey(Integer id);
    
    int insert(Area record);
    
    int insertOrUpdate(Area record);
    
    int insertOrUpdateSelective(Area record);
    
    int insertSelective(Area record);
    
    Area selectByPrimaryKey(Integer id);
    
    int updateByPrimaryKeySelective(Area record);
    
    int updateByPrimaryKey(Area record);
    
    int updateBatch(List<Area> list);
    
    int updateBatchSelective(List<Area> list);
    
    int batchInsert(List<Area> list);
    
    List<Area> selectByProvince(String cityName);
    
    List<Area> selectAllProvince();
    
    List<Area> selectBypId(Integer pId);
}
