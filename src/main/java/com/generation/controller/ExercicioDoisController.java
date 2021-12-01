package com.generation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ExercicioDoisController {

	@GetMapping
	public String exercicio1() {
		return "Meu objetivo é aprender bem spring para poder criar meu blog pessoal";
	}
	
}
