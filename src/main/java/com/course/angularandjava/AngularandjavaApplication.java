package com.course.angularandjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AngularandjavaApplication {
	@GetMapping("/oi")
	public String hello() {
		return "Olá Vitor";
	}
	public static void main(String[] args) {
		SpringApplication.run(AngularandjavaApplication.class, args);
	}

}
