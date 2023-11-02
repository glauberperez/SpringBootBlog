package com.glauberperez.blog.service;

import com.glauberperez.blog.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<UserModel> getAllUsers();
}
