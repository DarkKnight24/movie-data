package com.movie.moviedata.entity;

import lombok.Data;

@Data
public class Cinema {
    /**
    * 主键ID
    */
    private Long id;

    /**
    * 影院名称
    */
    private String cinemaName;

    /**
    * 影院类别
    */
    private Long cinemaType;

    /**
    * 影院地址
    */
    private String cinemaAddress;

    /**
    * 所属地区
    */
    private Long belongArea;

    /**
    * 删除标识
    */
    private Boolean deleteMark;
}