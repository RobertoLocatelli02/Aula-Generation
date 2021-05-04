package com.HelloWorld.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/HelloWorld")
	@GetMapping
	String hello() {
		return "Hello World";
	}

	@RequestMapping("/HelloWorld1")
	@GetMapping
	String habilidades_e_mentalidades() {
		return "habilidade: atenção aos detalhes \nmentalidade: persistência";
	}

	@RequestMapping("/HelloWorld2")
	@GetMapping
	String objetivos_da_semana() {
		return "habilidade: comunicação \nmentalidade: orientação ao futuro";
	}
}
