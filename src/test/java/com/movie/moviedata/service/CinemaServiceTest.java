package com.movie.moviedata.service;

import com.movie.base.utils.JsonUtil;
import com.movie.base.utils.Page;
import com.movie.moviedata.dto.CinemaDetailDto;
import org.junit.jupiter.api.Test;
import org.nutz.json.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @作者 ：soul
 * @创建日期 ：Created in 2020/3/28 18:49
 * @描述：
 */
@SpringBootTest
class CinemaServiceTest {

    @Autowired
    private CinemaService cinemaService;
    @Test
    void deleteByPrimaryKey() {
    }

    @Test
    void insert() {
    }

    @Test
    void insertOrUpdate() {
    }

    @Test
    void insertOrUpdateSelective() {
    }

    @Test
    void insertSelective() {
    }

    @Test
    void selectByPrimaryKey() {
        CinemaDetailDto cinemaDetailDto = cinemaService.selectByPrimaryKey(1L);
        System.out.println(JsonUtil.toJson(cinemaDetailDto));
    }

    @Test
    void updateByPrimaryKeySelective() {
    }

    @Test
    void updateByPrimaryKey() {
    }

    @Test
    void updateBatch() {
    }

    @Test
    void updateBatchSelective() {
    }

    @Test
    void batchInsert() {
    }

    @Test
    void selectByParam() {
        Page page = cinemaService.selectByParam(new Page(), null);
        System.out.println(JsonUtil.toJson(page));
    }

    @Test
    void selectByCinemaType(){
        System.out.println(JsonUtil.toJson(cinemaService.selectCinema(10L)));
    }
}