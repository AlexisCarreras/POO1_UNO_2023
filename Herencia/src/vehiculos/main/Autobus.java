package vehiculos.main;

public class Autobus extends Vehiculos {

	private Persona[] pasajeros;

	int cantPasajeros = 0;

	public Autobus(int cantidadAsientos) {
		super();
		this.pasajeros = new Persona[cantidadAsientos];
	}

	public Autobus(Persona chofer, int cantidadAsientos) {
		super(chofer);
		this.pasajeros = new Persona[cantidadAsientos];
	}

	public Autobus() {
	}

	public void agregarPasajeros(Persona p) {
		if (cantPasajeros < pasajeros.length) {
			pasajeros[cantPasajeros] = p;
			cantPasajeros++;
		}
	}

	public void bajarPasajero() {
		if (cantPasajeros > 0)
			cantPasajeros--;
	}

	@Override
	public void cambiarChofer(Persona newChofer) {
		if (this.cantPasajeros == 0)
			super.asignarChofer(newChofer);

	}

}
