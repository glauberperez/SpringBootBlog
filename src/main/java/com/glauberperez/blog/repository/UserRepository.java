package com.glauberperez.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glauberperez.blog.model.UserModel;
@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
