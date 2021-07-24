package atividade1.habilidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/habilidade")
public class HabilidadesMentalidadesController {

	@GetMapping 
	public String habilidadeMentalidade () {
		return "Para essa atividade utilizei a habilidade de atenção aos detalhes"
				+ "E a mentalidade de persistencia."; 	
	}
}
