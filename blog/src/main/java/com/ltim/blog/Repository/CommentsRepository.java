package com.ltim.blog.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ltim.blog.entity.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long>{

    @Query("SELECT c FROM Comments c WHERE c.blog.id = :blogId")
    public List<Comments> findCommentsByBlogId(String blogId);
}
