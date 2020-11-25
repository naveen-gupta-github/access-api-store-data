package com.naveen.accessapistoredata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AccessApiStoreDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessApiStoreDataApplication.class, args);
	}

}
