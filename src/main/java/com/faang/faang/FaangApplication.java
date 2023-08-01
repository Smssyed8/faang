package com.faang.faang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FaangApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaangApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}

}
