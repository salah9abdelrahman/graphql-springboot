package com.salah.graphqlspringboot.exception.custom;

public class GraphQLException extends RuntimeException{
    public GraphQLException() {
    }

    public GraphQLException(String message) {
        super(message);
    }

    public GraphQLException(String message, Throwable cause) {
        super(message, cause);
    }
}
