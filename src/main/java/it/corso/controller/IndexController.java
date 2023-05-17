package it.corso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.corso.model.Catalogo;
//localhost:8080
import it.corso.service.ArticoloService;
@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired
	private ArticoloService articoloservice;
	
	@GetMapping
	public String getpage(Model model) {
		List<Catalogo> catalogo = articoloservice.getCatalogo();
		model.addAttribute("catalogo", catalogo);
		
		return "catalogo";
	}
}
