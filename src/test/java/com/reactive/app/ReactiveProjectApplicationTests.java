package com.reactive.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;

import java.util.function.Consumer;

@SpringBootTest
class ReactiveProjectApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void workingWithMono(){
		//System.out.println("Rajan testing");
		Mono<Object> errorMono = Mono.error(new RuntimeException("Error"));
		errorMono.subscribe(System.out::println);
		Mono<String> m1 = Mono
				.just("Learn code with Rajan")
				.log()
				.then(Mono.empty());



	}
}
