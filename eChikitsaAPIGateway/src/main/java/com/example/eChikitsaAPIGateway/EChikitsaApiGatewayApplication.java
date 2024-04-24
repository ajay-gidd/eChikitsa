package com.example.eChikitsaAPIGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class EChikitsaApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EChikitsaApiGatewayApplication.class, args);
	}

}
