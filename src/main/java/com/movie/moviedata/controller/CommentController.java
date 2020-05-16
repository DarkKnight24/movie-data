package com.movie.moviedata.controller;

import com.movie.base.utils.Page;
import com.movie.moviedata.entity.Comment;
import com.movie.moviedata.param.CommentSelectParam;
import com.movie.moviedata.service.impl.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @作者 ：soul
 * @创建日期 ：Created in 2020/5/16 21:01
 * @描述：
 */
@RequestMapping("movie/comment")
@Controller
public class CommentController {
    @Autowired
    private CommentService service;

    @ResponseBody
    @PostMapping("add")
    public Object addComment(@RequestBody Comment comment) {
        return service.insertSelective(comment) > 0;
    }

    @ResponseBody
    @GetMapping("select-by-param")
    public Object selectComment(CommentSelectParam param, Page page) {
        return service.selectComment(param, page);
    }

    @ResponseBody
    @GetMapping("delete")
    public Object delete(Long commentId) {
        return service.deleteByPrimaryKey(commentId) > 0;
    }
}
