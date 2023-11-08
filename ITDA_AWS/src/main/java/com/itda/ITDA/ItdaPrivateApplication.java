package com.itda.ITDA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ItdaPrivateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItdaPrivateApplication.class, args);
	}

}