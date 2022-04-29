package com.salah.graphqlspringboot.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "approaches")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Approach {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "task_id")
    private Long taskId;

    @Column(name = "vote_count")
    private Integer voteCount;

    private LocalDateTime created_at;

}
