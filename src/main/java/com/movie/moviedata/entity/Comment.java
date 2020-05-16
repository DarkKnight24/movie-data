package com.movie.moviedata.entity;

import java.util.Date;
import lombok.Data;

/**
 * @作者 ：soul
 * @创建日期 ：Created in 2020/5/16 21:00
 * @描述：${description}
 */
@Data
public class Comment {
    /**
    * comment_id
    */
    private Long commentId;

    /**
    * 所属用户编号
    */
    private Long userId;

    /**
    * 评论内容
    */
    private String commentContent;

    /**
    * 所属电影编号
    */
    private Long movieId;

    /**
    * 评论时间
    */
    private Date commentTime;
}