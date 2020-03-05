package com.movie.moviedata.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MovieCountry {
    /**
    * 主键ID
    */
    private Integer id;

    /**
    * 电影地区
    */
    private String countryName;

    /**
    * 删除标识
    */
    private Boolean deleteMark;

    /**
    * 创建时间
    */
    private Date creatTime;
}