package lab05;

public class WaterBottle {
	private double height, radius;
	private String color;
	private static double largestInitialVolume;
	
	public WaterBottle() {
		this(12, 2);
	}
	
	public WaterBottle(double height, double radius) {
		setHeight(height);
		setRadius(radius);
		setColor("green");
		checkInitialVolume(); 
	}
	
	public double getVolume() {
		return Math.PI * getRadius() * getRadius() * getHeight();
	}
	
	// TODO:  Create an equals() method as described, add @Override directive
	@Override
	public boolean equals(Object o) {
		if (o instanceof WaterBottle) {
			return radius == ((WaterBottle)o).radius;
		} else {
			return false;
		}
		
	}
	
	
	@Override
	public String toString() {
		return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", getColor(), getHeight(), getRadius(), getVolume());
	}

	// Prob01
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

	// Prob02
	public static double getLargestInitialVolume() {
		return largestInitialVolume;
	}
	
	private void checkInitialVolume() {
		if (this.getVolume() > WaterBottle.getLargestInitialVolume()) {
			largestInitialVolume = this.getVolume();
		}
	}
}
