package com.salah.graphqlspringboot.resolvers;

import com.salah.graphqlspringboot.model.Task;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HeavyResolver implements GraphQLResolver<Task> {

    public Integer getHeavy(Task task) throws InterruptedException {
        log.info(task.getId().toString());
//        Thread.sleep(3000);
        return Integer.MAX_VALUE;
    }
}
