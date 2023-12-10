package com.glauberperez.blog.service;

import com.glauberperez.blog.model.PostModel;
import java.util.List;

public interface PostService {

    List<PostModel> getAllPosts();
    void publish(PostModel post);
    int countPosts();
}
