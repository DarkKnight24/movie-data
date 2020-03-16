package com.movie.moviedata.dao;

import com.movie.moviedata.entity.HallType;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HallTypeMapper {
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

    int batchInsert(@Param("list") List<HallType> list);

    List<HallType> getAll();
}