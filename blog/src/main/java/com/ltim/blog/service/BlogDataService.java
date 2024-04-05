package com.ltim.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.blog.Repository.BlogRepository;
import com.ltim.blog.entity.BlogData;

@Service
public class BlogDataService {
    
    @Autowired
    private BlogRepository blogRepository;

    public BlogData createBlog(BlogData blog){
        return blogRepository.save(blog);
    }

    // public List<BlogData> viewMyBlogs(BlogData blogData){
    //     return blogRepository.findByUserId(blogData.getUser().getUserId());
        
    // }

    public List<BlogData> viewAllBlogs(){
        return blogRepository.findAll();
    }

    public void deleteBlogs(BlogData blog){
        blogRepository.deleteById(blog.getId());
    }

}
