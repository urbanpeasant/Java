package complejosYheredados;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class TestPersonasyEmpleados {
	@Test
    public void testConstructor() {
        Persona p = new Persona("Manuel", "Molina", 1990, "Moli");
        assertNotNull(p);
        assertEquals("Manuel", p.getNombre());
        assertEquals("Molina", p.getApellidos());
        assertEquals(1990, p.getAnyoNacimiento());
        assertEquals("Moli", p.getApodo());
    }

    @Test
    public void testCopyConstructor() {
        Persona p1 = new Persona("Manuel", "Molina", 1990, "Moli");
        Persona p2 = new Persona(p1);
        assertNotNull(p2);
        assertEquals(p1.getNombre(), p2.getNombre());
        assertEquals(p1.getApellidos(), p2.getApellidos());
        assertEquals(p1.getAnyoNacimiento(), p2.getAnyoNacimiento());
        assertEquals(p1.getApodo(), p2.getApodo());
    }

    @Test
    public void testSetters() {
        Persona p = new Persona("Manuel", "Molina", 1990, "Moli");
        p.setNombre("Carlos");
        assertEquals("Carlos", p.getNombre());
        p.setApellidos("García");
        assertEquals("García", p.getApellidos());
        p.setAnyoNacimiento(1991);
        assertEquals(1991, p.getAnyoNacimiento());
        p.setApodo("Cabeza");
        assertEquals("Cabeza", p.getApodo());
    }

    @Test
    public void testEquals() {
        Persona p1 = new Persona("Manuel", "Molina", 1990, "Moli");
        Persona p2 = new Persona("Manuel", "Molina", 1990, "Moli");
        Persona p3 = new Persona("Carlos", "García", 1991, "Cabeza");
        assertTrue(p1.equals(p2));
        assertFalse(p1.equals(p3));
    }

    @Test
    public void testClone() {
        Persona p1 = new Persona("Manuel", "Molina", 1990, "Moli");
        try {
            Persona p2 = (Persona) p1.clone();
            assertNotNull(p2);
            assertEquals(p1.getNombre(), p2.getNombre());
            assertEquals(p1.getApellidos(), p2.getApellidos());
            assertEquals(p1.getAnyoNacimiento(), p2.getAnyoNacimiento());
            assertEquals(p1.getApodo(), p2.getApodo());
            assertFalse(p1 == p2); 
        } catch (CloneNotSupportedException e) {
            fail("Clone not supported");
        }
    }

    @Test
    public void testToString() {
        Persona p = new Persona("Manuel", "Molina", 1990, "Moli");
        String expectedString = "La persona se llama Manuel, con apellido Molina, nacido en 1990 y conocido como Moli";
        assertEquals(expectedString, p.toString());
    }
    
    
    
}


