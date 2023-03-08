package excepcionesGenericasYAleatorias;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testPruebaEdadPersonas {
	PruebaEdadPersonas persona;
	
	
	@BeforeEach // con beforeEach aseguramos que antes de cada test se ejecute este método
	
	public void generaPersona() {
		persona = new PruebaEdadPersonas();
	}
	
	@Test //con este test lanzamos excepciones específicas, le pasamos cada una de las excepciones creadas y lanzará la correcta según la edad de la persona.
	
	public void TestEspecifico() {
		for (int i = 0; i<100; i++) {
			int num = (int)(Math.random()*101+0);
			try {
				persona.generaExcepcionEdad(num);
			} catch (InfantilException e) {
				System.out.println("La edad es: " + num + ", " + e.getMessage());
			} catch (AdultoException e) {
				System.out.println("La edad es: " + num + ", " + e.getMessage());
			} catch (MayorException e) {
				System.out.println("La edad es: " + num + ", " + e.getMessage());
			}
		}
	}
	
	@Test // con este test lanzamos una excepción genérica.
	
	public void TestGenerico() {
		for (int i = 0; i<100; i++) {
			int num = (int)(Math.random()*101+0);
			try {
				persona.generaExcepcionEdad(num);
			} catch (Exception e) {
				System.out.println("La edad es  " + num + " Excepción capturada: " + e.getMessage());
			}
		}
	}
}
