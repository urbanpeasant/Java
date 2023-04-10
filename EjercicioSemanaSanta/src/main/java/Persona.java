
public class Persona {

	/*
	 * Crear la clase Persona con nombre, apellidos y edad heredables, implementar
	 * los metodos set y get, implementar los metodos equals, clone y toString,
	 * crear constructor con todos los parametros y constructor copia
	 */

	
	public String nombre;
    public String apellidos;
    public int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona(Persona p) {
        this.nombre = p.getNombre();
        this.apellidos = p.getApellidos();
        this.edad = p.getEdad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Persona)) {
            return false;
        }
        Persona p = (Persona) obj;
        return nombre.equals(p.getNombre())
                && apellidos.equals(p.getApellidos())
                && edad == p.getEdad();
    }

    @Override
    public Persona clone() {
        try {
            return (Persona) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Nunca debería ocurrir
        }
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + ", " + edad + " años";
    }
}
	