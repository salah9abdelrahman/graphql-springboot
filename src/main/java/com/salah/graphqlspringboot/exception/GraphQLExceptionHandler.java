package com.salah.graphqlspringboot.exception;

import graphql.GraphQLError;
import graphql.GraphqlErrorException;
import graphql.kickstart.execution.error.GraphQLErrorHandler;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GraphQLExceptionHandler implements GraphQLErrorHandler {
    @Override
    public List<GraphQLError> processErrors(List<GraphQLError> list) {
        return list;
    }
}
