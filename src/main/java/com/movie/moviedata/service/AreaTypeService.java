package com.movie.moviedata.service;

import java.util.List;
import com.movie.moviedata.entity.AreaType;
public interface AreaTypeService{


    int deleteByPrimaryKey(Long id);

    int insert(AreaType record);

    int insertOrUpdate(AreaType record);

    int insertOrUpdateSelective(AreaType record);

    int insertSelective(AreaType record);

    AreaType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AreaType record);

    int updateByPrimaryKey(AreaType record);

    int updateBatch(List<AreaType> list);

    int updateBatchSelective(List<AreaType> list);

    int batchInsert(List<AreaType> list);

}
