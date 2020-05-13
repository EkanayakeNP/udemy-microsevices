package com.in28minutes.microservices.netflixzuulapigetwayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@EnableZuulProxy
@EnableDiscoveryClient

@SpringBootApplication
public class NetflixZuulApiGetwayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulApiGetwayServerApplication.class, args);
	}
	
	@Bean
	public Sampler defualtSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
