package com.movie.moviedata.controller;

import com.movie.base.utils.JsonUtil;
import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MovieTypeControllerTest {


    private Logger logger = LoggerFactory.getLogger(Log4j.class);

    @Autowired
    private MovieTypeController movieTypeController;

    @Test
    public void getMovieType() {
        logger.info(JsonUtil.toJson(movieTypeController.getMovieType()));
    }
}