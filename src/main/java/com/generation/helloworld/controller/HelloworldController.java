package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloworldController {
	
	@GetMapping
	public String ola () {
		return "Olá mundo !  ";
		
	}
	// esse get tem um complemento resolvendo o problema de ambiguidade
     @GetMapping("generation")
    	public String bsmgeneration() {
		return "Competencias comportamentais:\r\n"
				+ "\r\n"
				+ "Comunicação\r\n"
				+ "Proatividade\r\n"
				+ "Orientação ao detalhe\r\n"
				+ "Trabalho em equipe\r\n"
				+ "\r\n"
				+ "Mentalidades:\r\n"
				+ "\r\n"
				+ "Responsabilidade Pessoal\r\n"
				+ "Mentalidade de Crescimento\r\n"
				+ "Orientação ao Futuro\r\n"
				+ "Persistencia";
		
	}
     
        @GetMapping ("objetivo")
        public String objetivos() {
			return "Meus objetivos essa semana e desenvolver mais ainda minhas habilidades tecnicas e melhorar minha proativade";
        	
        }
   
     }
 

