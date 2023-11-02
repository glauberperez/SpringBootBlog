package com.glauberperez.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glauberperez.blog.model.PostModel;
@Repository
public interface PostRepository extends JpaRepository<PostModel, Long> {
}
