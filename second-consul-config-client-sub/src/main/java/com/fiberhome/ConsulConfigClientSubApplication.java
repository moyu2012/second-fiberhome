package com.fiberhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ConsulConfigClientSubApplication {
    public static void main(String[] args) {
         SpringApplication.run(ConsulConfigClientSubApplication.class, args);
    }

}