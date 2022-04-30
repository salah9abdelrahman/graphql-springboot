package com.salah.graphqlspringboot.services;

import com.salah.graphqlspringboot.model.Task;
import com.salah.graphqlspringboot.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task getTask(Long id){
        return taskRepository.findById(id).orElse(null);
    }
}
