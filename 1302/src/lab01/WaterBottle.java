package lab01;

public class WaterBottle {
	private double height, radius;
	private String color;
	
	public WaterBottle() {
		this("green");
	}
	
	public WaterBottle(String color) {
		setColor(color);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getVolume() {
		return Math.PI * radius * radius * height;
	}

}