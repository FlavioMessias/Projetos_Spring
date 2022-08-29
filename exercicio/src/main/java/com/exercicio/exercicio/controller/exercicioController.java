package com.exercicio.exercicio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/ex")

public class exercicioController {
	
	@GetMapping
	public String helloWorld () {
		return "Hello World!!!";
	}
	
	@GetMapping
	public String bsm () {
		return "MENTALIDADES \\r\\nOrientação ao futuro \\r\\nResponsabilidade pessoal \\r\\nMentalidade de crescimento \\r\\nPersistência\\n \\nHABILIDADES \\r\\nTrabalho em equipe \\r\\nOrientação ao detalhe \\r\\nPró-atividade \\r\\nComunicação";
	}
	
	@GetMapping
	public String objetivo () {
		return "Absorver os conteudos de Spring e conseguir aplica-los de maneira efetiva";
	}
	
}


