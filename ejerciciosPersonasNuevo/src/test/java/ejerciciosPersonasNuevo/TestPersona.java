package ejerciciosPersonasNuevo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPersona {
	
	@Test
	
	void metodoTesting() {
	
		Direccion d1 = new Direccion ("Bidasoa", 24, 41010);
	
		// crear una persona p1 llamada pepe de 21 años
		
				Persona p1 = new Persona ("Pepe", 21, d1 );
				// crear una persona p2 llamada jose de 21 años
				
				Persona p2 = new Persona ("Jose", 21, d1);
				// crear otra persona p3 pepe de 21 años
				
				Persona p3 = new Persona ("Pepe", 21, d1);
			
			// crear una persona p4 = p1
			
			Persona p4 = p1;
			
			// crear una persona p5 con constructor copia
			
			Persona p5 = new Persona(p1);
			
			
			//clonamos p1 en p6
			
			try {
				Persona p6=(Persona) p1.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// p1 == p2? false
			
			
			
			// p1 == p3? false
			
			// p1 == p4? true
			
			// p2 == p4? false
			
			// p1 == p5? false
			
			// p1.equals(p1)? true
			
			assertTrue("deberia ser false!", p1.equals(p1));
			
			//p1.equals(p2)? false
			
			assertFalse("deberia ser false!", p1.equals(p2));
			
			
			//p1.equals(p3)? true
			
			assertTrue("deberia ser false!", p1.equals(p3));
			
			//p1.equals(p4)? true
			
			assertTrue("deberia ser false!", p1.equals(p4));
			
			//p2.equals(p4)? false
			
			assertFalse("deberia ser false!", p2.equals(p4));
			
			//p3.equals(p4) true
			
			assertTrue("deberia ser false!", p3.equals(p4));
			
			//p1.equals(p5) true
			
			assertTrue("deberia ser false!", p1.equals(p5));
	}

}
