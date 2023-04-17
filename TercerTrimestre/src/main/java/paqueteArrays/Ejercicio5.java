package paqueteArrays;

import java.util.Arrays;

//EJERCICIO 5, arrays invertidos: 
public class Ejercicio5 {
	
	public static void main(String[] args) {
	    int[] arrayOriginal = {1, 2, 3, 4, 5};
	    int[] arrayInvertido = new int[arrayOriginal.length];

	    for (int i = 0; i < arrayOriginal.length; i++) {
	        arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
	    }

	    System.out.println("Array original: " + Arrays.toString(arrayOriginal));
	    System.out.println("Array invertido: " + Arrays.toString(arrayInvertido));
	}


}
