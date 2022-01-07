package com.devops.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

public class ProductsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
		System.out.println("Products app started successfully @@@@@@");
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ProductsApplication.class);
    }
	
	

}
