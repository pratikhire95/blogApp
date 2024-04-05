package com.ltim.blog.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ltim.blog.entity.BlogData;



@Repository
public interface BlogRepository extends JpaRepository<BlogData, Long>{

    
} 
