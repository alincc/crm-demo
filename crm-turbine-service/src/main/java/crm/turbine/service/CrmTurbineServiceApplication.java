package crm.turbine.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
@EnableTurbine
@EnableHystrixDashboard
public class CrmTurbineServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmTurbineServiceApplication.class, args);
	}
}
