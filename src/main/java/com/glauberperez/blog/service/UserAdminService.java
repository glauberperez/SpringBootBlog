package com.glauberperez.blog.service;

import com.glauberperez.blog.model.UserModel;

import java.util.List;

public interface UserAdminService {

    List<UserModel> getAllUsers();
    UserModel getUserById(Long id);
    int countUsers();
}
