package com.fiberhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsulGetwayClientApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConsulGetwayClientApplication.class, args);
    }
}
