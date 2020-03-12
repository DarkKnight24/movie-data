package com.movie.moviedata.entity;

import java.util.Date;
import lombok.Data;

@Data
public class CinemaType {
    /**
    * cinema_id
    */
    private Long cinemaId;

    /**
    * 影院名称
    */
    private String cinemaType;

    /**
    * 删除标识
    */
    private Boolean deleteMark;

    /**
    * 创建时间
    */
    private Date createTime;
}