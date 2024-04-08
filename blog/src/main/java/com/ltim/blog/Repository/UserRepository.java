package com.ltim.blog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltim.blog.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    
} 