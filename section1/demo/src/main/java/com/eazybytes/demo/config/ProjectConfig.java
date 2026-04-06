package com.eazybytes.demo.config;

import com.eazybytes.demo.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
@Configuration is an annotation in the Spring Core Framework used to mark a class as
a source of bean definitions.It indicates that the class contains one or more @Bean
methods, and the Spring container processes these methods to create and manage Spring Beans.
 */
@Configuration
public class ProjectConfig {

    /*
    @Bean annotation, which lets Spring know that it needs to call
   this method when it initializes its context and adds the returned
   value to the context.
     */
    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Tesla");
        return veh;
    }

    /*
    The method names usually follow verb notation.But for methods
    which we will use to create beans, can use nouns as names.
    This will be a good practice as the method names will become
    bean names as well in the context.
    * */
    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer luckyNumber() {
        return 16;
    }

}
