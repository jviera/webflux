package mx.com.vieracode.webflux.service;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.vieracode.webflux.repository.HelloRepository;
import reactor.core.publisher.Flux;

@Service
public class HelloServices {
	
	@Autowired
	private HelloRepository repository;
	
	public Flux<String> message() {		
		return Flux.concat(repository.message(), repository.message(), repository.message()).delayElements(Duration.ofSeconds(2));		
	}

}
