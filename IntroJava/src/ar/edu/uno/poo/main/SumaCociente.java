package ar.edu.uno.poo.main;

public class SumaCociente {
	public static void sumaYCociente(int num1, int num2) {
		int suma = num1 + num2;
		Double cociente = Double.valueOf(num1) / Double.valueOf(num2);
		System.out.println("La suma es: " + suma);
		System.out.println("El cociente es: " + cociente);
	}

	public static void main(String[] args) {
		sumaYCociente(5, 10);
	}
}
