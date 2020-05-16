package com.movie.moviedata.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.movie.base.utils.BeanUtil;
import com.movie.base.utils.Page;
import com.movie.moviedata.dao.CommentMapper;
import com.movie.moviedata.dto.CommentDto;
import com.movie.moviedata.entity.Comment;
import com.movie.moviedata.param.CommentSelectParam;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @作者 ：soul
 * @创建日期 ：Created in 2020/5/16 21:00
 * @描述：${description}
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper commentMapper;

    @Override
    public int deleteByPrimaryKey(Long commentId) {
        return commentMapper.deleteByPrimaryKey(commentId);
    }

    @Override
    public int insert(Comment record) {
        return commentMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Comment record) {
        return commentMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Comment record) {
        return commentMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Comment record) {
        return commentMapper.insertSelective(record);
    }

    @Override
    public Comment selectByPrimaryKey(Long commentId) {
        return commentMapper.selectByPrimaryKey(commentId);
    }

    @Override
    public int updateByPrimaryKeySelective(Comment record) {
        return commentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Comment record) {
        return commentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Comment> list) {
        return commentMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Comment> list) {
        return commentMapper.batchInsert(list);
    }

    @Override
    public Page selectComment(CommentSelectParam param, Page page) {
        PageHelper.startPage(page);
        List<CommentDto> commentDtos = commentMapper.selectComment(param);
        PageInfo pageInfo = new PageInfo(commentDtos);
        BeanUtil.copyProperties(pageInfo, page);
        page.setList(commentDtos);
        return page;
    }
}
