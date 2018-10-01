package br.usjt.cadastraFilmes.controller;


import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastrarFilmeController {
	
	@RequestMapping("/cadastrar")
	
	public String execute() {
		Random random = new Random();
		int id = new Random().nextInt();
		
	return "cadastrarFilme";		
	}
}
