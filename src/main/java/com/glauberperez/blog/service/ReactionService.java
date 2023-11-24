package com.glauberperez.blog.service;

import com.glauberperez.blog.model.ReactionModel;

import java.util.List;

public interface ReactionService {

    List <ReactionModel> getAllReactions();

    void changeLike(Boolean like);
    void changeComment(String comment);

}
