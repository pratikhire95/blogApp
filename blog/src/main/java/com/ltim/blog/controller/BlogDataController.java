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
import com.ltim.blog.entity.BlogData;

import com.ltim.blog.service.BlogDataService;

@RestController
@RequestMapping("/home")
public class BlogDataController {

    @Autowired
    private BlogDataService blogDataService;

    @PostMapping("/create/blog")
    public ResponseEntity<BlogData> createBlog(@RequestBody BlogData blogData) {
        if (blogData == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<BlogData>(blogDataService.createBlog(blogData), HttpStatus.CREATED);
    }

    @GetMapping("/get/allblogs")
    public ResponseEntity<List<BlogData>> getAllBlogs() {
        List<BlogData> allblogs = blogDataService.viewAllBlogs();
        if (allblogs == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<BlogData>>(blogDataService.viewAllBlogs(), HttpStatus.OK);
    }

    @GetMapping("/get/myblogs/{username}")
    public ResponseEntity<List<BlogData>> myBlogs(@PathVariable String username) {

        List<BlogData> blog = blogDataService.viewMyBlogs(username);
        if (blog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<BlogData>>(blog, HttpStatus.OK);
    }
}
