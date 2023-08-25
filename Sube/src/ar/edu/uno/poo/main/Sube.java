package ar.edu.uno.poo.main;

public class Sube {

	private int saldoDisponible;

	private int subte;
	private int preMetro;

	public Sube(int saldoDisponible, int subte, int preMetro) {
		this.saldoDisponible = saldoDisponible;
		this.subte = subte;
		this.preMetro = preMetro;
	}

	public int viajeEnSubte() {
		if (this.saldoDisponible > this.subte) {
			this.saldoDisponible -= this.subte;
		} else {
			System.out.println("Saldo insuficiente.");
		}
		return saldoDisponible;
	}

	public int viajeEnPreMetro() {
		if (saldoDisponible > this.preMetro) {
			this.saldoDisponible -= this.preMetro;
		} else {
			System.out.println("Saldo insuficiente.");
		}

		return saldoDisponible;
	}

	public static void main(String[] args) {
		Sube sube = new Sube(500, 74, 26);
		System.out.println(sube.viajeEnSubte());
		System.out.println(sube.viajeEnPreMetro());
	}

}
