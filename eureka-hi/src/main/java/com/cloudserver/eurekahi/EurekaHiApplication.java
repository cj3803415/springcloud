package com.cloudserver.eurekahi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class EurekaHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaHiApplication.class, args);
	}




}
