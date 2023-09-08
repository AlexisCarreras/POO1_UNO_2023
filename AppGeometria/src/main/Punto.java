package main;

public class Punto {

	private double x;
	private double y;
	private static int cant;
	public static final Punto PUNTO_AL_ORIGEN = new Punto(0);

	public Punto() {
		x = 2;
		y = 2;
	}

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
		cant++;
	}

	public Punto(int xy) {
		this(xy, xy);
	}

	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static double getCant() {
		return cant;
	}

	public double distanciaEntreDosPuntos(int x, int y) {
		return distanciaEntreDosPuntos(new Punto(x, y));
	}

	public double distanciaEntreDosPuntos(Punto p) {
		return Math.hypot(this.x - p.x, this.y - p.y);
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

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