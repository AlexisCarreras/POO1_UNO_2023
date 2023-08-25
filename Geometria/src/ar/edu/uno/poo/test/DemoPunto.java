package ar.edu.uno.poo.test;

import ar.edu.uno.poo.main.ColoresSemaforo;
import ar.edu.uno.poo.main.Punto;

public class DemoPunto {

	public static void main(String[] args) {
		Punto p = new Punto();
		Punto p2 = new Punto(3);
		Punto p3 = new Punto(4, 5);
		Punto p0 = new Punto(0);
		Punto p4 = new Punto(3, 4);
		
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		System.out.println(p.toString());
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println(Punto.getCant());
		System.out.println(Punto.PUNTO_AL_ORIGEN);
		
		System.out.println(p0.distanciaEntreDosPuntos(p4));
		
//		LLAMAR ENUM
		ColoresSemaforo colorSefamoro = ColoresSemaforo.AMARILLO;
		System.out.println(colorSefamoro);
	}

}
