package com.glauberperez.blog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "reactions")
public class ReactionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "comment")
    private String comment;

   @Column(name = "like")
   private boolean like;

    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName="id")
    private UserModel user;

    @ManyToOne
    @JoinColumn(name="post_id", referencedColumnName="id")
    private PostModel post;

    
}

