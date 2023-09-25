package com.example.RatingPro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RatingProApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingProApplication.class, args);
	}



}
