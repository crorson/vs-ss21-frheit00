package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HelloWorldApplication {

//	private static Integer helloId = 0;
//	public static List<String> hellos = new ArrayList<>();
//
//	@GetMapping("/sayHello")
//	public String sayHello() {
//
//		return "Hello world!";
//	}
//
//	@GetMapping("/sayHelloAgain")
//	public String sayHelloAgain() {
//
//		return "Hello world again!";
//	}
//
//	@PostMapping("/postSomething")
//	public String createHello (@RequestBody String hello) {
//
//		return "I say something else:" + hello;
//	}

	public static void main(String[] args) {

		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
