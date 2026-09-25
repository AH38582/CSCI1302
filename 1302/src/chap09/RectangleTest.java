package chap09;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);

		System.out.printf("Rectangle 1%nWidth: %.2f%nHeight: %.2f%nArea: %.2f%nPerimeter: %.2f", r1.getWidth(),
				r1.getLength(), r1.getArea(), r1.getPerimeter());
		System.out.printf("%n%nRectangle 2%nWidth: %.2f%nHeight: %.2f%nArea: %.2f%nPerimeter: %.2f", r2.getWidth(),
				r2.getLength(), r2.getArea(), r2.getPerimeter());
	}

}

class Rectangle {
	private double width, length;
	private static int numOfRectangles;

	public Rectangle() {
		this(1.0, 1.0);
	}

	public Rectangle(double width, double length) {
		setWidth(width);
		setLength(length);
		Rectangle.numOfRectangles++;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return 2 * (length + width);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public static int getNumOfRectangles() {
		return Rectangle.numOfRectangles;
	}

}