package com.glauberperez.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.glauberperez.blog.model.UserModel;
import com.glauberperez.blog.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void register(UserModel user) {
        String encoded_password = passwordEncoder().encode(user.getPassword());
        user.setPassword(encoded_password);
        user.setRole("ROLE_USER");
        this.userRepository.save(user);
    }


    //find user

}
