package lab04;

public class WaterBottle {
	private double height, radius;
	private String color;
	private static double largestInitialVolume;
	
	// Default no-arg constructor
	public WaterBottle() {
		this(12, 2);
	}
	
	// Convenience constructor
	public WaterBottle(double height, double radius) {
		setHeight(height);
		setRadius(radius);
		setColor("green");
		checkInitialVolume(); // make sure to update volume
	}
	
	// Volume of WaterBottle
	public double getVolume() {
		return Math.PI * getRadius() * getRadius() * getHeight();
	}
	
	// Textual description of WaterBottles
	public String getInfo() {
		return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", getColor(), getHeight(), getRadius(), getVolume());
	}

	// Static accessor
	public static double getLargestInitialVolume() {
		return largestInitialVolume;
	}
	
	// check static member and update if needed
	private void checkInitialVolume() {
		if (this.getVolume() > WaterBottle.getLargestInitialVolume()) {
			WaterBottle.largestInitialVolume = this.getVolume();
		}
	}

	// Accessors/Mutators below
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

	
}