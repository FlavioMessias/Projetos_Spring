package com.exercicio.exercicio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")

public class ObjetivoSemanalController {

	
	@GetMapping
	public String objetivo () {
		return "Absorver os conteudos de Spring e conseguir aplica-los de maneira efetiva";
	}
}
