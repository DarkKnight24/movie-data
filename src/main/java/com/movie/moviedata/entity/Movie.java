package com.movie.moviedata.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Movie {
    /**
     * movie_id
     */
    private Long movieId;

    /**
     * movie_cn_name
     */
    private String movieCnName;

    /**
     * movie_fg_name
     */
    private String movieFgName;

    /**
     * 演职人员
     */
    private String movieActor;

    /**
     * 导演
     */
    private String movieDirector;

    /**
     * 电影详情
     */
    private String movieDetail;

    /**
     * 电影时长
     */
    private String movieDuration;

    /**
     * 电影类型
     */
    private Long movieType;

    /**
     * 电影评分
     */
    private Double movieScore;

    /**
     * 票房
     */
    private Double movieBoxoffice;

    /**
     * 电影参评人数
     */
    private Long movieCommentcount;

    /**
     * 上映时间
     */
    private Date movieReleasedate;

    /**
     * 制片地区
     */
    private Integer movieCountry;

    /**
     * 电影海报地址
     */
    private String moviePicture;

    /**
     * 电影状态 默认1 1：在线 0：下架
     */
    private Byte movieState;
}