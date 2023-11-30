package accesoAFicheros;

import java.util.Random;

public class Persona {

	// Propiedades

	private String nombre;
	private String apellido1;
	private String apellido2;
	private int nacimiento;

	private static Random r = new Random();
	private static String[] arrayNombres;
	private static String[] arrayApellidos;

	// Constructor sin parámetros

	public Persona() {
		this.nombre = arrayNombres[r.nextInt(arrayNombres.length)];
		this.apellido1 = arrayApellidos[r.nextInt(arrayApellidos.length)];
		this.apellido2 = arrayApellidos[r.nextInt(arrayApellidos.length)];
		this.nacimiento = 1920 + r.nextInt(2024-1920);
	}

}
