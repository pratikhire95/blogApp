package com.ltim.blog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltim.blog.entity.Comments;

@Repository
public interface CommentRepository extends JpaRepository<Comments, Long>{

    
}
