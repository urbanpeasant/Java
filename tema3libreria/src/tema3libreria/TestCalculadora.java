package tema3libreria;

public class TestCalculadora {
	
	static void pruebaUnitariaSuma() {
	Calculadora mycalculadora=new Calculadora();
		
		int sumando1=1;
		int sumando2=1;
		
		int primeraSuma=mycalculadora.suma(sumando1, sumando2);
		
		if(primeraSuma !=2) {
			System.out.println("La prueba unitaria está mal");
		}
	}
		

	public static void main(String[] args) {
		
		pruebaUnitariaSuma();
		}
	}

