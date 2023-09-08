package vehiculos.main;

public class Motocicleta extends Vehiculos {
	private Persona acompaņante;

	public Motocicleta(Persona chofer) {
		super(chofer);
	}

	public Motocicleta() {

	}

	public void agregarAcompaņante(Persona acompaņante) {
		if (this.acompaņante == null)
			this.acompaņante = acompaņante;
	}
	
	public void bajarAcompaņante() {
		this.acompaņante = null;
	}

	@Override 
	public void cambiarChofer(Persona newChofer) {
		if (this.acompaņante == null)
			super.asignarChofer(newChofer);
	}

}
