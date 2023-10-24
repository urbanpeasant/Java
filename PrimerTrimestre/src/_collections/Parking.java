package _collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Parking {

	// Propiedades

	private String nombre;
	private int totalPlazas;
	private List<Coche> coches;
	private Map<Color, Integer> mapaColor;
	private Map<Marca, Integer> mapaMarca;
	private Map<Coche, Integer> mapaCochesIguales;
	private Set<Coche> setCoches;

	// Constructor Pensar con lista de coches.

	public Parking(int totalPlazas, String nombre, List<Coche> coches) {
		this.totalPlazas = totalPlazas;
		this.nombre = nombre;
		this.coches = new ArrayList<>();
		this.mapaColor = new HashMap<>();
		this.mapaMarca = new HashMap<>();
		this.mapaCochesIguales = new HashMap<>();
		this.setCoches = new HashSet<>();
		for (Coche c : coches) {
			entraCoche(c);
		}

	}

	//Métodos
	
	
	//Hago métodos para añadir coche y controlar marca y color, para luego llamarlos desde otros métodos.
	private void controlaCoches(Coche c, int cantidad) {
		if (!mapaCochesIguales.containsKey(c)) {
			mapaCochesIguales.put(c, 0);
		}

		mapaCochesIguales.put(c, (mapaCochesIguales.get(c) + 1));

		if (mapaCochesIguales.get(c) == 0)
			mapaCochesIguales.remove(c);

	}

	private void controlaMarca(Coche c, int cantidad) {
		Marca marca = c.getMarca();
		if (!mapaMarca.containsKey(marca)) {
			mapaMarca.put(marca, 0);
		}
		mapaMarca.put(marca, mapaMarca.get(marca) + cantidad);
	}

	private void controlaColor(Coche c, int cantidad) {
		Color color = c.getColor();
		if (!mapaColor.containsKey(color)) {
			mapaColor.put(color, 0);
		}
		mapaColor.put(color, mapaColor.get(color) + cantidad);
	}

	// Método entracoche. Mete un coche en el parking si hay hueco y si no está ya
	// dentro, claro.
	public boolean entraCoche(Coche c) {
		if (coches.size() >= totalPlazas || coches.stream().anyMatch(coche -> coche == c)) {
			return false;
		}
		coches.add(c);

		controlaColor(c, 1);
		controlaMarca(c, 1);
		controlaCoches(c, 1);

		setCoches.add(c);

		return true;
	}

//Método salecoche. Sacamos un coche si está previamente dentro.
	public boolean saleCoche(Coche c) {
		if (!coches.contains(c) || coches.isEmpty()) { // Duda: Nunca llegaría al lado derecho del or puesto que si está
														// vacío nunca contendría C, no, Javi?

			return false;
		}
		coches.remove(c);
		controlaColor(c, -1);
		controlaMarca(c, -1);
		controlaCoches(c, -1);
		setCoches.remove(c);

		return true;

	}

	// Saca un coche random del parking

	public boolean saleCocheAleatorio() {
		if (coches.isEmpty()) {
			return false;
		}
		Random random = new Random();
		int i = random.nextInt(coches.size());
		Coche c = coches.remove(i);
		controlaColor(c, -1);
		controlaMarca(c, -1);
		controlaCoches(c, -1);
		setCoches.remove(c);
		return true;
	}

	// Vacía el parking entero.
	public boolean vaciaParking() {
		if (coches.isEmpty()) {
			return false;
		}
		for (Coche c : coches) {
			controlaColor(c, -1);
			controlaMarca(c, -1);
			controlaCoches(c, -1);
		}
		coches.clear();
		setCoches.clear();
		return true;
	}

	// Report parking
	public void reportParking() {
		System.out.println("LISTADO COCHES");
		System.out.println("--------------");
		System.out.println("Parking: " + nombre);
		for (Coche coche : coches) {
			System.out.println("  Coche: " + coche);
		}
		int plazasLibres = totalPlazas - coches.size();
		System.out.println("Total coches: " + coches.size() + ", plazas libres: " + plazasLibres);
	}

	// Report por colores
	public void reportColores() {
		System.out.println("REPORT DE COLORES");
		System.out.println("-----------------");
		System.out.println("Parking: " + nombre);
		for (Color color : Color.values()) {
			if (mapaColor.containsKey(color)) {
				Integer cuentaColores = mapaColor.get(color);
				if (cuentaColores != null) {
					String nombreColor = color.getNombreCompleto();
					String veces = cuentaColores == 1 ? "vez" : "veces";
					System.out.println(
							"El coche de color " + nombreColor + " se repite " + cuentaColores + " " + veces + ".");
				}
			}
		}
		System.out.println("Total coches: " + coches.size());
	}

	// Report por marcass

	public void reportMarcas() {
		System.out.println("REPORT DE MARCAS");
		System.out.println("-----------------");
		System.out.println("Parking: " + nombre);
		for (Marca marca : Marca.values()) {
			if (mapaMarca.containsKey(marca)) {
				Integer cuentaMarcas = mapaMarca.get(marca);
				if (cuentaMarcas != null) {
					String nombreMarca = marca.getNombreCompleto();
					String veces = cuentaMarcas == 1 ? "vez" : "veces";
					System.out.println(
							"El coche de marca " + nombreMarca + " se repite " + cuentaMarcas + " " + veces + ".");
				}
			}
		}
		System.out.println("Total coches: " + coches.size());
	}

	// report cochesiguales
	public void reportCochesIguales() {
		System.out.println("REPORT DE COCHES IGUALES");
		System.out.println("------------------------");
		System.out.println("Parking: " + nombre);

		for (var entry : mapaCochesIguales.entrySet()) {

			Coche coche = entry.getKey();
			int cuentaCoches = entry.getValue();
			String veces = cuentaCoches == 1 ? "vez" : "veces";
			System.out.println("Coche: " + coche + " se repite " + cuentaCoches + " " + veces + ".");

//			}
		}

		System.out.println("Total coches: " + coches.size());
	}

//report setdeCoches
	public void reportSetCoches() {

		System.out.println("REPORT SET DE COCHES");
		System.out.println("--------------------");
		System.out.println("Parking: " + nombre);

		for (Coche coche : setCoches) {
			System.out.println("Coche: " + coche);
		}
		System.out.println("Total items: " + setCoches.size());
	}

//main para probar
	public static void main(String[] args) {

		// Creación de coches
		List<Coche> coches = new ArrayList<>();
		coches.add(new Coche(Marca.VW, Color.AM));
		coches.add(new Coche(Marca.TO, Color.RO));
		coches.add(new Coche(Marca.BM, Color.AZ));
		coches.add(new Coche(Marca.BM, Color.AZ));
		coches.add(new Coche(Marca.AU, Color.RO));
		coches.add(new Coche(Marca.TO, Color.AM));
		coches.add(new Coche(Marca.BM, Color.IN));
		coches.add(new Coche(Marca.TO, Color.NA));
		coches.add(new Coche(Marca.AU, Color.IN));
		coches.add(new Coche(Marca.BM, Color.AM));
		Parking parking = new Parking(10, "Mi primer parking", coches);

		// Reporte del estado actual del parking
		parking.reportParking();
		System.out.println();
		// Prueba de métodos de salida de coches
		//parking.saleCoche(new Coche(Marca.VW, Color.AM));
		//parking.saleCocheAleatorio();

		// Reporte del estado actual del parking después de las salidas
		parking.reportParking();
		System.out.println();
		// Reporte del número de coches de cada color
		parking.reportColores();
		System.out.println();
		// Reporte del número de coches de cada marca
		parking.reportMarcas();
		System.out.println();
		// Reporte de coches iguales
		parking.reportCochesIguales();
		System.out.println();
		// Reporte del conjunto de coches
		parking.reportSetCoches();
	}

}