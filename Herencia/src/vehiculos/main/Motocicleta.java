package vehiculos.main;

public class Motocicleta extends Vehiculos {
	private Persona acompa�ante;

	public Motocicleta(Persona chofer) {
		super(chofer);
	}

	public Motocicleta() {

	}

	public void agregarAcompa�ante(Persona acompa�ante) {
		if (this.acompa�ante == null)
			this.acompa�ante = acompa�ante;
	}
	
	public void bajarAcompa�ante() {
		this.acompa�ante = null;
	}

	@Override 
	public void cambiarChofer(Persona newChofer) {
		if (this.acompa�ante == null)
			super.asignarChofer(newChofer);
	}

}
