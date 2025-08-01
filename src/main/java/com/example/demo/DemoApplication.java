package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class DemoApplication {

	@GetMapping("/hello")
	public String checkMethod() {
		return "Hello: Saranya";
	}
	@GetMapping("/hi")
	public String checkMethod1() {
		return "Hello: hi";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Welcome to ********************Spring*********************");
	}

}
