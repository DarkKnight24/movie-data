package com.movie.moviedata.entity;

import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CinemaMovieReleation {
    /**
     * 主键id
     */
    private Long id;
    
    /**
     * 电影id
     */
    private Long movieId;
    
    /**
     * 影院品牌
     */
    private Long cinemaType;
    
    /**
     * 建议售价
     */
    private Double suggestedPrice;
    
    /**
     * 删除标识
     */
    private Boolean deleteMark = false;
    
    /**
     * 创建时间
     */
    private Date createTime = new Date();
    
    /**
     * 放映时间
     */
    private Date startTime;
}