package _collectionsJavi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Parking {
	private String nombre;
	private int totalPlazas;
	private List<Coche> listaDeCoches;
	private Map<Marca, Integer> mapDeMarcasCoches;
	private Map<Color, Integer> mapDeColoresCoches;
	private Map<Coche, Integer> mapDeCoches;
	private Set<Coche> setDeCoches;
	private static Random random = new Random();

	public Parking(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas <= 0 ? 1 : totalPlazas > 10_000 ? 10_000 : totalPlazas;
		listaDeCoches = new ArrayList<>();
		mapDeMarcasCoches = new HashMap<>();
		mapDeColoresCoches = new HashMap<>();
		mapDeCoches = new HashMap<>();
		setDeCoches = new HashSet<>();
	}

	private boolean estaDentro(Coche coche) {
		for (Coche c : listaDeCoches) {
			if (c == coche)
				return true;
		}
		return false;
	}

	public boolean entraCoche(Coche coche) {
		if (totalPlazas > listaDeCoches.size() && !estaDentro(coche)) {
			listaDeCoches.add(coche);
			
			entraCocheActualizaMapsYSets(coche);
			return true;
		}
		return false;
	}

	private void entraCocheActualizaMapsYSets(Coche coche) {
		mapDeMarcasCoches.put(coche.getMarca(),
				mapDeMarcasCoches.containsKey(coche.getMarca()) ? mapDeMarcasCoches.get(coche.getMarca()) + 1 : 1);
		mapDeColoresCoches.put(coche.getColor(),
				mapDeColoresCoches.containsKey(coche.getColor()) ? mapDeColoresCoches.get(coche.getColor()) + 1 : 1);
		mapDeCoches.put(coche,
				mapDeCoches.containsKey(coche) ? mapDeCoches.get(coche) + 1 : 1);
		setDeCoches.add(coche);
	}

	private void sacaCocheActualizaMapsYSets(Coche coche) {
		if (mapDeMarcasCoches.get(coche.getMarca()) == 1) {
			mapDeMarcasCoches.remove(coche.getMarca());
		} else {
			mapDeMarcasCoches.put(coche.getMarca(), mapDeMarcasCoches.get(coche.getMarca()) - 1);
		}
		if (mapDeColoresCoches.get(coche.getColor()) == 1) {
			mapDeColoresCoches.remove(coche.getColor());
		} else {
			mapDeColoresCoches.put(coche.getColor(), mapDeColoresCoches.get(coche.getColor()) - 1);
		}
		if (mapDeCoches.get(coche) == 1) {
			mapDeCoches.remove(coche);
		} else {
			mapDeCoches.put(coche, mapDeCoches.get(coche) - 1);
		}
		
		if (listaDeCoches.contains(coche)) 
			setDeCoches.remove(coche);
	}

	public boolean saleCoche(Coche coche) {
		boolean estabaDentro = estaDentro(coche);
		if (estabaDentro) {
			listaDeCoches.remove(coche);
			sacaCocheActualizaMapsYSets(coche);
		}
		return estabaDentro;

	}

	public boolean saleCocheAleatrorio() {
		return listaDeCoches.isEmpty() ? false : saleCoche(listaDeCoches.get(random.nextInt(listaDeCoches.size())));
	}

	public boolean vaciaParking() {
		if (listaDeCoches.isEmpty())
			return false;

		for (int i = listaDeCoches.size() - 1; i >= 0; i--) {
			listaDeCoches.remove(i);
		}
		return true;
	}

	public void reportParking() {
		System.out.println("LISTADO COCHES");
		System.out.println("--------------");
		System.out.printf("Parking: %s%n", nombre);

		listaDeCoches.stream().forEach(System.out::println);

		System.out.printf("Total coches: %d, plazas libres: %d.%n", listaDeCoches.size(),
				totalPlazas - listaDeCoches.size());

	}

	public void reportMarcas() {
		System.out.println("REPORT DE MARCAS");
		System.out.println("----------------");
		System.out.printf("Parking: %s%n", nombre);

		mapDeMarcasCoches
				.forEach((k, v) -> System.out.printf("El coche de marca %s se repite %d veces.%n", k.getNombre(), v));

		System.out.printf("Total coches: %d. %n",
				mapDeMarcasCoches.values().stream().reduce((s, v) -> s + v).orElse(0));

	}

	public void reportColores() {
		System.out.println("REPORT DE COLORES");
		System.out.println("-----------------");
		System.out.printf("Parking: %s%n", nombre);

		mapDeColoresCoches
				.forEach((k, v) -> System.out.printf("El coche de color %s se repite %d veces.%n", 
						k.getNombre(), v));

		System.out.printf("Total coches: %d. %n",
				mapDeColoresCoches.values().stream().reduce((s, v) -> s + v).orElse(0));

	}
	
	public void reportSetCoches() {
		System.out.println("REPORT SET DE COCHES");
		System.out.println("------------------");
		System.out.printf("Parking: %s%n", nombre);

		setDeCoches
				.forEach(c -> System.out.println(c));

		System.out.printf("Total items: %d. %n",
			setDeCoches.size());

	}
	
	public void reportCochesIguales() {
		System.out.println("REPORT DE COCHES IGUALES");
		System.out.println("------------------------");
		System.out.printf("Parking: %s%n", nombre);

		mapDeCoches
				.forEach((k, v) -> System.out.printf("%s se repite %d vez.%n",
						k, v));

		System.out.printf("Total coches: %d. %n",
				mapDeCoches.values().stream().reduce((a, v) -> a + v).orElse(0));

	}

}