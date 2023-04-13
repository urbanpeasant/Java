package testElectrodomestico;

import static org.junit.Assert.assertEquals;

import herenciaRepaso.Electrodomestico;
import herenciaRepaso.Frigorifico;

public class TestElectrodomestico {

	
	@org.junit.Test
		public void testCrearElectrodomestico() {
		Electrodomestico dispositivo1 = new Electrodomestico("fagor","V9", 100);
		assertEquals("fagor", dispositivo1.getMarca());
		assertEquals("v9", dispositivo1.getModelo());
		assertEquals(100, dispositivo1.getConsumo());
		
		Electrodomestico dispositivo2 = new Electrodomestico("hacendado","savagecapitalism", 750);
		assertEquals("hacendado", dispositivo2.getMarca());
		assertEquals("savagecapitalism", dispositivo2.getModelo());
		assertEquals(750, dispositivo2.getConsumo());
	}
	
	@org.junit.Test
		public void testCrearFrigorifico() {
		Frigorifico dispositivo1 = new Frigorifico("frigo1","modeloa", 120, 300);
		assertEquals("frigo1", dispositivo1.getMarca());
		assertEquals("modeloa", dispositivo1.getModelo());
		assertEquals(120, dispositivo1.getConsumo());
		assertEquals(300, dispositivo1.getTemperatura());
		
		Frigorifico dispositivo2 = new Frigorifico("frigo2","modelo2", 10, 30);
		assertEquals("frigo2", dispositivo2.getMarca());
		assertEquals("modelo2", dispositivo2.getModelo());
		assertEquals(10, dispositivo2.getConsumo());
		assertEquals(30, dispositivo2.getTemperatura());
	}
	
}
