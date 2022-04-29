package com.salah.graphqlspringboot.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "tasks")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Task {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;

    private String tags;

    @Column(name = "user_id")
    private Long userId;


    @Column(name = "is_private")
    private boolean isPrivate;

    @Column(name = "approach_count")
    private Integer approachCount;

    private LocalDateTime created_at;


}
