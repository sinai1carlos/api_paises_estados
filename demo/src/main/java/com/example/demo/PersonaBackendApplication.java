package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com/example/demo/model"})// Asegúrate de que este paquete es el correcto
@EnableJpaRepositories(basePackages = {"com/example/demo/repository"})  // Asegúrate de que este paquete es el correcto
public class PersonaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonaBackendApplication.class, args);
	}

}
