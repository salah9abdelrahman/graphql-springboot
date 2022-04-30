package com.salah.graphqlspringboot.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "`users`")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String hashed_password;

    private String first_name;

    private String last_name;

    private String hashed_auth_token;

    private LocalDateTime created_at;

    @OneToMany(mappedBy = "user")
    private List<Task> tasks;
}
