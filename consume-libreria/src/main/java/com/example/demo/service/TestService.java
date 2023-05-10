package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.Saludo;

@Service
public class TestService {
	
	public TestService() {}
	
	public String usoSaludo(String idioma) {
		Saludo saludo = new Saludo(idioma);
		return saludo.mensajeSaludo();
	}
	
	

}
