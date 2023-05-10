package arrays;

//Crear la clase TestArray que contenga una constante entera de valor 5, pida al usuario que inserte el numero de elementos dado por la constante y lo guarde en un array, al finalizar debe de mostrar el array por pantalla

import java.util.Scanner;

public class TestArray {

	//Creamos la constante
    public static final int TAMANIOARRAY = 5;

    //Creamos un array con el tamaño de la constante
    public static void main(String[] args) {
        int[] array = new int[TAMANIOARRAY];
        Scanner scanner = new Scanner(System.in);

        //Le pedimos al usuario que introduzca tantos enteros como tamaño tiene el array con un bucle for
        System.out.println("Introduce " + TAMANIOARRAY + " números enteros:");

        for (int i = 0; i < TAMANIOARRAY; i++) {
            System.out.print("Posición " + (i + 1) + " del array: ");
            array[i] = scanner.nextInt();
            
        }

        //Sacamos por pantalla lo que haya introducido el usuario, también con un for.
        System.out.println("Los números que has introducido en el array son:");
        for (int i = 0; i < TAMANIOARRAY; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

