package com.GenSpark.RESTFulApp_5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RestFulApp5Application {

	public static void main(String[] args) {
		SpringApplication.run(RestFulApp5Application.class, args);
	}

}
