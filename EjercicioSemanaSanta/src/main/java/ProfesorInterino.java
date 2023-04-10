/*
 * Crear la clase ProfesorInterino que hereda de profesor y tiene un atributo
 * fechaInterinidad tipo date. Implementar setters y getters, asi como los
 * metodos equals, clone y toString, crear constructor con todos los parametros
 * (suyos y de Profesor) y constructor copia.
 */

import java.util.Date;

public class ProfesorInterino extends Profesor {
	private Date fechaInterinidad;

	public ProfesorInterino(String nombre, String apellidos, int edad, String idProfesor, String asignatura,
			Date fechaInterinidad) {
		super(nombre, apellidos, edad, idProfesor, asignatura);
		this.fechaInterinidad = fechaInterinidad;
	}

	public ProfesorInterino(ProfesorInterino pi) {
		super(pi);
		this.fechaInterinidad = pi.getFechaInterinidad();
	}

	public Date getFechaInterinidad() {
		return fechaInterinidad;
	}

	public void setFechaInterinidad(Date fechaInterinidad) {
		this.fechaInterinidad = fechaInterinidad;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof ProfesorInterino)) {
			return false;
		}
		ProfesorInterino otroProfesorInterino = (ProfesorInterino) obj;
		return fechaInterinidad.equals(otroProfesorInterino.getFechaInterinidad());
	}

	@Override
	public ProfesorInterino clone() {
		return (ProfesorInterino) super.clone();
	}

	@Override
	public String toString() {
		return super.toString() + ", Fecha de interinidad: " + fechaInterinidad;
	}
}