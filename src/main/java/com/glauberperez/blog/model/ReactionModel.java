package com.glauberperez.blog.model;

import jakarta.persistence.*;
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

   @Column(name = "is_like")
   private boolean like;

    @OneToOne
    @JoinColumn(name="user_id", referencedColumnName="id")
    private UserModel user;

    @OneToOne
    @JoinColumn(name="post_id", referencedColumnName="id")
    private PostModel post;

}

