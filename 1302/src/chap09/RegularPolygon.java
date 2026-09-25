package chap09;

public class RegularPolygon {
	private int n; // number of sides
	private double side, x, y;

	public RegularPolygon() {
		this(3, 1, 0, 0);
	}

	public RegularPolygon(int n, double side) {
		setN(n);
		setSide(side);
	}

	public RegularPolygon(int n, double side, double x, double y) {
		setN(n);
		setSide(side);
		setX(x);
		setY(y);
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getPerimeter() {
		return side * n;
	}

	public double getArea() {
		return (n * side * side) / 4 * Math.tan(Math.PI / n);
	}

}