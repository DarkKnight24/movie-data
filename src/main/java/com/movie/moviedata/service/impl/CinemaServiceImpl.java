package com.movie.moviedata.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.movie.base.utils.BeanUtil;
import com.movie.base.utils.Page;
import com.movie.file.utils.Utils;
import com.movie.moviedata.dto.CinemaDetailDto;
import com.movie.moviedata.dto.CinemaDto;
import com.movie.moviedata.entity.Area;
import com.movie.moviedata.param.CinemaSelectParam;
import com.movie.moviedata.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.movie.moviedata.entity.Cinema;
import com.movie.moviedata.dao.CinemaMapper;
import com.movie.moviedata.service.CinemaService;
@Service
public class CinemaServiceImpl implements CinemaService{

    @Resource
    private CinemaMapper cinemaMapper;
    @Autowired
    private AreaService areaService;
    @Autowired
    private Utils utils;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cinemaMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Cinema record) {
        return cinemaMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Cinema record) {
        return cinemaMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Cinema record) {
        return cinemaMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Cinema record) {
        return cinemaMapper.insertSelective(record);
    }

    @Override
    public CinemaDetailDto selectByPrimaryKey(Long id) {
        CinemaDto cinemaDto = cinemaMapper.selectByPrimaryKey(id);
        CinemaDetailDto cinemaDetailDto = new CinemaDetailDto();
        BeanUtil.copyProperties(cinemaDto,cinemaDetailDto);
        getAreaId(cinemaDetailDto,cinemaDetailDto.getAreaId());
        cinemaDetailDto.setCinemaImage(utils.getFileUrl(cinemaDetailDto.getCinemaImageUrl()));
        return cinemaDetailDto;
    }

    private void getAreaId(CinemaDetailDto cinemaDetailDto,Long areaId){
        Area area = areaService.selectByPrimaryKey(areaId.intValue());
        switch (area.getAreaType()){
            case 1:
                cinemaDetailDto.setProvinceId(area.getId().longValue());
                break;
            case 2:
                cinemaDetailDto.setCityId(area.getId().longValue());
                break;
            case 3:
                cinemaDetailDto.setCountryId(area.getId().longValue());
                break;
            default:
                return;
        }
        if(area.getAreaType()!=1){
            getAreaId(cinemaDetailDto,area.getParentId());
        }
    }

    @Override
    public int updateByPrimaryKeySelective(Cinema record) {
        return cinemaMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Cinema record) {
        return cinemaMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Cinema> list) {
        return cinemaMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Cinema> list) {
        return cinemaMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Cinema> list) {
        return cinemaMapper.batchInsert(list);
    }

    @Override
    public Page selectByParam(Page page, CinemaSelectParam param) {
        PageHelper.startPage(page);
        List<CinemaDto> cinemaDtos = cinemaMapper.selectByPyParam(param);
        cinemaDtos.forEach(p->{
            Long areaId = p.getAreaId();
            StringBuffer area = new StringBuffer();
            getArea(area,areaId);
            p.setArea(area.toString());
            p.setCinemaImageUrl(utils.getFileUrl(p.getCinemaImageUrl()));
        });
        PageInfo pageInfo = new PageInfo(cinemaDtos);
        page.setList(cinemaDtos);
        BeanUtil.copyProperties(pageInfo,page);
        return page;
    }

    private void getArea(StringBuffer areaName,Long areaId){
        Area area = areaService.selectByPrimaryKey(areaId.intValue());
        if(area.getAreaType()!=1){
            areaName.append(area.getAreaName()).append("-");
            getArea(areaName,area.getParentId());
        }else {
            areaName.append(area.getAreaName());
        }
    }

    @Override
    public List<Cinema> selectCinema(Long cinemaType) {
        return cinemaMapper.selectCinemaAll(cinemaType);
    }
}
