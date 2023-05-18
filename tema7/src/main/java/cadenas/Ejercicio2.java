package cadenas;

//2.- Pedir una cadena por consola,  invertir la misma y mostrar por pantalla. Ejemplo: Entrada: "casa blanca" Salida: "acnalb asac"

import java.util.Scanner;

public class Ejercicio2 {
	
	//Aquí hacemos que el usuario meta la cadena 
	
	public static String introduceCadena() {
		System.out.println("Introduce una cadena y te la devolveré al revés.");
		Scanner sc = new Scanner(System.in);
		String cadena = sc.next();
		sc.close();
		return cadena;
	}
	
	public static String invertirCadena(String s) {
		String cadenaInvertida = "";
		for (int i = 0 ; i < s.length() ; i++)
			cadenaInvertida += s.charAt(s.length() -1 - i);
		return cadenaInvertida;
	}
	
	public static void main(String[] args) {
		
		String s = introduceCadena();
		String cadenaInvertida = invertirCadena(s);
		System.out.println("Tu cadena: " + s + " del reves sería: " + cadenaInvertida);
		
	}
	
}