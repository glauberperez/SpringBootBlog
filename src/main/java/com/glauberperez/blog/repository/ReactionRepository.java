package com.glauberperez.blog.repository;

import com.glauberperez.blog.model.ReactionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactionRepository extends JpaRepository<ReactionModel, Long> {
}
