package com.nps.masterserviceregistryapp01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MasterServiceRegistryApp01Application {

	public static void main(String[] args) {
		SpringApplication.run(MasterServiceRegistryApp01Application.class, args);
	}

}