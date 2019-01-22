package com.krg.system.springboilerplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringBoilerplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoilerplateApplication.class, args);
	}

}

