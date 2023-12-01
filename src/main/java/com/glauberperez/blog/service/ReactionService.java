package com.glauberperez.blog.service;

import com.glauberperez.blog.model.ReactionModel;

import java.util.List;

public interface ReactionService {

    List <ReactionModel> getAllReactions();
    void comment(Long postId, String comment);
    void like(Long postId, boolean like);


}
