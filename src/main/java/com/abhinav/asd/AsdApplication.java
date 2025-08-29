package com.abhinav.asd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AsdApplication {
	public static void main(String[] args) {
		SpringApplication.run(AsdApplication.class, args);
	}
}

@RestController
class HelloController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, Microservices!";
	}
}
