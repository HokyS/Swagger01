package com.example.Swagger01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Swagger01Application {

	public static void main(String[] args) {
		SpringApplication.run(Swagger01Application.class, args);
	}

}
