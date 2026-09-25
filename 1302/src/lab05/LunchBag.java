package lab05;


public class LunchBag {
	private double length, width, height;
	private WaterBottle waterBottle;

	// Default Constructor
	public LunchBag() {
		setLength(11.2);
		setWidth(6.1);
		setHeight(7.9);
		setWaterBottle(new StandardWaterBottle());
	}

	// Convenience Constructor
	public LunchBag(double length, double width, double height, WaterBottle waterBottle) {
		setLength(length);
		setWidth(width);
		setHeight(height);
		setWaterBottle(waterBottle);
	}
	
	public boolean isValid(WaterBottle waterBottle) {
		if (waterBottle instanceof StandardWaterBottle && waterBottle.getRadius() * 2 > 0 && waterBottle.getRadius() * 2 <= 4) {
			return true;
		} else {
			System.out.println("WaterBottle is not valid");
			return false;
		}
	}

	// Accessors and Mutatotrs
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

	public WaterBottle getWaterBottle() {
		return waterBottle;
	}

	public void setWaterBottle(WaterBottle waterBottle) {
		// WaterBottle diameter must be greater than 0 and less than or equal to 4
		if (isValid(waterBottle)) {
			this.waterBottle = waterBottle;
		} else {
			this.waterBottle = new StandardWaterBottle();
		}
	}
}
