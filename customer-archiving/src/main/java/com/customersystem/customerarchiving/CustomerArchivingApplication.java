package com.customersystem.customerarchiving;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ErrorPage;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2

public class CustomerArchivingApplication implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

	public static void main(String[] args) {
		SpringApplication.run(CustomerArchivingApplication.class, args);
	}

	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
		 factory.addErrorPages(new ErrorPage(HttpStatus.FORBIDDEN, "/errors/403.html"));
	        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/errors/404.html"));
	        factory.addErrorPages(new ErrorPage("/errors/500.html"));
	    }
	
	 @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("com.customersystem.customerarchiving"))              
	          .paths(PathSelectors.any())                          
	          .build();                                           
	    }

	}

	
