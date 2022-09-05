package com.psl.EServerCinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EServerCinemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EServerCinemaApplication.class, args);
	}

}
