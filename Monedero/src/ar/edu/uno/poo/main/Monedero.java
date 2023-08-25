package ar.edu.uno.poo.main;

public class Monedero {

	private Double cantDinero;

	public Monedero(Double cantDinero) {
		this.cantDinero = cantDinero;
	}

	public Double ingresarDinero(Double nuevoIngreso) {
		if (nuevoIngreso > 0) {
			this.cantDinero += nuevoIngreso;
		}
		else {
			System.out.println("El nuevo ingreso debe ser mayor a $0.");
		}
		return this.cantDinero;
	} 

	public Double extraerDinero(Double extraccion) {
		if (extraccion > 0) {
			if (extraccion < this.cantDinero) {
				this.cantDinero -= extraccion;
			} else {
				System.out.println("El monto a extraer supera el disponible.");
			}
		} else {
			System.out.println("La extracción debe ser mayor a $0.");
		}
		return this.cantDinero;
	}

	public Double getSaldoDisponible() {
		return this.cantDinero;
	}

	public static void main(String[] args) {
		Monedero monedero = new Monedero(50000.00);
		monedero.ingresarDinero(70000.00);
		monedero.extraerDinero(60000.0);
		System.out.println(monedero.getSaldoDisponible());
	}

}
