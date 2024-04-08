package com.ltim.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltim.blog.entity.Comments;
import com.ltim.blog.service.CommentsService;

@RestController
@RequestMapping("/comments")
public class BlogCommentController {
    @Autowired
    private CommentsService commentsService;

    @GetMapping("/{blogId}")
    public ResponseEntity<List<Comments>> getAllCommentsForBlog(@PathVariable String blogId) {
        if (blogId == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        List<Comments> comments = commentsService.viewComments(blogId);
        return new ResponseEntity<List<Comments>>(comments, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Comments> addComment(@RequestBody Comments comments) {
        if (comments == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        commentsService.createComment(comments);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
