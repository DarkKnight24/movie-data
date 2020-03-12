package com.movie.moviedata.entity;

import lombok.Data;

@Data
public class Hall {
    /**
    * 主键ID
    */
    private Long id;

    /**
    * 影院ID
    */
    private Long cinemaId;

    /**
    * 影厅所属类别
    */
    private Long hallType;

    /**
    * 影厅名称
    */
    private String hallName;

    /**
    * 影厅容量
    */
    private Integer hallCapacity;

    /**
    * 删除标识
    */
    private Boolean deleteMark;
}