package com.movie.moviedata.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.movie.base.utils.BeanUtil;
import com.movie.base.utils.Page;
import com.movie.moviedata.dao.CinemaMovieReleationMapper;
import com.movie.moviedata.dto.CinemaMovieDto;
import com.movie.moviedata.entity.CinemaMovieReleation;
import com.movie.moviedata.param.CinemaMovieRelationParam;
import com.movie.moviedata.service.CinemaMovieReleationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CinemaMovieReleationServiceImpl implements CinemaMovieReleationService {

    @Resource
    private CinemaMovieReleationMapper cinemaMovieReleationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cinemaMovieReleationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CinemaMovieReleation record) {
        return cinemaMovieReleationMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CinemaMovieReleation record) {
        return cinemaMovieReleationMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CinemaMovieReleation record) {
        return cinemaMovieReleationMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CinemaMovieReleation record) {
        return cinemaMovieReleationMapper.insertSelective(record);
    }

    @Override
    public CinemaMovieReleation selectByPrimaryKey(Long id) {
        return cinemaMovieReleationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CinemaMovieReleation record) {
        return cinemaMovieReleationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CinemaMovieReleation record) {
        return cinemaMovieReleationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CinemaMovieReleation> list) {
        return cinemaMovieReleationMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<CinemaMovieReleation> list) {
        return cinemaMovieReleationMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<CinemaMovieReleation> list) {
        return cinemaMovieReleationMapper.batchInsert(list);
    }

    @Override
    public Page selectBySelective(CinemaMovieRelationParam param, Page page) {
        PageHelper.startPage(page);
        List<CinemaMovieDto> cinemaMovieDtos = cinemaMovieReleationMapper.selectBySelective(param);
        page.setList(cinemaMovieDtos);
        PageInfo pageInfo = new PageInfo(cinemaMovieDtos);
        BeanUtil.copyProperties(pageInfo, page);
        return page;
    }
}
