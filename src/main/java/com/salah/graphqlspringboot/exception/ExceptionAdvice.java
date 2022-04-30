//package com.salah.graphqlspringboot.exception;
//
//import com.salah.graphqlspringboot.exception.custom.GraphQLException;
//import graphql.kickstart.spring.error.ThrowableGraphQLError;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//@ControllerAdvice
//public class ExceptionAdvice extends ResponseEntityExceptionHandler {
//
//    @ExceptionHandler({GraphQLException.class})
//    public ThrowableGraphQLError handleGraphQLException(GraphQLException ex) {
//        return new ThrowableGraphQLError(ex);
//    }
//
//    @ExceptionHandler({Exception.class})
//    public ThrowableGraphQLError handleAll(Exception ex) {
//        return new ThrowableGraphQLError(ex, "Interval Server Error");
//    }
//
//}
