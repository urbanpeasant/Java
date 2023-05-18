package cadenas;


import java.util.Scanner;

public class Ejercicio5 {
	
	// 5.- Pedir por consola un numero y guardarlo en un String. Convertirlo a Integer y despues a int
	
	
	//Hacemos un método para pedir número
	public static int pedirNumero() {
		System.out.println("Introduce un número: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	
	//Y aquí lo convertimos:
	public static void main(String[] args) {
		int numero = pedirNumero();
		
		
		//Número a String
		String numeroCadena = String.valueOf(numero);
		System.out.println("El numero introducido pasado a cadena es: " + numeroCadena);
		
		
		// Número a integer
		Integer numeroInteger = Integer.parseInt(numeroCadena);
		System.out.println("El numero introducido pasado a integer es: " + numeroInteger);
		
		
		// Número a int
		int numeroInt = numeroInteger.intValue();
		System.out.println("El numero introducido pasado a int es: " + numeroInt);
	}
	
}

//¿Está bien así? La estructura del código funciona... Pero como da lo mismo, no se si está bien hecho.