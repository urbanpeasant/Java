package _collectionsJavi;

import java.util.Random;

public enum Marca {
	VW("volkswagen"), SE("seat"), SK("skoda"), BM("BMW"), AU("audi");
	
	private String nombre;
	private static Random random = new Random();
	
	private Marca(String nombreCompleto) {
		this.nombre = nombreCompleto;
	}

	public static Marca marcaAleatoria() {
		return Marca.values()[random.nextInt(Marca.values().length)];
	}
	
	public String getNombre() {
		return nombre;
	}
	
}