package com.glauberperez.blog.service;

import com.glauberperez.blog.model.PostModel;
import com.glauberperez.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<PostModel> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public void publish(PostModel post) {
        this.postRepository.save(post);
    }
}
