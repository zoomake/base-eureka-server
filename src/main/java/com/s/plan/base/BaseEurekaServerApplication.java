package com.s.plan.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BaseEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseEurekaServerApplication.class, args);
	}
}
