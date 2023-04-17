package paqueteArrays;

import java.util.Random;
import java.util.Scanner;

/*AQUÍ VAN DEL EJERCICIO 2 AL 4 INCLUIDOS*/

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Decide cuál es el tamaño del array: ");
		int tamanoArray = scanner.nextInt();
		int[] arrayNumeros = new int[tamanoArray];
		rellenarArray(arrayNumeros, 0, 9);
		mostrarArray(arrayNumeros);
		int suma = sumarArray(arrayNumeros);
		System.out.println("La suma de todos los valores del array es: " + suma);
	}

	// Método privado para generar números aleatorios
	private static int generarNumeroAleatorio(int min, int max, Random random) {
		return random.nextInt(max - min + 1) + min;
	}

	// Método para sumar los valores del array
	public static int sumarArray(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	}

	// MÉtodo para rellenar el array con números aleatorioss
	public static void rellenarArray(int[] array, int min, int max) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = generarNumeroAleatorio(min, max, random);
		}
	}

	// Método que devuelve el array y la suma de sus valores.

	public static void mostrarArray(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posición " + i + ": " + array[i]);
			suma += array[i];
		}
		System.out.println("La suma de todos los valores del array es: " + suma);
	}

	
	//Método para comparar arrays (EJERCICIO 3)
	public static boolean compararArrays(int[] array1, int[] array2) {
	    if (array1.length != array2.length) {
	        return false;
	    }
	    for (int i = 0; i < array1.length; i++) {
	        if (array1[i] != array2[i]) {
	            return false;
	        }
	    }
	    return true;
	}
	
	//Método para comparar arrays de string (EJERCICIO 4)

	public static boolean compararArraysString(String[] array1, String[] array2) {
	    if (array1.length != array2.length) {
	        return false;
	    }
	    for (int i = 0; i < array1.length; i++) {
	        if (!array1[i].equals(array2[i])) {
	            return false;
	        }
	    }
	    return true;
	}

	
}
