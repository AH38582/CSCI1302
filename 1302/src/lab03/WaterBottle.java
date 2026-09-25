package lab03;

public class WaterBottle {
	private double height, radius;
	private String color = "";
	private static double largestInitialVolume;
	
	public WaterBottle() {
		setHeight(12);
		setRadius(2);
		setColor("green");
		checkInitialVolume();
	}
	
	public WaterBottle(double height, double radius) {
		setHeight(height);
		setRadius(radius);
		setColor("green");
		checkInitialVolume();
	}
	
	public double getVolume() {
		return Math.PI * radius * radius * height;
	}
	
	public String getInfo() {
		return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", color, height, radius, getVolume());
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		// Height must be greater than zero
		this.height = height > 0 ? height : 12;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		// Radius must be greater than zero
		this.radius = radius > 0 ? radius : 2;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public static double getLargestInitialVolume() {
		return WaterBottle.largestInitialVolume;
	}
	
	private void checkInitialVolume() {
		if (this.getVolume() > WaterBottle.getLargestInitialVolume()) {
			WaterBottle.largestInitialVolume = this.getVolume();
		}
	}
}