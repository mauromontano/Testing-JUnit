package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.Acciones;

class AccionesTest {

	// Arrange
	Acciones acc = new Acciones();
	int pruebaEquals = 4;
	int pruebaTrue = 7;
	int pruebaFalse = 20;
	String word = "campana";
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Seteando las variables para comenzar los tests");
	}
	
	@Test
	void testEqualsPertenece() {
		boolean resultado= acc.pertenece(this.pruebaEquals);
		assertEquals(true,resultado);	
	}
	
	
	@Test
	void testTruePertenece() {
		boolean resultado= acc.pertenece(pruebaTrue);
		assertTrue(resultado);		
	}
	
	
	@Test
	void testFalsePertenece() {
		boolean resultado= acc.pertenece(pruebaFalse);
		assertFalse(resultado);		
	}
	
	@Test
	void testEqualsContarA() {
		int resultado= acc.contarA(word);
		assertEquals(3,resultado);	
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Finalizaron los tests");
	}


}
