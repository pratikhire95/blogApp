package com.ltim.blog.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ltim.blog.entity.BlogData;




@Repository
public interface BlogRepository extends JpaRepository<BlogData, Long>{

    @Query("SELECT b FROM BlogData b WHERE b.user.emailId = :email")
    public List<BlogData> findBlogByEmail(String email);
    
} 
