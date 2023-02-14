package paqueteEjercicios;

import java.util.Scanner;

public class Ejercicio12 {
	
	public static void calculabilletes() {
		
		System.out.println("Introduce la cantidad de dinero para calcular cuanto es el mínimo de billetes necesarios: ");
		Scanner scanner = new Scanner(System.in);
		int cantidad = scanner.nextInt();
		scanner.close();
		
		int billetes[]= {500,200,100,50,20,10,5};
		int desglosado[];
		desglosado = new int [7];
		
		for (int i = 0; i < billetes.length; i++){
			int desglose = cantidad / billetes[i];
			desglosado[i] = desglose;
			cantidad = cantidad % billetes[i];
		}
		
		for (int i = 0; i < desglosado.length; i++){
			
			if (desglosado[i] > 0) {
				System.out.println("Necesitas " + desglosado[i] + " de " + billetes[i]);
			}
			
		}
		
		System.out.println("Sobran " + cantidad + " euros");
		
		
	}

	public static void main(String[] args) {
		calculabilletes();
	}

}