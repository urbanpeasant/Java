package testMonedas;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cambioMonedas.Dolar;
import cambioMonedas.Euro;

public class TestCambioMoneda {
	
	Dolar d = new Dolar(1);
	Euro e = new Euro(1);
	
	@Test
	public void test() {
		assertTrue(d.equals(e));
		assertEquals(d.multiplicarPor(7),3);
		assertEquals(e.multiplicarPor(12),5);
	}
	
	
	
}
