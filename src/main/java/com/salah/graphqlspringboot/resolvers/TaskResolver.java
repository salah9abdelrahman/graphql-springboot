package com.salah.graphqlspringboot.resolvers;


//import com.salah.graphqlspringboot.exception.custom.GraphQLException;
import com.salah.graphqlspringboot.model.Task;
import com.salah.graphqlspringboot.services.TaskService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class TaskResolver  implements GraphQLQueryResolver {
    private final TaskService taskService;

    private final ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public TaskResolver(TaskService taskService) {
        this.taskService = taskService;
    }

    public CompletableFuture<Task> getTask(Long id){
//        throw new RuntimeException("custom exception message yo!");
        return CompletableFuture.supplyAsync(() -> taskService.getTask(id), executorService);
    }
}
