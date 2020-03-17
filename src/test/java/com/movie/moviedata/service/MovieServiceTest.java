package com.movie.moviedata.service;

import com.alibaba.druid.support.logging.SLF4JImpl;
import com.movie.base.utils.JsonUtil;
import com.movie.base.utils.Page;
import com.movie.moviedata.param.MovieSelectParam;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MovieServiceTest {

    private Logger logger = LoggerFactory.getLogger(SLF4JImpl.class);

    @Autowired
    private MovieService movieService;

    @Test
    public void selectByParam() {
        MovieSelectParam param = new MovieSelectParam();
        param.setMovieCountry(1L);
        param.setMovieType(5L);
        logger.info(JsonUtil.toJson(movieService.selectByParam(param, new Page())));
    }
}
