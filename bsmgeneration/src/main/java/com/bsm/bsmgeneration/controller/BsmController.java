package com.bsm.bsmgeneration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {
	
	@GetMapping
	public String bsm() {
		return "MENTALIDADES \r\nOrientação ao futuro \r\nResponsabilidade pessoal \r\nMentalidade de crescimento \r\nPersistência\n \nHABILIDADES \r\nTrabalho em equipe \r\nOrientação ao detalhe \r\nPró-atividade \r\nComunicação";
		
	}

}
