package ar.edu.uno.poo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.uno.poo.main.Cuadrante;
import ar.edu.uno.poo.main.Punto;

public class PuntoTest {

	@Test
	public void verificarDistanciaEntrePuntos() {
		Punto p0 = new Punto(0);
		Punto p4 = new Punto(3, 4);

		assertEquals(5.0, p0.distanciaEntreDosPuntos(p4));
	}

	@Test
	public void verificarCoordenadas() {
		Punto p = new Punto(0);

		assertEquals(0, p.getX());
		assertEquals(0, p.getY());
	}
	
	@Test
	public void verificarCuadrantePunto() {
		Punto p4 = new Punto(3, 4);
		
		assertEquals(Cuadrante.I, p4.getCuadrante());
	}

}
