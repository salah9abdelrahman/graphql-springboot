package com.salah.graphqlspringboot.model;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "tasks")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Task implements SearchResultItem {
    @Id
    @Column(name = "task_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;

    @Column(name = "is_private")
    private boolean isPrivate;

    @Column(name = "approach_count")
    private Integer approachCount;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "task")
    private List<Approach> approaches;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Transient
    private  Integer heavy;
}
