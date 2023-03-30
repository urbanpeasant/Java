package ejerciciosPersonasNuevo;

public class Persona {
	
	private String nombre;
	private int edad;
	private Direccion direccion;

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

	public Direccion getDireccion() {
		return direccion;
	}
	
	public void setDireccion (Direccion direccion) {
		this.direccion = direccion;
	}
	
	public String toString() {
	
		return "El nombre de la persona es " + nombre + "y la edad es " + edad;
		
	}
	
	
	public Persona(String nombre, int edad, Direccion direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
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
		Persona p1 = new Persona(this.nombre, this.edad, this.direccion);
		return p1;
	}
	
	
	
	
	public static void main (String[] args) {
	
		Direccion d1 = new Direccion ("Bidasoa", 24, 41010);
		
		// crear una persona p1 llamada pepe de 21 años
		
		Persona p1 = new Persona ("Pepe", 21, d1 );
		// crear una persona p2 llamada jose de 21 años
		
		Persona p2 = new Persona ("Jose", 21, d1);
		// crear otra persona p3 pepe de 21 años
		
		Persona p3 = new Persona ("Pepe", 21, d1);
		
		// crear una persona p4 = p1
		
		Persona p4 = p1;
		
		// crear una persona p5 con constructor copia
		
		Persona p5 = new Persona(p1);
		
		
		//clonamos p1 en p6
		
		try {
			Persona p6=(Persona) p1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// p1 == p2? false
		
		
		
		// p1 == p3? false
		
		// p1 == p4? true
		
		// p2 == p4? false
		
		// p1 == p5? false
		
		// p1.equals(p1)? true
		
		//p1.equals(p2)? false
		
		//p1.equals(p2)? false
		
		//p1.equals(p3)? true
		
		//p1.equals(p4)? true
		
		//p2.equals(p4)? false
		
		//p3.equals(p4) true
		
		//p1.equals(p5) true
		
		
		
	}
	
	
	
	
	
}

