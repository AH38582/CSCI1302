package lab02;

public class WaterBottle {
	private double height, radius;
	private String color;
	private static double largestInitialVolume;

	public WaterBottle() {
		this(12.0, 2.0);
	}

	public WaterBottle(double height, double radius) {
		setHeight(height);
		setRadius(radius);
		this.color = "green";
		checkInitialVolume();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = (height <= 0.0) ? 12.0 : height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = (radius <= 0.0) ? 2.0 : radius;
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

	public String getInfo() {
		return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", color, height, radius,
				getVolume());
	}

	public static double getLargestInitialVolume() {
		return WaterBottle.largestInitialVolume;
	}

	public void checkInitialVolume() {
		if (getVolume() > WaterBottle.largestInitialVolume) {
			WaterBottle.largestInitialVolume = getVolume();
		}
	}
}