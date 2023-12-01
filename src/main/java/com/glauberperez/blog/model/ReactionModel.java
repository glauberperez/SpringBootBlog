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

   @Column(name = "like")
   private boolean like;

    @OneToOne
    @JoinColumn(name="user_id", referencedColumnName="id")
    private UserModel user;

    @OneToOne
    @JoinColumn(name="post_id", referencedColumnName="id")
    private PostModel post;

}

/* O problema provavelmente está aqui
   a table reactions não está sendo criada,
   provavelmente,


Error executing DDL "create table reactions (id bigint not null auto_increment, comment varchar(255), like bit, post_id bigint, user_id bigint, primary key (id)) engine=InnoDB" via JDBC [You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'like bit, post_id bigint, user_id bigint, primary key (id)) engine=InnoDB' at line 1]


tipo de dados??
bit like?


*/