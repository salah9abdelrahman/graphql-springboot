package com.salah.graphqlspringboot.repository;

import com.salah.graphqlspringboot.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    @Query("SELECT t FROM Task t LEFT JOIN FETCH t.approaches where t.id= :id")
    Task getTaskById(Long id);

}
