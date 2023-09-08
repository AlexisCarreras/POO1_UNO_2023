package main;

public class Elipse extends Figura {

	private double radioMayor;
	private double radioMenor;

	public Elipse(double x, double y, double radioMayor, double radioMenor) {
		super(x, y);
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}

	@Override
	public double getArea() {
		return Math.PI * this.radioMayor * this.radioMenor;
	}

}
 