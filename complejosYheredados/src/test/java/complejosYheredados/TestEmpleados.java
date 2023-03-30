package complejosYheredados;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestEmpleados {


	private Persona persona1;
	private Persona persona2;
	private Empleado empleado1;
	private Empleado empleado2;
	private Empleado empleado3;
	
	@BeforeAll
	public void setUp() throws Exception {
		persona1 = new Persona("Manuel", "Molina", 1990, "Moli");
		persona2 = new Persona("Carlos", "García", 1991, "Cabeza");
		empleado1 = new Empleado(1, "Ventas", persona1);
		empleado2 = new Empleado(2, "Marketing", persona1);
		empleado3 = new Empleado(3, "Recursos Humanos", persona2);
	}

	@Test
	public void testGetIdEmpleado() {
		assertEquals(1, empleado1.getIdEmpleado());
	}

	@Test
	public void testGetDepartamento() {
		assertEquals("Ventas", empleado1.getDepartamento());
	}

	@Test
	public void testGetPersona() {
		assertEquals(persona1, empleado1.getPersona());
	}

	@Test
	public void testSetIdEmpleado() {
		empleado1.setIdEmpleado(4);
		assertEquals(4, empleado1.getIdEmpleado());
	}

	@Test
	public void testSetDepartamento() {
		empleado1.setDepartamento("Marketing");
		assertEquals("Marketing", empleado1.getDepartamento());
	}

	@Test
	public void testSetPersona() {
		empleado1.setPersona(persona2);
		assertEquals(persona2, empleado1.getPersona());
	}

	@Test
	public void testToString() {
		String expected = "El empleado con ID 1, trabaja para el departamento Ventas.\n"
				+ "La persona se llama Manuel, con apellido Molina, nacido en 1990 y conocido como Moli";
		assertEquals(expected, empleado1.toString());
	}

	@Test
	public void testClone() throws CloneNotSupportedException {
		Empleado cloned = (Empleado) empleado1.clone();
		assertEquals(empleado1, cloned);
		assertNotSame(empleado1, cloned);
	}

	@Test
	public void testEqualsObject() {
		assertTrue(empleado1.equals(empleado2));
		assertFalse(empleado1.equals(empleado3));
	}
}


