package com.glauberperez.blog.service;

import com.glauberperez.blog.model.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> getAllUsers();
    void register(UserModel user);

    //autenticação to-do
}
