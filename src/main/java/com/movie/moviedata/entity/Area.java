package com.movie.moviedata.entity;

import lombok.Data;

@Data
public class Area {
    /**
    * 主键id
    */
    private Integer id;

    /**
    * 父节点ID，无父节点为0
    */
    private Long parentId;

    /**
    * 地区名称
    */
    private String areaName;

    /**
    * 删除标识
    */
    private Boolean deleteMark;

    /**
    * 地区类别
    */
    private Boolean areaType;
}