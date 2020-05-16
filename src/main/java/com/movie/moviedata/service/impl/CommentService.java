package com.movie.moviedata.service.impl;

import com.movie.base.utils.Page;
import com.movie.moviedata.entity.Comment;
import com.movie.moviedata.param.CommentSelectParam;

import java.util.List;

/**
 * @作者 ：soul
 * @创建日期 ：Created in 2020/5/16 21:00
 * @描述：${description}
 */
public interface CommentService {


    int deleteByPrimaryKey(Long commentId);

    int insert(Comment record);

    int insertOrUpdate(Comment record);

    int insertOrUpdateSelective(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Long commentId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    int updateBatch(List<Comment> list);

    int batchInsert(List<Comment> list);

    Page selectComment(CommentSelectParam param, Page page);
}
