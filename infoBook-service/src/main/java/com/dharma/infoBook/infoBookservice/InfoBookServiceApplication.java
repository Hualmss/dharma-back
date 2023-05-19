package com.dharma.infoBook.infoBookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InfoBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfoBookServiceApplication.class, args);
	}

}
