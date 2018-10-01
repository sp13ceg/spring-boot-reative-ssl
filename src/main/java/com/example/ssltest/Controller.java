package com.example.ssltest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class Controller {
	
	@GetMapping("/hi")
	public Mono<String> sayHello() {
		return Mono.just("hello");
	}
}
