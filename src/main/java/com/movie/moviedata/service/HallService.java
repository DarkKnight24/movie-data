package com.movie.moviedata.service;

import java.util.List;

import com.movie.base.utils.Page;
import com.movie.moviedata.dto.HallDto;
import com.movie.moviedata.entity.Hall;
import com.movie.moviedata.param.HallSelectParam;

public interface HallService {
    
    int deleteByPrimaryKey(Long id);
    
    int insert(Hall record);
    
    int insertOrUpdate(Hall record);
    
    int insertOrUpdateSelective(Hall record);
    
    int insertSelective(Hall record);
    
    Hall selectByPrimaryKey(Long id);
    
    int updateByPrimaryKeySelective(Hall record);
    
    int updateByPrimaryKey(Hall record);
    
    int updateBatch(List<Hall> list);
    
    int updateBatchSelective(List<Hall> list);
    
    int batchInsert(List<Hall> list);
    
    Page selectByParam(HallSelectParam param, Page page);
    
    List<HallDto> selectByParam(HallSelectParam param);
}
