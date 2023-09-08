package vehiculos.main;

public abstract class Vehiculos {
	private int kmRecorridos = 0;
	private Persona chofer;

	public Vehiculos(Persona chofer) {
		this.chofer = chofer;
	}

	public Vehiculos() {
	}

	public int getKmRecorridos() {
		return kmRecorridos;
	}
	
	public Persona getChofer() {
		return chofer;
	}

	public void asignarChofer(Persona chofer) {
		if (this.chofer == null)
			this.chofer = chofer;
	}

	public abstract void cambiarChofer(Persona newChofer);
}
