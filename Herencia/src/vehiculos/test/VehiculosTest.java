package vehiculos.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import vehiculos.main.Autobus;
import vehiculos.main.Motocicleta;
import vehiculos.main.Persona;
import vehiculos.main.Vehiculos;

public class VehiculosTest {
	@Test
	void crearMotoTest() {
		Persona alexis = new Persona();
		Motocicleta moto1 = new Motocicleta();

		assertEquals(0, moto1.getKmRecorridos());
		assertEquals(null, moto1.getChofer());

		moto1.asignarChofer(alexis);
		assertEquals(alexis, moto1.getChofer());
	}

//	@Test
//	void cambiarChoferSinAcompa�anteMotoTest() {
//		Persona alexis = new Persona();
//		Persona joel = new Persona();
//		Persona perro = new Persona();
//
//		Motocicleta moto1 = new Motocicleta(alexis);
//		moto1.agregarAcompa�ante(perro);
//		moto1.cambiarChofer(joel);
//
//		assertEquals(alexis, moto1.getChofer());
//		moto1.bajarAcompa�ante();
//		moto1.cambiarChofer(joel);
//		assertEquals(joel, moto1.getChofer());
//	}

	@Test
	void cambiarChoferConAcompa�anteMotoTest() {
		Persona alexis = new Persona();
		Persona joel = new Persona();
		Persona perro = new Persona();

		Vehiculos moto1 = new Motocicleta(alexis);
		Motocicleta otraMoto = (Motocicleta) moto1;
		otraMoto.agregarAcompa�ante(perro);

		moto1.cambiarChofer(joel);
		assertEquals(alexis, moto1.getChofer());
	}
	
	@Test
	void vechiculoTest() {
		Persona alexis = new Persona();
		Vehiculos moto1 = new Motocicleta();

		assertEquals(0, moto1.getKmRecorridos());
		assertEquals(null, moto1.getChofer());

		moto1.asignarChofer(alexis);
		assertEquals(alexis, moto1.getChofer());
	}
	
	
	
	@Test
	void cambiarChoferSinAcompa�anteAutoBusTest() {
		Persona alexis = new Persona();
		Persona joel = new Persona();
		Persona perro = new Persona();

		Autobus autobus = new Autobus(alexis,20);
		
		autobus.agregarPasajeros(perro);
		autobus.cambiarChofer(joel);

		assertEquals(alexis, autobus.getChofer());
		autobus.bajarPasajero();
		autobus.cambiarChofer(joel);
		assertEquals(joel, autobus.getChofer());

	}
	
}
