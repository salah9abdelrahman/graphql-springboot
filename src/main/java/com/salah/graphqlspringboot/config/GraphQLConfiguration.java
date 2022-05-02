package com.salah.graphqlspringboot.config;

import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfiguration {
    @Bean
    GraphQLScalarType nonNegativeInt(){
        return ExtendedScalars.NonNegativeInt;
    }

    @Bean
    GraphQLScalarType date(){
        return ExtendedScalars.Date;
    }

    @Bean
    GraphQLScalarType dateTime(){
        return ExtendedScalars.DateTime;
    }
}
