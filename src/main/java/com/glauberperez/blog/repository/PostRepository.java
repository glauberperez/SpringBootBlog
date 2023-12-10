package com.glauberperez.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.glauberperez.blog.model.PostModel;
@Repository
public interface PostRepository extends JpaRepository<PostModel, Long> {
    //Count posts
    @Query(value = "SELECT COUNT(*) FROM posts", nativeQuery = true)
    int countPosts();


}
