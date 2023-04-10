/* Crear la clase profesor que hereda de Persona, esta clase tendrá además un atributo idProfesor tipo String que contendrá el identificador del profesor y una atributo tipo String asignatura
 *  que contendrá la asignatura que enseña el profesor,
 *  implementar setters y getters, asi como los metodos equals, clone y toString, crear constructor con todos los parametros (suyos y de persona) y constructor copia. */

public class Profesor extends Persona{
	private String idProfesor;
	private String asignatura;

	public Profesor(String nombre, String apellidos, int edad, String idProfesor, String asignatura) {
		super(nombre, apellidos, edad);
		this.idProfesor = idProfesor;
		this.asignatura = asignatura;
	}

	public Profesor(Profesor p) {
		super(p);
		this.idProfesor = p.getIdProfesor();
		this.asignatura = p.getAsignatura();
	}

	public String getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Profesor)) {
			return false;
		}
		Profesor otroProfesor = (Profesor) obj;
		return idProfesor.equals(otroProfesor.getIdProfesor()) && asignatura.equals(otroProfesor.getAsignatura());
	}

	@Override
	public Profesor clone() {
		return (Profesor) super.clone();
	}

	@Override
	public String toString() {
		return super.toString() + ", ID: " + idProfesor + ", Asignatura: " + asignatura;
	}
}