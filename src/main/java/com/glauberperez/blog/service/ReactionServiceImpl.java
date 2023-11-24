package com.glauberperez.blog.service;

import com.glauberperez.blog.model.ReactionModel;
import com.glauberperez.blog.repository.ReactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReactionServiceImpl implements ReactionService{

    @Autowired
    private ReactionRepository reactionRepository;

    @Override
    public List<ReactionModel> getAllReactions() {
        return null;
    }

    @Override
    public void changeLike(Boolean like) {

    }

    @Override
    public void changeComment(String comment) {

    }
}
