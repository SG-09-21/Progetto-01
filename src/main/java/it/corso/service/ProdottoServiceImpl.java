package it.corso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import it.corso.model.Prodotto;

@Service
public class ProdottoServiceImpl implements ProdottoService {
	
	

	@Override
	public List<Prodotto> inserisciProdotto() {
		
		List<Prodotto> catalogo = new ArrayList<>();
		
		Prodotto prodotto = new Prodotto();
		prodotto.setId(1);
		prodotto.setMarchio("Samsung");
		prodotto.setModello("SM-A13");
		prodotto.setSistemaOperativo("Android 12");
		prodotto.setMemoria("32 GB");
		prodotto.setPrezzo(143.89);
		prodotto.setDescrizione("Samsung Galaxy A13 Smartphone Android, "
				+ "Processore Dual+Exa Core, Display Infinity-V da 6.6, "
				+ "Android 12.3 GB RAM, 32 GB di Memoria Interna Espandibile, Batteria 5.000 mAh");
		
		Prodotto prodotto2 = new Prodotto();		
		prodotto2.setId(2);
		prodotto2.setMarchio("Samsung");
		prodotto2.setModello("A32");
		prodotto2.setSistemaOperativo("Android 4.0, Android 11.0");
		prodotto2.setMemoria("128 GB");
		prodotto2.setPrezzo(212.00);
		prodotto2.setDescrizione("Samsung Galaxy A32 4G Smartphone Android Senza SIM 6.4 Pollici, "
				+ "Display Infinity-U FHD+, 4 Fotocamere Posteriori, 4GB RAM e 128GB, Batteria 5.000 mAh");
		
		Prodotto prodotto3 = new Prodotto();		
		prodotto3.setId(3);
		prodotto3.setMarchio("Samsung");
		prodotto3.setModello("Galaxy A52s");
		prodotto3.setSistemaOperativo("Android 11, Android 10.0");
		prodotto3.setMemoria("6 GB");
		prodotto3.setPrezzo(325.00);
		prodotto3.setDescrizione("Samsung Galaxy A52s 5G Smartphone, Display Infinity-O FHD+ da 6,5 pollici, "
				+ "6GB RAM e 128GB di memoria interna espandibile, Batteria 4.500 mAh e Ricarica Ultra-Rapida");
		
		catalogo.add(prodotto);
		catalogo.add(prodotto2);
		catalogo.add(prodotto3);
		
		return catalogo;
		
	}

	@Override
	public Prodotto dettaglioProdotto(List<Prodotto> catalogo, int id) {
		return catalogo.get(id-1);
	}
	
	
}
