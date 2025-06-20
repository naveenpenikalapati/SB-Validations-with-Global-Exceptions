package com.validations.validationsWithGlobalExceptionHandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages ="com.validations.validationsWithGlobalExceptionHandling")
public class ValidationsWithGlobalExceptionHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidationsWithGlobalExceptionHandlingApplication.class, args);
	}

}
