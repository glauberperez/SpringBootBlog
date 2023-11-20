package com.glauberperez.blog.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "posts")
public class PostModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName="id")
    private UserModel user;


}

