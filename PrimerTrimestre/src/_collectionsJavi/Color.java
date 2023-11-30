package _collectionsJavi;

import java.util.Random;

public enum Color {
	RO("rojo"), NA("naranja"), AM("amarillo"), VE("verde"), AZ("azul"), IN("índigo"), VI("violeta");

	private String nombre;
	private static Random random = new Random();

	private Color(String nombreCompleto) {
		this.nombre = nombreCompleto;
	}

	public static Color colorAleatorio() {
		return Color.values()[random.nextInt(Color.values().length)];
	}

	public String getNombre() {
		return nombre;
	}

}