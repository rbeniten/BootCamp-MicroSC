package com.nttdata.bootcamp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
@RequestMapping("/api")
public class TestController {
	
	private Counter counter;
	
	public TestController(MeterRegistry registry) {
		this.counter = Counter.builder("invocaciones.hello")
				.description("Invocaciones totales del endpoint hello world")
				.register(registry);
	}
	
	
	@GetMapping("/hello")
	public String helloWorld() {
		//	Para saber cuantas veces ha pedido el método
		//System.out.println(counter.count());
		counter.increment();
		return "Hello world!";
	}

}
