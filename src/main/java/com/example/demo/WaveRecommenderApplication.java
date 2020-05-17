package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class WaveRecommenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaveRecommenderApplication.class, args);
	}

}
