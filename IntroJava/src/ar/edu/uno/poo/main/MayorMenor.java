package ar.edu.uno.poo.main;

public class MayorMenor {
	public static void mayorMenor(int num1, int num2) {
		if (num1 != num2) {
			if (num1 >= num2)
				System.out.println(num1 + " Es Mayor que " + num2);
			else
				System.out.println(num2 + " Es Mayor que " + num1);
		} else {
			System.out.println("Los números ingresados deben ser distintos.");
		}
	}

	public static void main(String[] args) {
		mayorMenor(40, 10);
	}
}
