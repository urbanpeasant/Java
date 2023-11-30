package _collectionsJavi;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		Parking p1 = new Parking("P-1", 20);
		
		
		for (int i = 0; i < 20; i++) {
			p1.entraCoche(new Coche());			
		}
		
		p1.reportParking();
		
		p1.reportMarcas();
		
		p1.reportCochesIguales();
		
		p1.reportSetCoches();
		

		
		List<Coche> coches = new ArrayList<>();
		for (int i = 0; i <1_000_000; i++) {
			coches.add(new Coche());
		}
		
		long vwRojo = coches.stream().filter(coche -> coche.getMarca()==Marca.VW && coche.getColor()==Color.RO).count();
		
		System.out.println("Hay " + vwRojo + " volkswagen rojos en el parking");
		
	}
}

