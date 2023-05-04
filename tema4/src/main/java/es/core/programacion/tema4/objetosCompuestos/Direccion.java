package es.core.programacion.tema4.objetosCompuestos;

public class Direccion {

	private int numero;
	private String municipio;
	private int cp;
	
	
	//Constructor
	
	public Direccion (int numero, String municipio, int cp) {
		this.numero = numero;
		this.municipio = municipio;
		this.cp = cp;
	}
	
	
	
	//métodos seters y getters
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	
	
	
}
