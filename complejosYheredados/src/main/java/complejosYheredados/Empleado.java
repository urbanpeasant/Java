package complejosYheredados;

public class Empleado {

	public int idEmpleado;
	private String departamento;
	private Persona persona;

	public Empleado(int idEmpleado, String departamento, Persona persona) {
		this.idEmpleado = idEmpleado;
		this.departamento = departamento;
		this.persona = persona;
	}

	public Empleado(Empleado e) {
		this.idEmpleado = e.idEmpleado;
		this.departamento = e.departamento;
		this.persona = e.persona;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public String getDepartamento() {
		return departamento;
	}
	
	public Persona getPersona() {
		return persona;
	}
	
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "El empleado con ID " + idEmpleado + ", trabaja para el departamento " + departamento + ".\n"
				+ persona.toString();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Empleado e1 = new Empleado(this.idEmpleado, this.departamento, this.persona);
		return e1;
	}

	@Override
	public boolean equals(Object obj) {
		Empleado e = (Empleado) obj;
		if (this.idEmpleado == e.idEmpleado && this.departamento == e.departamento && this.persona == e.persona)
			return true;
		else
			return false;
	}
	
}
	

