package com.movie.moviedata.dao;

import com.movie.moviedata.entity.AreaType;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AreaTypeMapper {
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

    int batchInsert(@Param("list") List<AreaType> list);
}