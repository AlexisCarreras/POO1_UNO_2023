package ar.edu.uno.poo.main;

public class FormatoFecha {
	public static void formatoFecha(int fecha) {
		String parserFecha = String.valueOf(fecha);

		String dia = parserFecha.substring(6, 8);
		String mes = parserFecha.substring(4, 6);
		String año = parserFecha.substring(0, 4);

		System.out.println("Día: " + dia);
		System.out.println("Mes: " + mes);
		System.out.println("Año: " + año);
	}

	public static void main(String[] args) {
		formatoFecha(19970124);
	}
}
