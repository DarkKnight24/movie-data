package com.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.spring4all.swagger.EnableSwagger2Doc;

@SpringBootApplication
@EnableFeignClients
@EnableSwagger2Doc
public class MovieDataApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(MovieDataApplication.class, args);
    }
    
}
