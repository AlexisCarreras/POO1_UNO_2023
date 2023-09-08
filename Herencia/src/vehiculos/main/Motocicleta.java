package vehiculos.main;

public class Motocicleta extends Vehiculos {
	private Persona acompañante;

	public Motocicleta(Persona chofer) {
		super(chofer);
	}

	public Motocicleta() {

	}

	public void agregarAcompañante(Persona acompañante) {
		if (this.acompañante == null)
			this.acompañante = acompañante;
	}
	
	public void bajarAcompañante() {
		this.acompañante = null;
	}

	@Override 
	public void cambiarChofer(Persona newChofer) {
		if (this.acompañante == null)
			super.asignarChofer(newChofer);
	}

}
