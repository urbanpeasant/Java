package paqueteArrays;

import java.util.Scanner;

public class Ejercicio1 {

    // Método para rellenar el array
    public static void rellenarArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor en la siguiente posición: " + i + ": ");
            array[i] = scanner.nextInt();
        }
    }

    // Método para devolver el array por pantalla:
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }

    public static void main(String[] args) {
        int[] numeros = new int[10];
        rellenarArray(numeros);
        mostrarArray(numeros);
    }
}
