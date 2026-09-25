package chap11;

import java.util.ArrayList;
import java.util.Collections;

public class ShapeTest {

	public static void main(String[] args) {
		Shape s1 = new Shape();

		Triangle t1 = new Triangle(8, 9, 12);

		Rectangle r1 = new Rectangle(2.0, 6.0);

		// polymorphism stuff / ArrayList stuff
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(s1);
		shapes.add(t1);
		shapes.add(r1);

		double totalArea = 0.0;


		for (int i = 0; i < shapes.size(); i++) {
			totalArea += shapes.get(i).getArea();
			System.out.println(shapes.get(i).toString());
		}

		System.out.printf("Area: %.2f%n", totalArea);
		ArrayList<Double> shapeVol = new ArrayList<Double>();
		
		for (Shape s : shapes) {
			shapeVol.add(s.getArea());
		}
		
		System.out.printf("Max Area: %.2f%n", Collections.max(shapeVol));
		System.out.printf("Min Area: %.2f", Collections.min(shapeVol));

	}

}

class Shape {
	private int numOfSides;

	public Shape() {
		this(0);
	}

	public Shape(int numOfSides) {
		setNumOfSides(numOfSides);
	}

	public int getNumOfSides() {
		return numOfSides;
	}

	public void setNumOfSides(int numOfSides) {
		this.numOfSides = numOfSides;
	}

	public double getArea() {
		return 0;
	}

	@Override
	public String toString() {
		return String.format("""
				Number of Sides: %d
				""".formatted(getNumOfSides()));
	}
}

class Rectangle extends Shape {
	// length, width
	private double length, width;

	public Rectangle() {
		setNumOfSides(4);
		setLength(1.0);
		setWidth(1.0);
	}

	public Rectangle(double length, double width) {
		this();
		setLength(length);
		setWidth(width);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	// getArea(), getPerim()

	@Override
	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return length + length + width + width;
	}

	@Override
	public String toString() {
		return String.format("""
				%sLength: %.2f
				Width: %.2f
				""".formatted(super.toString(), getLength(), getWidth()));
	}

}

class Triangle extends Shape {
	private double sideA, sideB, sideC;

	public Triangle() {
		setNumOfSides(3);
		setSideA(1.0);
		setSideB(1.0);
		setSideC(1.0);
	}

	public Triangle(double sideA, double sideB, double sideC) {
		this();
		setSideA(sideA);
		setSideB(sideB);
		setSideC(sideC);
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double getSemiPerimeter() {
		return (getSideA() + getSideB() + getSideC()) / 2;
	}

	@Override
	public double getArea() {
		return Math.sqrt(getSemiPerimeter() * (getSemiPerimeter() - getSideA()) * (getSemiPerimeter() - getSideB())
				* (getSemiPerimeter() - getSideC()));
	}

	@Override
	public String toString() {
		return String.format("""
				%sSide A: %.2f
				Side B: %.2f
				Side C: %.2f
				""".formatted(super.toString(), getSideA(), getSideB(), getSideC()));
	}

}