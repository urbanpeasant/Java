package figuras;

public class Circulo extends Figura{
	
	//Propiedades
	
	private int radio;
	private final static double PI = 3.1416;
	
	//Constructores
	
	private Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}
	
	public Circulo() {
		this("blanco", 1);
	}
	
	public Circulo(double superficie) {
		this("blanco", (int) Math.sqrt(superficie/PI));
	}
	
	public Circulo(int radio) {
		this("blanco", radio);
	}
	
	//Métodos
	
	@Override
	
	public double superficie() {
		return PI * radio * radio;
	}
	
	@Override
	
	public double perimetro() {
		return 2 * PI * radio;
	}

	@Override
	
	public boolean comparaSuperficie(Figura f) {
		if (f instanceof Circulo) {
			return this.superficie() == f.superficie();
		} else {
			return false;
		}
	}
	
	@Override

	public String toString() {

		return "Circulo [color=" + super.getColor() + ", radio=" + radio + ", superficie=" + superficie() + ", perimetro=" + perimetro() + "]";

	}


}
