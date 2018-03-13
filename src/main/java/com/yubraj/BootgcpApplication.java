package com.yubraj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootgcpApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootgcpApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "hello world!";
	}
}
