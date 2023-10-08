package figuras;

public abstract class Figura {
	
	//Las propiedades comunes van en la clase padre
	
	private String color;
	
	//Creamos el constructor de la propiedad
	
	public Figura(String color) {
		this.color = color;
	}

	//Métodos: 
	
	public abstract double superficie();
	public abstract double perimetro();
	public boolean comparaSuperficie(Figura f) {
		return f.superficie() == this.superficie() && f.getClass() == this.getClass();
	}
	
	//Getters and setters
	public  String getColor() {
		return color;
	}
	
}
