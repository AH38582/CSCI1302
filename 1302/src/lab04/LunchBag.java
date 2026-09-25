package lab04;

public class LunchBag {
	private double length, width, height;
	private WaterBottle waterBottle;

	// Default Constructor
	public LunchBag() {
		setLength(11.2);
		setWidth(6.1);
		setHeight(7.9);
		// TODO:  Update this instantiation to use correct class - Prob 03
		setWaterBottle(new StandardWaterBottle());
	}

	// Convenience Constructor
	public LunchBag(double length, double width, double height, WaterBottle waterBottle) {
		setLength(length);
		setWidth(width);
		setHeight(height);
		setWaterBottle(waterBottle);
	}

	// Accessors and Mutators below
	public WaterBottle getWaterBottle() {
		return waterBottle;
	}

	public boolean isValid(WaterBottle waterBottle) {
		if (waterBottle instanceof StandardWaterBottle && waterBottle.getRadius() * 2 <= 4 && waterBottle.getRadius() > 0) {
			return true;
		} else {
			System.out.println("Conditions are not met.");
			return false;
		}
	}
	public void setWaterBottle(WaterBottle waterBottle) {
		// WaterBottle diameter must be greater than 0 and less than or equal to 4
		if (!isValid(waterBottle)) {
			this.waterBottle = new StandardWaterBottle();
		} else {
			this.waterBottle = waterBottle;
		}
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length > 0 ? length : 11.2;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width > 0 ? width : 6.1;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height > 0 ? height : 7.9;
	}

}

