package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.ConverterTemperature;

@Service
public class TemperatureService {
	
	public TemperatureService() {}
	
	public Float converterTemperCelsiusToFarenheit(Float temperatura) {
		ConverterTemperature convt = new ConverterTemperature(temperatura);
		
		return convt.converterTemperatureToFarenheit();
	}
	
	public Float converterTemperFarenheitToCelsius(Float temperatura) {
		ConverterTemperature convt = new ConverterTemperature(temperatura);
		
		return convt.converterTemperatureToCelsius();
	}

}
