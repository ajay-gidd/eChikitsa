package com.example.eChikitsaAppRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EChikitsaAppRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EChikitsaAppRegistryApplication.class, args);
	}

}
