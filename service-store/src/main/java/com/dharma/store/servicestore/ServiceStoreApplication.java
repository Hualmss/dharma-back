package com.dharma.store.servicestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceStoreApplication.class, args);
	}

}
