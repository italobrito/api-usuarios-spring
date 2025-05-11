package com.erp.micro_api_usuarios_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.erp.micro_api_usuarios_spring"})
public class MicroApiUsuariosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroApiUsuariosSpringApplication.class, args);
	}

}
