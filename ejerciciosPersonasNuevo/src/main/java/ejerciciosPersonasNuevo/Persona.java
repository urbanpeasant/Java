package ejerciciosPersonasNuevo;

public class Persona {
	
	private String nombre;
	private int edad;

	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String toString() {
	
		return "El nombre de la persona es " + nombre + "y la edad es " + edad;
		
	}
	
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona (Persona p) {
		this.nombre = p.nombre;
		this.edad = p.edad;
	}
	
	
	public boolean equals(Object obj) {
		Persona p = (Persona) obj;
		if (this.nombre == p.nombre && this.edad == p.edad) {
			return true;
		} else {
			return false;
		}
	}
	
	
	protected Object clone()throws CloneNotSupportedException{
		Persona p1 = new Persona(this.nombre, this.edad);
		return p1;
	}
	
	
	
	
	public static void main (String[] args) {
	
		// crear una persona p1 llamada pepe de 21 años
		
		Persona p1 = new Persona ("Pepe", 21);
		// crear una persona p2 llamada jose de 21 años
		
		Persona p2 = new Persona ("Jose", 21);
		// crear otra persona p3 pepe de 21 años
		
		Persona p3 = new Persona ("Pepe", 21);
		
		// crear una persona p4 = p1
		
		Persona p4 = p1;
		
		// p1 == p2?
		
		// p1 == p3?
		
		// p1 == p4?
		
		// p2 == p4?
		
		
		
	}
	
	
	
	
	
}

