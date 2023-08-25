package ar.edu.uno.poo.main;

public class ParImpar {
	public static void parImpar(int num) {
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("Par");
			} else {
				System.out.println("Impar");
			}
		} else {
			System.out.println("El número ingresado debe ser mayor a 0.");
		}
	}

	public static void main(String[] args) {
		parImpar(4);
	}
}
