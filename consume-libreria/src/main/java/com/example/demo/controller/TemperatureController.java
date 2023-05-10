package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TemperatureService;

@RequestMapping("/api/")
@RestController
public class TemperatureController {
	
	@Autowired
	TemperatureService temperatureService;
	
	//Peticion para postman: 
	@GetMapping("temperature/ToFarenheit/{temperatura}")
	public Float convertToFarenheit(@PathVariable Float temperatura) {
		return temperatureService.converterTemperCelsiusToFarenheit(temperatura);
	}
	
	//Peticion para postman: 
	@GetMapping("temperature/ToCelsius/{temperatura}")
	public Float saludo(@PathVariable Float temperatura) {
		return temperatureService.converterTemperFarenheitToCelsius(temperatura);
	}

}
