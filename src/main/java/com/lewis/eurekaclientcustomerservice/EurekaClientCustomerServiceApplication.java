package com.lewis.eurekaclientcustomerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientCustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientCustomerServiceApplication.class, args);
    }

}
