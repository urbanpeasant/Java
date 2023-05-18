package cadenas;

// 1.- Pedir una cadena por consola y mostrar por pantalla la cantidad de vocales que tiene. Ejemplo: Entrada: cad = "Hola tu" Salida: La cantidad de vocales es 3

import java.util.Scanner;

public class Ejercicio1 {

	public static void cuentaVocales() throws IllegalArgumentException{
		System.out.println("Escribe una cadena de texto y te diré cuántas vocales tiene: ");
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		String teclado = sc.nextLine();

		try {
			for (int i = 0; i < teclado.length(); i++) {

				char caracter = teclado.charAt(i);

				if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
					contador++;
				} else if (Character.isDigit(caracter)) { 
					throw new IllegalArgumentException("Un número no es una cadena de texto!.");
				} else if (Character.isWhitespace(caracter)) {
					throw new IllegalArgumentException("¿Un espacio en blanco, en serio?.");
				}

			}
			System.out.println("La cantidad de vocales es  " + contador);
		} catch (IllegalArgumentException e) {
			System.out.println("Mensaje incorrecto" + e.getMessage());
		} finally {
			sc.close();
		}
	}

	public static void main(String[] args) {
		cuentaVocales();
	}
}