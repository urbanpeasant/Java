package figuras;

public class Rectangulo extends Figura{
	
	//Propiedades
	
	private int base;
	private int altura;
	
	//Constructores
	
	private Rectangulo(String color, int base, int altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	public Rectangulo() {
		this("blanco", 2, 1);
	}
	
	public Rectangulo(double superficie) {
		this("blanco", 2 * (int)Math.sqrt(superficie/2), (int)Math.sqrt(superficie/2));
	}
	
	public Rectangulo(int base, int altura) {
		this("blanco", base, altura);
	}
	
	//Métodos
	
	@Override
	
	public double superficie() {
		return base * altura;
	}
	
	@Override
	public double perimetro() {
		return (base + altura) * 2;
	}
	
	@Override
	
	public boolean comparaSuperficie(Figura f) {
		if (f instanceof Rectangulo) {
			return this.superficie() == f.superficie();
		} else {
			return false;
		}
	}
	
	@Override

	public String toString() {

		return "Rectángulo [color=" + super.getColor() + ", base=" + base + ", altura=" + altura+" superficie=" + superficie() + ", perimetro=" + perimetro() + "]";

	}
}


