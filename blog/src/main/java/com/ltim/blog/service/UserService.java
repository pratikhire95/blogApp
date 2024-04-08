package com.ltim.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.blog.Repository.UserRepository;
import com.ltim.blog.entity.User;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {

        return userRepository.save(user);

    }

    public List<User> listOfUsers() {
        return userRepository.findAll();
    }

}
