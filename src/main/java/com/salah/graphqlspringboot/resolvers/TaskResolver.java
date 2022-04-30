package com.salah.graphqlspringboot.resolvers;


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
        return taskService.getTask(id);
    }
}
