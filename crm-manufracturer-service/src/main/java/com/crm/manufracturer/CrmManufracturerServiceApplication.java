package com.crm.manufracturer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CrmManufracturerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmManufracturerServiceApplication.class, args);
	}
}
