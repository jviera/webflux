package mx.com.vieracode.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.vieracode.webflux.service.HelloServices;
import reactor.core.publisher.Flux;

@RestController
public class HelloController {

	@Autowired
	private HelloServices service;
	
	@RequestMapping("/hello")
	public Flux<String> messageHello() {
		return service.message();
	}
}
