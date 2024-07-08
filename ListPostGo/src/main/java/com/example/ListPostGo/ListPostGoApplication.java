package com.example.ListPostGo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ListPostGoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ListPostGoApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ListPostGoApplication.class);
	}
}
