package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;

@RequestMapping("/api/")
@RestController
public class TestController {
	
	@Autowired
	TestService testService;
	
	
	@GetMapping("saludo/{idioma}")
	public String saludo(@PathVariable String idioma) {
		return testService.usoSaludo(idioma);
	}

}
