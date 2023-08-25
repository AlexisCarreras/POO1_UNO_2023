package ar.edu.uno.poo.main;

public class Punto {

//	Atributos del objeto: se recomienda que sean PRIVADOS para no violar el encapsulamiento
	private int x;
	private int y;
//	STATIC es para declarar un atributo o metodo de la clase
	private static int cant;
//	Manera de crear una constante, al ser FINAL hace que sea constante, que su valor no se pueda modificar
	public static final Punto PUNTO_AL_ORIGEN = new Punto(0);

//	Contructor: Inicializar los atributos del objeto. Podemos tener varios
	public Punto() {
		x = 2;
		y = 2;
	}

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
		cant++;
	}

	public Punto(int xy) {
		this(xy, xy);
	}

	// Métodos GETTERS Y SETTERS: Get es para obtener datos, y Set es para asignar o setear valores.
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static int getCant() {
		return cant;
	}

	public double distanciaEntreDosPuntos(int x, int y) {
		return distanciaEntreDosPuntos(new Punto(x, y));
	}

	public double distanciaEntreDosPuntos(Punto p) {
		return Math.hypot(this.x - p.x, this.y - p.y);
	}

//	Sobreescribir el metodo toString
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

//	Uso de ENUM Cuadrante
	public Cuadrante getCuadrante() {
		if (x > 0 && y > 0)
			return Cuadrante.I;
		if (x > 0 && y < 0)
			return Cuadrante.IV;
		if (x < 0 && y > 0)
			return Cuadrante.II;
		if (x < 0 && y < 0)
			return Cuadrante.III;

		return Cuadrante.SIN_CUADRANTE;
	}

}
