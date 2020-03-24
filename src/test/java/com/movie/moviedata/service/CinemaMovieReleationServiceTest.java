package com.movie.moviedata.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.movie.base.utils.JsonUtil;
import com.movie.base.utils.Page;
import com.movie.moviedata.entity.CinemaMovieReleation;

@SpringBootTest
public class CinemaMovieReleationServiceTest {
    
    @Autowired
    private CinemaMovieReleationService cinemaMovieReleationService;
    
    @Autowired
    private MovieService movieService;
    
    @Test
    public void deleteByPrimaryKey() {
    }
    
    @Test
    public void insert() {
    }
    
    @Test
    public void insertOrUpdate() {
    }
    
    @Test
    public void insertOrUpdateSelective() {
    }
    
    @Test
    public void insertSelective() {
    }
    
    @Test
    public void selectByPrimaryKey() {
    }
    
    @Test
    public void updateByPrimaryKeySelective() {
    }
    
    @Test
    public void updateByPrimaryKey() {
    }
    
    @Test
    public void updateBatch() {
    }
    
    @Test
    public void updateBatchSelective() {
    }
    
    @Test
    public void batchInsert() {
        List<CinemaMovieReleation> list = new ArrayList<>();
        Random random = new Random(20);
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 10; j++) {
                CinemaMovieReleation cinemaMovieReleation = new CinemaMovieReleation().setCinemaType((long)j)
                    .setMovieId((long)(7 + i))
                    .setHallType((long)j)
                    .setSuggestedPrice(35.6 * (1 + j * 0.45) + random.nextDouble() / 0.5)
                    .setStartTime(movieService.selectByPrimaryKey((long)(7 + i)).getMovieReleasedate());
                list.add(cinemaMovieReleation);
            }
        }
        
        cinemaMovieReleationService.batchInsert(list);
    }
    
    @Test
    public void selectBySelective() {
        Page page = cinemaMovieReleationService.selectBySelective(null, new Page());
        System.out.println(JsonUtil.toJson(page));
    }
    
}
