package com.darkdevil.practicespringboot;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.reactive.ClientHttpConnector;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;


@EnableScheduling
@SpringBootApplication
public class PracticeSpringBootApplication {

	@Bean
	public WebClient getWebClient(){
		HttpClient httpClient = HttpClient.create()
				.tcpConfiguration(tcpClient -> tcpClient.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 3000)
				.doOnConnected(connection -> connection
								.addHandlerLast(new ReadTimeoutHandler(3))
								.addHandlerLast(new WriteTimeoutHandler(3))));

		ClientHttpConnector connector = new ReactorClientHttpConnector(httpClient.wiretap(true));

		WebClient builder = WebClient.builder()
				.clientConnector(connector).build();
		return builder;
	}

	public static void main(String[] args) {
		SpringApplication.run(PracticeSpringBootApplication.class, args);
	}

}
