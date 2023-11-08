package com.glauberperez.blog.service;

import com.glauberperez.blog.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserModel> getAllUsers();
    void register(UserModel user);

    //autenticação to-do
}
