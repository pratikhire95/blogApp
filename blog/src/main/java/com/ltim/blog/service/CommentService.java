package com.ltim.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.blog.Repository.CommentRepository;
import com.ltim.blog.entity.BlogData;
import com.ltim.blog.entity.Comments;

@Service
public class CommentService {
    
    @Autowired
    private CommentRepository commentRepository;

    public Comments createComment(Comments comments){
        return commentRepository.save(comments);
    }

    public Comments viewComments(BlogData blog){
        return commentRepository.findById(blog.getId()).get();
    }
}
