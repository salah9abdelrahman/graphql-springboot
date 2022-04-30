package com.salah.graphqlspringboot.resolvers;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.salah.graphqlspringboot.model.Task;
import com.salah.graphqlspringboot.repository.TaskRepository;
import com.salah.graphqlspringboot.services.TaskService;
import org.springframework.stereotype.Component;

@Component
public class TaskResolver  implements GraphQLQueryResolver {
    private final TaskService taskService;

    public TaskResolver(TaskService taskService) {
        this.taskService = taskService;
    }

    public Task getTask(Long id){
        return taskService.getTask(id);
    }
}
