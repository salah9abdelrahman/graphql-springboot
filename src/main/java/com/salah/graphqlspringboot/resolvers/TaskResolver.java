package com.salah.graphqlspringboot.resolvers;


import com.salah.graphqlspringboot.exception.custom.GraphQLException;
import com.salah.graphqlspringboot.model.Task;
import com.salah.graphqlspringboot.services.TaskService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class TaskResolver  implements GraphQLQueryResolver {
    private final TaskService taskService;

    public TaskResolver(TaskService taskService) {
        this.taskService = taskService;
    }

    public Task getTask(Long id){
        throw new RuntimeException("custom exception message yo!");
//        return taskService.getTask(id);
    }
}
