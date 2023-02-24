package pruebaJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestJUnit {
	
	
	@BeforeAll
	static void setup() {
	    System.out.println("@BeforeAll - executes once before all test methods in this class");
	}

	@BeforeEach
	void init() {
	    System.out.println("@BeforeEach - executes before each test method in this class");
	}

	
	@Test
	void testSingleSuccessTest() {
	   System.out.println("un Test");
	}

	@Test
	
	void testShowSomething() {
		System.out.println("Otro test");
		
		assertEquals(0, 0);
	}

}


