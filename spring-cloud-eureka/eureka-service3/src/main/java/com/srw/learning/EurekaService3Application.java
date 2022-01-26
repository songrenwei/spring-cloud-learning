package com.srw.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaService3Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaService3Application.class, args);
    }

}
