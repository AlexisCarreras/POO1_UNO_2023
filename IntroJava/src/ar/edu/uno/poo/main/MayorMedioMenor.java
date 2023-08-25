package ar.edu.uno.poo.main;

public class MayorMedioMenor {
	public static void mayorMedioMenor(int num1, int num2, int num3) {
		if ((num1 != num2) && (num1 != num3) && (num2 != num3)) {
			if (num1 > num2) {
				if (num1 > num3) {
					System.out.println(num2 + " Es el número menor");
					System.out.println(num3 + " Es el número medio");
					System.out.println(num1 + " Es el número mayor");
				} else {
					System.out.println(num2 + " Es el número menor");
					System.out.println(num1 + " Es el número medio");
					System.out.println(num3 + " Es el número mayor");
				}
			} else if (num2 > num3) {
				System.out.println(num1 + " Es el número menor");
				System.out.println(num3 + " Es el número medio");
				System.out.println(num2 + " Es el número mayor");
			} else {
				System.out.println(num1 + " Es el número menor");
				System.out.println(num2 + " Es el número medio");
				System.out.println(num3 + " Es el número mayor");
			}
		} else {
			System.out.println("Los 3 números ingresados deben ser diferentes.");
		}
	}

	public static void main(String[] args) {
		mayorMedioMenor(163, 354, 1199);
	}
}
