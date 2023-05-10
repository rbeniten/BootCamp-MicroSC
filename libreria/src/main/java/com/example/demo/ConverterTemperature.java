package com.example.demo;

public class ConverterTemperature {
	
	private Float temperatura;

	public ConverterTemperature(Float temperatura) {
		this.temperatura = temperatura;
	}

	
	public Float converterTemperatureToFarenheit() {
		return (temperatura * 9/5) + 32;
	}
	
	public Float converterTemperatureToCelsius() {
		return (temperatura - 32) * 5/9;
	}
	
	
	

}
