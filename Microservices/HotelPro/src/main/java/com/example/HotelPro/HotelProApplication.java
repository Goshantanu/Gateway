package com.example.HotelPro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HotelProApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelProApplication.class, args);
	}

}
