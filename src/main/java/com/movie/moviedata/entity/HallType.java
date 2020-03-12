package com.movie.moviedata.entity;

import java.util.Date;
import lombok.Data;

@Data
public class HallType {
    /**
    * hall_id
    */
    private Integer hallId;

    /**
    * 放映厅名称
    */
    private String hallName;

    /**
    * 删除标识
    */
    private Boolean deleteMark;

    /**
    * 创建时间
    */
    private Date createTime;
}