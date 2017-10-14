package com.temple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaclickApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclickApplication.class, args);
	}
}
