package com.psl.ApiGateWayCinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGateWayCinemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateWayCinemaApplication.class, args);
	}

}
