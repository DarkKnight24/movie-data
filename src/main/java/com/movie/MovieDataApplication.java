package com.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MovieDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieDataApplication.class, args);
    }

}
