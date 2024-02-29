package lanzamientos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Lanzamientos {

	// Rutas

	private static final String ARCHIVO_LANZAMIENTOS = "C:\\Users\\Usuario\\Desktop\\pruebaDatos\\lanzamientos.txt";
	private static final String ARCHIVO_HTML = "C:\\Users\\Usuario\\Desktop\\pruebaDatos\\lanzamientos.html";
	private static final String ARCHIVO_SQL = "C:\\Users\\Usuario\\Desktop\\pruebaDatos\\lanzamientos.sql";

	// Método pa' generar cartas y jokers

	private static String generarCarta(Random random) {
		String[] valores = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] palos = { "trebol", "picas", "diamante", "corazones" };
		String carta;

		if (random.nextBoolean()) {
			// Carta normal
			carta = valores[random.nextInt(valores.length)] + "|" + palos[random.nextInt(palos.length)];
		} else {
			// Comodín Joker
			carta = "Joker";
		}

		return carta;
	}

	
	//Métodos para filtrar las cartas
	
	private static boolean esValorImpar(String carta) {
		String valor = carta.split("\\|")[0];
		return valor.equals("A") || valor.equals("3") || valor.equals("5") || valor.equals("7") || valor.equals("9");
	}

	private static boolean esFiguraCarta(String carta) {
		String valor = carta.split("\\|")[0];
		return valor.equals("J") || valor.equals("Q") || valor.equals("K");
	}

	private static boolean filtrarDescartes(int dado1, int dado2, String moneda, String carta) {
		boolean condicion1 = (dado1 % 2 != 0 && moneda.equals("cruz") && carta.endsWith("trebol")
				&& esValorImpar(carta));
		boolean condicion2 = (dado1 + dado2 == 7 && moneda.equals("cara") && esFiguraCarta(carta));
		return condicion1 || condicion2;
	}

	
	//Generr archivo de texto
	
	private static void generarLanzamientos() throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_LANZAMIENTOS))) {
			Random random = new Random();

			for (int i = 0; i < 10_000; i++) {
				String carta = generarCarta(random);
				int dado1 = random.nextInt(6) + 1;
				int dado2 = random.nextInt(6) + 1;
				String moneda = (random.nextBoolean()) ? "cara" : "cruz";

				if (filtrarDescartes(dado1, dado2, moneda, carta)
						|| filtrarDescartes(dado1 + dado2, dado2, "cara", carta)) {
					i--;
					continue;
				}

				String lanzamiento = carta + "|" + dado1 + "|" + dado2 + "|" + moneda;
				writer.write(lanzamiento);
				writer.newLine();
			}
		}
	}


	private static void procesarLanzamientos() throws IOException {
	    try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_LANZAMIENTOS));
	            BufferedWriter htmlWriter = new BufferedWriter(new FileWriter(ARCHIVO_HTML));
	            BufferedWriter sqlWriter = new BufferedWriter(new FileWriter(ARCHIVO_SQL))) {

	        htmlWriter.write("<html><body><table border=\"1\"><tr><th>Carta</th><th>Palo</th><th>Dado1</th><th>Dado2</th><th>Moneda</th></tr>");

	        sqlWriter.write("INSERT INTO lanzamientos (carta, palo, dado1, dado2, moneda) VALUES ");

	        String linea;
	        int contador = 0;

	        while ((linea = reader.readLine()) != null) {
	            String[] partes = linea.split("\\|");

	            htmlWriter.write("<tr><td>" + (partes[0].equals("Joker") ? "Joker" : partes[1]) + "</td><td>"
	                    + (partes[0].equals("Joker") ? "Joker" : partes[2]) + "</td><td>" + partes[3]
	                    + "</td><td>" + partes[4] + "</td><td>" + (partes.length > 5 ? partes[5] : "") + "</td></tr>");

	            if (contador > 0) {
	                sqlWriter.write(", ");
	            }

	            // Se inserta toda la información, incluyendo "Joker" en caso de ser un Joker
	            sqlWriter.write(
	                    "('" + (partes[0].equals("Joker") ? "Joker" : partes[1]) + "', '" + (partes[0].equals("Joker") ? "Joker" : partes[2]) + "', "
	                            + partes[3] + ", " + partes[4] + ", " + (partes.length > 5 ? "'" + partes[5] + "'" : "NULL") + ")");

	            contador++;
	        }

	        htmlWriter.write("</table></body></html>");

	        sqlWriter.write(";");
	    }
	}

	// ...

	// ...


	// ...


	// ...


	// ...

	// ...


	//Main para ejecutar
	
	public static void main(String[] args) {
		try {
			generarLanzamientos();
			System.out.println("Archivo txt generado correctamente.");

			procesarLanzamientos();
			System.out.println("Archivos html y sql generados correctamente.");
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
