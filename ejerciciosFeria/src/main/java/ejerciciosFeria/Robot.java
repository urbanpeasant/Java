package ejerciciosFeria;

public class Robot {

	//Atributos de la clase
	private int name;
	private int model;
	private int clase;
	private static int numeroDeRobots;
	
	//Constructor con parámetros
	
	public Robot (int name, int model, int clase) {
		this.name = name;
		this.model = model;
		this.clase = clase;
		numeroDeRobots++;
	}
	
	//Constructor sin parámetros
	
	public Robot (Robot r) {
		this(r.name,r.model,r.clase);
	}

	// Métodos setters y getters
	
	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public static int getNumeroDeRobots() {
		return numeroDeRobots;
	}

	//Método toString
	
	@Override
	public String toString() {
		return "Robot [name=" + name + ", model=" + model + ", clase=" + clase + "]";
	}

	//Método equals
	
	@Override
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (!(obj instanceof Robot)) {
			return false;
		} else {
			Robot r = (Robot) obj;
			boolean resultado = (this.name == r.name && this.clase == r.clase && this.model == r.model)? true : false;
			return resultado;
		}
	}
	
	//Método clone
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Robot(this.name, this.model, this.clase);
	}
}

