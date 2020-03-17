package com.movie.moviedata.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.movie.base.utils.BeanUtil;
import com.movie.base.utils.Page;
import com.movie.file.utils.Utils;
import com.movie.moviedata.dao.MovieMapper;
import com.movie.moviedata.dto.MovieDetailDto;
import com.movie.moviedata.dto.MovieDto;
import com.movie.moviedata.entity.Movie;
import com.movie.moviedata.param.MovieSelectParam;
import com.movie.moviedata.service.MovieCountryService;
import com.movie.moviedata.service.MovieService;
import com.movie.moviedata.service.MovieTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MovieServiceImpl implements MovieService {

    @Resource
    private MovieMapper movieMapper;

    @Autowired
    private MovieTypeService movieTypeService;

    @Autowired
    private MovieCountryService movieCountryService;

    @Autowired
    private Utils utils;

    @Override
    public int deleteByPrimaryKey(Long movieId) {
        return movieMapper.deleteByPrimaryKey(movieId);
    }

    @Override
    public int insert(Movie record) {
        return movieMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Movie record) {
        return movieMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Movie record) {
        return movieMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Movie record) {
        return movieMapper.insertSelective(record);
    }

    @Override
    public MovieDetailDto selectByPrimaryKey(Long movieId) {
        Movie movie = movieMapper.selectByPrimaryKey(movieId);
        movie.setMoviePicture(utils.getFileUrl(movie.getMoviePicture()));
        MovieDetailDto movieDetailDto = new MovieDetailDto();
        BeanUtil.copyProperties(movie, movieDetailDto);
        movieDetailDto.setTypeName(movieTypeService.selectByPrimaryKey(movieDetailDto.getMovieType()).getTypeName());
        movieDetailDto.setCountryName(movieCountryService.selectByPrimaryKey(movieDetailDto.getMovieCountry()).getCountryName());
        return movieDetailDto;
    }

    @Override
    public int updateByPrimaryKeySelective(Movie record) {
        if (record.getMoviePicture() == null || record.getMoviePicture().contains(utils.fileServerPath)) {
            record.setMoviePicture(null);
        }
        return movieMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Movie record) {
        return movieMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Movie> list) {
        return movieMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Movie> list) {
        return movieMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Movie> list) {
        return movieMapper.batchInsert(list);
    }

    @Override
    public List<MovieDto> selectAll() {
        List<Movie> movies = movieMapper.selectAll();
        List<MovieDto> movieDtos = Lists.newArrayList();
        movies.forEach(p -> {
            MovieDto movieDto = new MovieDto();
            BeanUtil.copyProperties(p, movieDto);
            movieDto.setMoviePicture(utils.getFileUrl(movieDto.getMoviePicture()));
            movieDtos.add(movieDto);
        });
        return movieDtos;
    }

    @Override
    public Page selectByParam(MovieSelectParam param, Page page) {
        PageHelper.startPage(page);
        List<MovieDto> movieDetailDtos = movieMapper.selectByParam(param);
        movieDetailDtos.forEach(p -> {
            p.setMoviePicture(utils.getFileUrl(p.getMoviePicture()));
        });
        page.setList(movieDetailDtos);
        PageInfo pageInfo = new PageInfo(movieDetailDtos);
        BeanUtil.copyProperties(pageInfo, page);
        return page;
    }
}
