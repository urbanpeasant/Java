package refactorizacion;

import java.util.Date;

public class ExtraccionClases {
	
	// Aquí he separado la clase empleado de la clase salario. Por un lado tenemos métodos referentes al empleado y por otro los del salario. Pueden interactuar entre sí sin problemas, pero el código es más legible y modular.
	// Los métodos los he dejado comentados tal y como nos da el ejercicio, no se si querías que los hiciésemos también.
	
	
	public class Empleado {
	    private String nombre;
	    private String apellido;
	    private Date fechaContratacion;
	    private Salario salario;

	    public Empleado(String nombre, String apellido, Date fechaContratacion, double salarioBase) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.fechaContratacion = fechaContratacion;
	        this.salario = new Salario(salarioBase);
	    }

	    // getters y setters para los atributos

	    public double calcularSalario() {
	        return salario.calcularSalario();
	    }

	    public int calcularAntiguedad() {
	        // lógica para calcular la antigüedad
	    }

	    public void imprimirInformacion() {
	        // imprimir información sobre el empleado
	    }

	    // otros métodos relacionados con los empleados
	}

	public class Salario {
	    private double salarioBase;

	    public Salario(double salarioBase) {
	        this.salarioBase = salarioBase;
	    }

	    public double calcularSalario() {
	        // lógica para calcular el salario
	    }

	    // otros métodos relacionados con el salario
	}


}
