package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class DemoribbonnoeurekaApplication {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/")
	public String home() {
		return this.restTemplate.getForObject("http://myClient/", String.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoribbonnoeurekaApplication.class, args);
	}
}
