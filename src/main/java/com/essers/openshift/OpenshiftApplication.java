package com.essers.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftApplication {

	@GetMapping("/")
	public String welcome() {
		return "Welcome";
	}

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello world";
	}

	@GetMapping("/hello/{user}")
	public String helloMe(@PathVariable String user) {
		return "Hello " + user;
	}

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApplication.class, args);
	}

}
