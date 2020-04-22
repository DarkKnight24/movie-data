package com.movie.moviedata.param;

import lombok.Data;

/**
 * @作者 ：soul
 * @创建日期 ：Created in 2020/3/28 18:30 @描述：
 */
@Data
public class CinemaSelectParam {
    /**
     * 上映时间
     */
    private String startTime;
    
    /**
     * 电影ID
     */
    private Long movieId;
    
    /**
     * 电影品牌ID
     */
    private Long cinemaTypeId;
    
    /**
     * 地区ID
     */
    private Long areaId;
    
    /**
     * 影厅类别ID
     */
    private Long hallTypeId;
}
