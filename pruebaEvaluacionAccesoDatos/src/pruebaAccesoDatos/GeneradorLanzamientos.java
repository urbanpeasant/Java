/*Imagina que alguien ha leído a Robert C. Margin y ha decidido que odia los principios del Clean Code. Creo que su programa se parecería a esto.
 * 
 * BIENVENIDO AL AUTÉNTICO CÓDIGO ESPAGUETI! :D
*
*/
package pruebaAccesoDatos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneradorLanzamientos {

	private static final String ARCHIVO_LANZAMIENTOS = "C:\\Users\\Usuario\\Desktop\\pruebaDatos\\lanzamientos.txt";
	private static final String ARCHIVO_HTML = "C:\\Users\\Usuario\\Desktop\\pruebaDatos\\lanzamientos.html";
	private static final String ARCHIVO_SQL = "C:\\Users\\Usuario\\Desktop\\pruebaDatos\\lanzamientos.sql";
	private static final int CANTIDAD_LANZAMIENTOS = 10000;
	private static final Random random = new Random();

	public static void main(String[] args) {

		generarLanzamientos(ARCHIVO_LANZAMIENTOS, CANTIDAD_LANZAMIENTOS);
		System.out.println("Archivo txt creado correctamente.");
		List<String> lanzamientosPicasCorazones = leerUltimosLanzamientos(ARCHIVO_LANZAMIENTOS, 200);
		generarHTML(ARCHIVO_HTML, lanzamientosPicasCorazones);
		generarSQL(ARCHIVO_SQL, lanzamientosPicasCorazones);
		System.out.println("Archivos sql y html creados correctamente");
	}

	private static boolean esValorImpar(String valor) {
	    return valor.equals("A") || valor.equals("3") || valor.equals("5") || valor.equals("7") || valor.equals("9")
	            || valor.equals("J");
	}

	private static boolean esFigura(Carta carta) {
	    return carta.getValor().equals("J") || carta.getValor().equals("Q") || carta.getValor().equals("K");
	}
	
	private static boolean verificarCondicionesDescarte(int dado1, int dado2, boolean cara, Carta carta) {
	    return (dado1 % 2 != 0 && !cara && (carta.getPalo().equals("Treboles") && esValorImpar(carta.getValor())))
	            || (dado1 + dado2 == 7 && cara && esFigura(carta));
	}
	
	public static void generarLanzamientos(String ruta, int cantidadLanzamientos) {
	    try (BufferedWriter escribe = new BufferedWriter(new FileWriter(ruta))) {
	        Random random = new Random();  

	        for (int i = 0; i < cantidadLanzamientos; i++) {
	            
	            Carta carta = Carta.generaCartaAleatoria();
	            int dado1 = generarNumeroAleatorio(1, 6);
	            int dado2 = generarNumeroAleatorio(1, 6);
	            boolean cara = random.nextBoolean();

	            
	            if (verificarCondicionesDescarte(dado1, dado2, cara, carta)) {
	                i--;  
	                continue;
	            }

	            
	            String lanzamiento = String.format("%s|%s|%d|%d|%s", carta.getPalo(), carta.getValor(), dado1, dado2,
	                    cara ? "cara" : "cruz");
	            escribe.write(lanzamiento);
	            escribe.newLine();
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	

	public static List<String> leerUltimosLanzamientos(String ruta, int cantidadLanzamientos) {
		List<String> ultimosLanzamientos = new ArrayList<>();
		try (BufferedReader lee = new BufferedReader(new FileReader(ruta))) {
			String linea;
			while ((linea = lee.readLine()) != null) {
				ultimosLanzamientos.add(linea);
				if (ultimosLanzamientos.size() > cantidadLanzamientos) {
					ultimosLanzamientos.remove(0);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ultimosLanzamientos;
	}

	private static void generarHTML(String ruta, List<String> lanzamientos) {
		try (BufferedWriter escribeHTML = new BufferedWriter(new FileWriter(ruta))) {
			escribeHTML.write("<html><head><title>Lanzamientos</title></head><body>");
			escribeHTML.write(
					"<table border='1'><tr><th>Palo</th><th>Valor</th><th>Dado 1</th><th>Dado 2</th><th>Moneda</th></tr>");

			for (String lanzamiento : lanzamientos) {
				String[] partes = lanzamiento.split("\\|");

				if (partes[0].equals("Picas") || partes[0].equals("Corazones")) {
					escribeHTML.write("<tr>");
					for (int i = 0; i < partes.length; i++) {
						escribeHTML.write("<td>" + partes[i] + "</td>");
					}
					escribeHTML.write("</tr>");
				}
			}

			escribeHTML.write("</table></body></html>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void generarSQL(String ruta, List<String> lanzamientos) {
		try (BufferedWriter escribeSQL = new BufferedWriter(new FileWriter(ruta))) {
			escribeSQL.write("INSERT INTO lanzamientos (palo, valor, dado1, dado2, moneda) VALUES");

			int ultimoIndice = lanzamientos.size() - 1;
			for (int i = 0; i < ultimoIndice; i++) {
				String lanzamiento = lanzamientos.get(i);
				String[] partes = lanzamiento.split("\\|");

				if (partes[0].equals("Picas") || partes[0].equals("Corazones")) {
					escribeSQL.write(String.format("('%s', '%s', %s, %s, '%s'),", partes[0], partes[1], partes[2],
							partes[3], partes[4]));
				}
			}

			if (ultimoIndice >= 0) {
				String lanzamiento = lanzamientos.get(ultimoIndice);
				String[] partes = lanzamiento.split("\\|");

				if (partes[0].equals("Picas") || partes[0].equals("Corazones")) {
					escribeSQL.write(String.format("('%s', '%s', %s, %s, '%s');", partes[0], partes[1], partes[2],
							partes[3], partes[4]));
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int generarNumeroAleatorio(int min, int max) {
		return random.nextInt(max - min + 1) + min; 
	}
}
