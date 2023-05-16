package com.dharma.genre.servicegenre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceGenreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceGenreApplication.class, args);
	}

}
