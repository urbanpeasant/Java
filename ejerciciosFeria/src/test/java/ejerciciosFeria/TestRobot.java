package ejerciciosFeria;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestRobot {
	
	@Test
	void testRobot() throws CloneNotSupportedException {
		Robot r1 = new Robot (1,2,3);
		r1.getClase();
		r1.getModel();
		r1.getName();
		Robot r2 = (Robot) r1.clone();
		Robot r3 = new Robot (4,5,6);
		Robot r4 = r3;
		assertTrue(r1.equals(r2)); //Debe ser true
		assertTrue(r1.equals(r3)); //Debe ser false
		assertFalse(r1==r4); //Debe ser false
	}
			

}