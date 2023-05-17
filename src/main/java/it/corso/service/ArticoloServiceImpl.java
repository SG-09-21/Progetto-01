package it.corso.service;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

import it.corso.model.Catalogo;
@Service
public class ArticoloServiceImpl implements ArticoloService {

	@Override
	public List<Catalogo> getCatalogo() {
		List<Catalogo> catalogo = new ArrayList<>();
		
		Catalogo articolo1 = new Catalogo();
		articolo1.setId(1);
		articolo1.setMarca("Samsung");
		articolo1.setModello("SM-A13");
		articolo1.setSistemaOp("Android 12");
		articolo1.setMemoria("32GB");
		articolo1.setPrezzo("143,89 euro");
		articolo1.setDescrizione("Samsung Galaxy A13 Smartphone Android, Processore Dual+Exa Core, Display Infinity-V\r\n"
				+ "da 6.6, Android 12.3 GB RAM, 32 GB di Memoria Interna Espandibile, Batteria 5.000 mAh");
		
		
		Catalogo articolo2 = new Catalogo();
		articolo2.setId(2);
		articolo2.setMarca("Samsung");
		articolo2.setModello("A32");
		articolo2.setSistemaOp("Android 4.0, Android 11.0");
		articolo2.setMemoria("128GB");
		articolo2.setPrezzo("212,00 Euro");
		articolo2.setDescrizione("Samsung Galaxy A32 4G Smartphone Android Senza SIM 6.4 Pollici, Display Infinity-U\r\n"
				+ "FHD+, 4 Fotocamere Posteriori, 4GB RAM e 128GB, Batteria 5.000 mAh");
		
		Catalogo articolo3 = new Catalogo();
		articolo3.setId(3);
		articolo3.setMarca("Samsung");
		articolo3.setModello("Galaxy A52S");
		articolo3.setSistemaOp("Android 11, Android 10.0");
		articolo3.setMemoria("6 GB");
		articolo3.setPrezzo("325,00 Euro");
		articolo3.setDescrizione("Samsung Galaxy A52s 5G Smartphone, Display Infinity-O FHD+ da 6,5 pollici, 6GB RAM\r\n"
				+ "e 128GB di memoria interna espandibile, Batteria 4.500 mAh e Ricarica Ultra-Rapida");
		
		catalogo.add(articolo1);
		catalogo.add(articolo2);
		catalogo.add(articolo3);
		
		
		return catalogo;
	}

}
