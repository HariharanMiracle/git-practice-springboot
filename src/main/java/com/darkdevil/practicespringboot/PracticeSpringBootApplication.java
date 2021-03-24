package com.darkdevil.practicespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class PracticeSpringBootApplication {

	@Bean
	public WebClient.Builder getWebClient(){
		WebClient.Builder builder = WebClient.builder();
		return builder;
	}

	public static void main(String[] args) {
		SpringApplication.run(PracticeSpringBootApplication.class, args);
	}

}
