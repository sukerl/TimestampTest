package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TimestampTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimestampTestApplication.class, args);
		
		TimestampTestService.test();
	}

}
