package it.corso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Catalogo;
//localhost:8080
import it.corso.service.ArticoloService;
@Controller
@RequestMapping("/dettaglio")
public class IndexDettaglio {
	
	@Autowired
	private ArticoloService articoloservice;
	
	@GetMapping
	public String getDettaglio(
	        @RequestParam(name = "id", required = false) int id, Model model) {
		
		List<Catalogo> articoli = articoloservice.getCatalogo();
		Catalogo articolo = articoli.get(id-1);

	    model.addAttribute("articolo", articolo);

	    return "dettaglio";
	}

	
	
}
