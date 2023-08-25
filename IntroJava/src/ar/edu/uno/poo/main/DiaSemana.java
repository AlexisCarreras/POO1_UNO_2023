package ar.edu.uno.poo.main;

public class DiaSemana {
	public static void diaSemana(int dia) {
		switch (dia) {
		case 1: {
			System.out.println("Lunes");
			break;
		}
		case 2: {
			System.out.println("Martes");
			break;
		}
		case 3: {
			System.out.println("Miércoles");
			break;
		}
		case 4: {
			System.out.println("Jueves");
			break;
		}
		case 5: {
			System.out.println("Viernes");
			break;
		}
		case 6: {
			System.out.println("Sábado");
			break;
		}
		case 7: {
			System.out.println("Domingo");
			break;
		}
		default:
			System.out.println("El número de la semana ingresado, debe ser entre 1 y 7.");
		}
	}

	public static void main(String[] args) {
		diaSemana(2);
	}
}
