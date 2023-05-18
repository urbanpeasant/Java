package cadenas;


//6.- Pedir por consola un numero y guardarlo en un String. Convertirlo a Float y despues a float


import java.util.Scanner;

public class Ejercicio6 {

	//Usamos el método del ejercicio anterior para pedir el número
	
	public static int pedirNumero() {
		System.out.println("Introduce un numero:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	
	//Misma estructura que el anterior. Aquí lo convierto:
	public static void main(String[] args) {
		int numero = pedirNumero();
		//Número a String
		String numeroCadena = String.valueOf(numero);
		System.out.println("El numero introducido pasado a cadena es: " + numeroCadena);
		
		
		// Número a Float
		Float numeroFloat = Float.valueOf(numeroCadena);
		System.out.println("El numero introducido pasado a Float (wrapper!) es: " + numeroFloat);
		
		
		// Número a float
		float numeroFloatMin = numeroFloat.floatValue();
		System.out.println("El numero en float: " + numeroFloatMin);
		
	}
	
}