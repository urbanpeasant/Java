package paqueteArrays;

//EJERCICIO 7 PERSONA

public class Persona {
	
	String nombre;
	String dni;
	int edad;
	
	public Persona(String nombre, String dni, int edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public boolean equals(Object obj) {
		Persona p = (Persona) obj;
		if (this.nombre.equals(p.nombre) && this.dni.equals(p.dni) && this.edad==p.edad)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "Nombre de la persona: " + nombre + "\nDNI: " + dni + "\nEdad: " + edad;
	}
	
	public static void muestraPersonas(Persona[] p) {
		for (int i = 0 ; i < p.length ; i++) {
			System.out.println("Persona " + i);
			System.out.println(p[i].toString());
			System.out.println("\n======================\n");
		}
	}
	
	Persona personaMayorDeEdad (Persona[] p) {
		Persona p1 = null;
		for (int i = 0 ; i < p.length ; i++) {
			if (p[i].edad > 18)
				p1 = p[i];
		}
		return p1;
	}
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Jose", "12345678A", 30);
		Persona p2 = new Persona("Lola", "23456789B", 25);
		Persona p3 = new Persona("Pilar", "34567890C", 42);
		Persona p4 = new Persona("Adri", "45678901D", 18);
		Persona p5 = new Persona("Carlos", "56789012E", 50);
		Persona p6 = new Persona("Pepe", "67890123F", 37);
		Persona p7 = new Persona("Kike", "78901234G", 23);
		Persona p8 = new Persona("Juandi", "89012345H", 29);
		Persona p9 = new Persona("Dani", "90123456I", 33);
		Persona p10 = new Persona("Elena", "01234567J", 27);
		
		Persona[] arrayPersonas = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
		muestraPersonas(arrayPersonas);
	}
}