package com.springcloud.eurekacenterserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaCenterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCenterServerApplication.class, args);
    }
}
