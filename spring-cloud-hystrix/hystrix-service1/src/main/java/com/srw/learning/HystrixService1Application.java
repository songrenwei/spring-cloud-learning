package com.srw.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HystrixService1Application {

    public static void main(String[] args) {
        SpringApplication.run(HystrixService1Application.class, args);
    }

}
