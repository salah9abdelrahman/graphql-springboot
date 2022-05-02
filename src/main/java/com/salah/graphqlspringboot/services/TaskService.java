package com.salah.graphqlspringboot.services;

import com.salah.graphqlspringboot.model.Task;
import com.salah.graphqlspringboot.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task getTask(Long id){
        return taskRepository.getTaskById(id);
    }

    public List<Task> getTasks(){
        return taskRepository.getAll();
    }
}
