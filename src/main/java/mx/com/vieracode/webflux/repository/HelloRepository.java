package mx.com.vieracode.webflux.repository;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class HelloRepository {

	public Mono<String> message() {
		return Mono.just("Hello world! ");
	}
}
