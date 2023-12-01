package com.glauberperez.blog.service;

import com.glauberperez.blog.model.PostModel;
import com.glauberperez.blog.model.ReactionModel;
import com.glauberperez.blog.model.UserModel;
import com.glauberperez.blog.repository.PostRepository;
import com.glauberperez.blog.repository.ReactionRepository;
import com.glauberperez.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReactionServiceImpl implements ReactionService{

    @Autowired
    private ReactionRepository reactionRepository;

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;



    @Override
    public List<ReactionModel> getAllReactions() {
        return reactionRepository.findAll();
    }

    @Override
    public void comment(Long id, String comment) {

    }

    @Override
    public void like(Long postId, boolean like) {
        ReactionModel reaction = new ReactionModel();

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userId = authentication.getName();

        UserModel user = userRepository.findByUsername(userId);
        reaction.setUser(user);

        PostModel post = postRepository.findById(postId).get();
        reaction.setPost(post);

        reaction.setLike(!reaction.isLike());

        reactionRepository.save(reaction);
    }


}
