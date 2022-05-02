package com.salah.graphqlspringboot.resolvers;


//import com.salah.graphqlspringboot.exception.custom.GraphQLException;
import com.salah.graphqlspringboot.model.Task;
import com.salah.graphqlspringboot.services.TaskService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
@Slf4j
public class TaskResolver  implements GraphQLQueryResolver {
    private final TaskService taskService;

    private final ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public TaskResolver(TaskService taskService) {
        this.taskService = taskService;
    }

    public CompletableFuture<Task> getTask(Long id, DataFetchingEnvironment d){
        log.info(d.toString());
//        throw new RuntimeException("custom exception message yo!");
        return CompletableFuture.supplyAsync(() -> taskService.getTask(id), executorService);
    }

    public CompletableFuture<List<Task>> getTasks(){
        return CompletableFuture.supplyAsync(taskService::getTasks, executorService);
    }}
