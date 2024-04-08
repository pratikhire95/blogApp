package com.ltim.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.blog.Repository.CommentsRepository;

import com.ltim.blog.entity.Comments;

@Service
public class CommentsService {

    @Autowired
    private CommentsRepository commentsRepository;

    public Comments createComment(Comments comments) {
        return commentsRepository.save(comments);
    }

    public List<Comments> viewComments(String blogId) {
        List<Comments> blogComments = commentsRepository.findCommentsByBlogId(blogId);
        return blogComments;
    }
}
