package com.movie.moviedata.param;

import lombok.Data;

@Data
public class MovieSelectParam {

    /**
     * 电影状态，默认正在热映
     * 正在热映：1
     * 即将上映：2
     * 已下架：0
     */
    private Integer movieState = 1;
    /**
     * 排序规则，默认热门排序
     * 热门排序：movie_boxOffice
     * 时间排序：movie_releaseDate
     * 评论排序：movie_commentCount
     */
    private String orderBy = "movie_boxOffice";
    private Long movieType;
    private Long movieCountry;
    private String releaseTime;
}
