package com.glauberperez.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.glauberperez.blog.model.UserModel;


@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    UserModel findByUsername(String username);
    
    //custom query to count users
    @Query(value = "SELECT count(*) FROM users", nativeQuery = true)
    int countUsers();

}
