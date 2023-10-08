package figuras;

public class Cuadrado extends Figura{
	
	//Propiedades
	
	private int lado;
	
	//Constructores
	
	private Cuadrado(String color, int lado) {
		super(color);
		this.lado = lado;
	}
	
	public Cuadrado() {
		this("blanco", 1);
	}

	public Cuadrado (int lado) {
		this("blanco", lado);
	}
	
	//Métodos
	
	@Override
	public double superficie() {
		return lado * lado;
	}
	
	@Override
	public double perimetro() {
		return 4 * lado;
	}
	
	
	@Override
	public boolean comparaSuperficie(Figura f) {
	    if (this.getClass() == f.getClass()) {
	        return this.superficie() == f.superficie();
	    } else {
	        return false;
	    }
	}

	@Override

	public String toString() {
		return "Cuadrado [color=" + super.getColor() + ", lado=" + lado + ", superficie=" + superficie() + ", perimetro=" + perimetro() + "]";

	}
}
