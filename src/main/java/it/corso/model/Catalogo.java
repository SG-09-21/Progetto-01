package it.corso.model;

public class Catalogo {
	
	//attributi istanza
	private int id;
	private String modello;
	private String marca;
	private String descrizione;
	private String sistemaOp;
	private String memoria;
	private String prezzo;
	
	
	
	public String getSistemaOp() {
		return sistemaOp;
	}
	public void setSistemaOp(String sistemaOp) {
		this.sistemaOp = sistemaOp;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	

}