package ar.edu.uno.poo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.uno.poo.main.Monedero;

public class MonederoTest {

	@Test
	public void verificarIngreso() {
		Monedero monedero = new Monedero(25000.0);

		assertEquals(125000.0, monedero.ingresarDinero(100000.0));
	}
	
	@Test
	public void verificarExtraccion() {
		Monedero monedero = new Monedero(50000.0);
		
		assertEquals(40000.0, monedero.extraerDinero(10000.0));
	}

}
