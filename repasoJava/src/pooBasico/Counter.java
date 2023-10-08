package pooBasico;

public class Counter {

	int value = 0;
	int maxValue = 100_000;
	String model = "N-COUNTER";

//constructor

	public Counter() {

	}

	public Counter(int maxValue) {
		this(maxValue, "N-COUNTER");
	}

	public Counter(int maxValue, String model) {
		if (maxValue < 100) {
			this.maxValue = 100;
		} else {
			this.maxValue = maxValue;
		}
		this.model = model;
	}
	
	//Constructor copia
	
	public Counter(Counter c) {
		this.maxValue = c.maxValue;
		this.model = c.model;
		this.value = c.value;
	}
	
	//Método para mostrar la info. Nos permite sustituir los prints del main.
	
	public void show() {
		System.out.printf("Contador: modelo (%s) y valor %d de %d. %n",
				model, value, maxValue);
	}
	
	//Método increment del ejercicio. Mediante IF decimos que si el valor ya ha llegado al valor máximo, no haga nada
	// y retorne false. Si no ha llegado al máximo, suma uno y retorna true. 
	
	public boolean increment() {
		if(value == maxValue) {
			return false;
		}else {
			value++;
			return true;
		}
	}
	
	public boolean increment(int n) {
		if(value +n > maxValue) {
			value = maxValue;
			return false;
		}else {
			value = value +n;
			return true;
		}
	}
	
	//Método para resetear:
	
	public boolean reset(){
		if(value == maxValue) {
			value = 0;
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		System.out.println("Esto es c1 ahora");
		c1.show();
		Counter c2 = new Counter(99);
		System.out.println("Esto es c2 ahora");
		c2.show();
		Counter c3 = new Counter(7, "Modelito guay");
		System.out.println("Esto es c3 ahora");
		c3.show();
		for (int i=0; i<95; i++) {
			System.out.println(c3.increment());	
		}
		c3.show();
		
		System.out.println("Probando constructor copia: ");
		
		Counter c4 = new Counter(c2);
		c2.show();
		c4.show();
		
		System.out.println("Probando el método increment(n)");
		Counter c5 = new Counter(200);
		c5.show();
		System.out.println(c5.increment(150));
		c5.show();
		
		System.out.println("Probando el método reset");
		Counter c6 = new Counter();
		c6.increment(110000);
		c6.show();
		System.out.println(c6.reset());
		c6.show();
	}
}
