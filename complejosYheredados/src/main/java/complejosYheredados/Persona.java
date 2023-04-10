package complejosYheredados;

public class Persona {

	public String nombre;
	public String apellidos;
	public int anyoNacimiento;
	private String apodo;

	public Persona(String nombre, String apellidos, int anyoNacimiento, String apodo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anyoNacimiento = anyoNacimiento;
		this.apodo = apodo;
	}

	public Persona(Persona p) {
		this.nombre = p.nombre;
		this.apellidos = p.apellidos;
		this.anyoNacimiento = p.anyoNacimiento;
		this.apodo = p.apodo;
	}
	
	
	// Constructor solo con nombre y apellidos.
	public Persona (String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public String getApodo() {
		return apodo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setAnyoNacimiento(int anyo) {
		anyoNacimiento = anyo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	@Override
	public boolean equals(Object obj) {
		Persona p = (Persona) obj;
		if (this.nombre == p.nombre && this.apellidos == p.apellidos && this.anyoNacimiento == p.anyoNacimiento
				&& this.apodo == p.apodo)
			return true;
		else
			return false;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Persona p1 = new Persona(this.nombre, this.apellidos, this.anyoNacimiento, this.apodo);
		return p1;
	}

	@Override
	public String toString() {
		return "Persona que se llama " + nombre + ", cuyos apellidos son " + apellidos + ", nacida en el año "
				+ anyoNacimiento + ", conocida como " + apodo;
	}
}
	

