package com.movie.moviedata.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Schedule {
    /**
     * schedule_id
     */
    private Long scheduleId;

    /**
     * 所属放映厅
     */
    private Long hallId;

    /**
     * 放映的电影编号
     */
    private Long movieId;

    /**
     * 电影放映时间
     */
    private String scheduleStarttime;

    /**
     * 售价
     */
    private Integer schedulePrice;

    /**
     * 剩余座位数
     */
    private Integer scheduleRemain;

    /**
     * 场次状态 1：上映中 0：下架
     */
    private Integer scheduleState;

    public static ScheduleBuilder builder() {
        return new ScheduleBuilder();
    }
}