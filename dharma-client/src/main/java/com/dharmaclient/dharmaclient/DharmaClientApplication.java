package com.dharmaclient.dharmaclient;

import com.dharmaclient.dharmaclient.FeignClient.BookFeignClient;
import com.dharmaclient.dharmaclient.utils.DharmaClientUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Scanner;

@SpringBootApplication
@EnableFeignClients
public class DharmaClientApplication implements CommandLineRunner {
	public static Scanner scan = new Scanner(System.in);
	@Autowired
	private BookFeignClient bookFeignClient;

	public static void main(String[] args) {
		SpringApplication.run(DharmaClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n\n\n\n\n\n");
		switch(menuApp()){
			case 1:	DharmaClientUtils.ListBooks(bookFeignClient.getListBooks());
			case 2: ;
			case 3: ;


		}



	}

	public int menuApp(){
		System.out.println("Select an option");
		System.out.println("\t1)List books");
		System.out.println("\t2)Add new book");
		System.out.println("\t3)Get report by Year");
		System.out.println("\t4)Serch Boook");
		System.out.println();
		return scan.nextInt();
	}
}
