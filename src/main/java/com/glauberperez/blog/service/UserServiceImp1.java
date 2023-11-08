package com.glauberperez.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.glauberperez.blog.model.UserModel;
import com.glauberperez.blog.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp1 implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void register(UserModel user) {
        this.userRepository.save(user);
    }


    //find user

}
