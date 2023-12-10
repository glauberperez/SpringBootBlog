package com.glauberperez.blog.service;

import com.glauberperez.blog.model.PostModel;
import com.glauberperez.blog.model.UserModel;
import com.glauberperez.blog.repository.PostRepository;
import com.glauberperez.blog.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<PostModel> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public void publish(PostModel post) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();

        UserModel user = userRepository.findByUsername(username);
        post.setUser(user);

        this.postRepository.save(post);
    }

    @Override
    public int countPosts() {
        return postRepository.countPosts();
    }
}
