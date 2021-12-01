package com.generation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ExercicioUmController {

	@GetMapping
	public String exercicio1() {
		return "Usei mentalidades e habilidades de persistencia, orientação ao futuro e atenção aos detalhes";
	}
	
}
