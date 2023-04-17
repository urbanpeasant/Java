package paqueteArrays;

import java.util.Arrays;
import java.util.Random;

// EJERCICIO 6 MATRIZ 

public class Matriz {
    private static final int FILAS = 4;
    private static final int COLUMNAS = 4;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[][] matriz = generarMatrizAleatoria();

        System.out.println("Matriz:");
        imprimirMatriz(matriz);

        System.out.println("Lectura por filas:");
        leerMatrizPorFilas(matriz);

        System.out.println("Lectura por columnas:");
        leerMatrizPorColumnas(matriz);

        System.out.println("Lectura por filas desde el final:");
        leerMatrizPorFilasDesdeElFinal(matriz);

        System.out.println("Lectura por columnas desde el final:");
        leerMatrizPorColumnasDesdeElFinal(matriz);

        System.out.println("Diagonal:");
        imprimirDiagonalMatriz(matriz);
    }

    public static int[][] generarMatrizAleatoria() {
        int[][] matriz = new int[FILAS][COLUMNAS];

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = RANDOM.nextInt(10);
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < FILAS; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }

    public static void leerMatrizPorFilas(int[][] matriz) {
        for (int i = 0; i < FILAS; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }

    public static void leerMatrizPorColumnas(int[][] matriz) {
        for (int i = 0; i < COLUMNAS; i++) {
            int[] columna = new int[FILAS];
            for (int j = 0; j < FILAS; j++) {
                columna[j] = matriz[j][i];
            }
            System.out.println(Arrays.toString(columna));
        }
    }

    public static void leerMatrizPorFilasDesdeElFinal(int[][] matriz) {
        for (int i = FILAS - 1; i >= 0; i--) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }

    public static void leerMatrizPorColumnasDesdeElFinal(int[][] matriz) {
        for (int i = COLUMNAS - 1; i >= 0; i--) {
            int[] columna = new int[FILAS];
            for (int j = FILAS - 1; j >= 0; j--) {
                columna[j] = matriz[j][i];
            }
            System.out.println(Arrays.toString(columna));
        }
    }

    public static void imprimirDiagonalMatriz(int[][] matriz) {
        int[] diagonal = new int[FILAS];
        for (int i = 0; i < FILAS; i++) {
            diagonal[i] = matriz[i][i];
        }
        System.out.println(Arrays.toString(diagonal));
    }
}
