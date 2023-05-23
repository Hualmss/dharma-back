package com.dharmaclient.dharmaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DharmaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DharmaClientApplication.class, args);
	}

}
