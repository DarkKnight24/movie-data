package com.movie.moviedata.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MovieType {
    /**
    * 主键ID
    */
    private Long id;

    /**
    * 电影类别
    */
    private String typeName;

    /**
    * 删除标识
    */
    private Boolean deleteMark;

    /**
    * 创建时间
    */
    private Date createTime;
}