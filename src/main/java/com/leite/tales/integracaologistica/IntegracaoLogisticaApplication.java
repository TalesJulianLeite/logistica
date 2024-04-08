package com.leite.tales.integracaologistica;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.leite.tales.integracaologistica.infrastructre.IntegrationProperties;
import com.leite.tales.integracaologistica.service.impl.IntegrationServiceImpl;

@SpringBootApplication
@EnableConfigurationProperties(IntegrationProperties.class)
public class IntegracaoLogisticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegracaoLogisticaApplication.class, args);
	}

	@Bean
	CommandLineRunner init(IntegrationServiceImpl integrationService) {
		return (args) -> {
			integrationService.deleteAll();
			integrationService.init();
		};
	}
}
