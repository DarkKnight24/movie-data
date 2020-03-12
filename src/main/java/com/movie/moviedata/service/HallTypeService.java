package com.movie.moviedata.service;

import java.util.List;
import com.movie.moviedata.entity.HallType;
public interface HallTypeService{


    int deleteByPrimaryKey(Integer hallId);

    int insert(HallType record);

    int insertOrUpdate(HallType record);

    int insertOrUpdateSelective(HallType record);

    int insertSelective(HallType record);

    HallType selectByPrimaryKey(Integer hallId);

    int updateByPrimaryKeySelective(HallType record);

    int updateByPrimaryKey(HallType record);

    int updateBatch(List<HallType> list);

    int updateBatchSelective(List<HallType> list);

    int batchInsert(List<HallType> list);

}
