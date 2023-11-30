package pruebaPrimerTrimestre;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ClaseTest{

    public static void main(String[] args) {
        try {
            generarLanzamientos("lanzamientos.txt", 10000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generarLanzamientos(String archivo, int cantidad) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            Random random = new Random();

            for (int i = 0; i < cantidad; i++) {
                String carta = generarCarta(random);
                int dado1 = random.nextInt(6) + 1;
                int dado2 = random.nextInt(6) + 1;
                String moneda = random.nextBoolean() ? "cara" : "cruz";

                // Descartar combinaciones según las condiciones dadas
                if (!(dado1 % 2 != 0 || (moneda.equals("cruz") && (carta.startsWith("T") || carta.startsWith("3") || carta.startsWith("5") || carta.startsWith("7"))))
                        && !(dado1 + dado2 == 7 && moneda.equals("cara") && (carta.equals("J") || carta.equals("Q") || carta.equals("K")))) {
                    // Escribir la combinación en el archivo
                    writer.write(carta + "|" + dado1 + "|" + dado2 + "|" + moneda);
                    writer.newLine();
                }
            }
        }
    }

    private static String generarCarta(Random random) {
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] palos = {"trebol", "picas", "diamante", "corazones"};

        // Elegir un valor y un palo al azar
        String valor = valores[random.nextInt(valores.length)];
        String palo = palos[random.nextInt(palos.length)];

        // En caso de que sea un comodín, asignar "Joker" como valor y palo
        if (valor.equals("J") && palo.equals("corazones")) {
            return "Joker";
        }

        // Devolver la combinación de valor y palo
        return valor + "|" + palo;
    }
}
