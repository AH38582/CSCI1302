package chap12;

import java.lang.classfile.TypeAnnotation.ThrowsTarget;

// changing setRadius()

public class CircleTest {

	public static void main(String[] args) {
		try {
			Circle c1 = new Circle();
			Circle c2 = new Circle(-27.0, null);
			Circle c3 = new Circle(27.0, "Pink");

			Circle[] circles = { c1, c2, c3 };

			Circle.printCircleArray(circles);
			c1.printCircle(c1);
			c1.printAreas(c3, 7);

		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}

	}

}

class Circle {
	// Data members
	private double radius;
	private String color;
	private static int numCircles;

	// Default constructor
	public Circle() {
		this(1.0, "");
	}

	// Convenience constructor
	public Circle(double radius, String color) {
		setRadius(radius);
		setColor(color);
		Circle.numCircles++;
	}

	// Getters and setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) throws IllegalArgumentException {

		if (radius >= 0) {
			this.radius = radius;
		} else {
			throw new java.lang.IllegalArgumentException("Radius cannot be negative!");
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = (color == null || color.isEmpty()) ? "blue" : color;
	}

	// static method

	public static int getNumCircles() {
		return Circle.numCircles;
	}

	// regular methods

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getDiameter() {
		return radius * 2.0;
	}

	public double getPerimeter() {
		return 2.0 * Math.PI * radius;
	}

	public static void printCircleArray(Circle[] c) {
		System.out.printf("Total number of circles: %d%n%n", Circle.getNumCircles());
		for (int i = 0; i < c.length; i++) {
			System.out.printf(
					"New circle created!%n%nCircle %d:%ncolor: %s%nRadius: %f%nArea: %f%nDiameter: %f%nPerimeter: %f%n%n",
					i + 1, c[i].getColor(), c[i].getRadius(), c[i].getArea(), c[i].getDiameter(), c[i].getPerimeter());
		}

	}

	public void printCircle(Circle c) {
		System.out.printf("New circle created!%n%nColor: %s%nRadius: %f%nArea: %f%nDiameter: %f%nPerimeter: %f%n%n",
				c.getColor(), c.getRadius(), c.getArea(), c.getDiameter(), c.getPerimeter());

	}

	public static void printAreas(Circle c, int times) {
		System.out.println("Radius\t\tArea");
		while (times >= 1) {
			System.out.println(c.getRadius() + "\t\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}

}
