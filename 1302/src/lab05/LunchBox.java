package lab05;

public class LunchBox {
	private double length, width, height;
	private WaterBottle waterBottle;
	
	// Default Constructor
	public LunchBox() {
		setLength(10.6);
		setWidth(7.7);
		setHeight(6.33);
		setWaterBottle(new Thermos());
	}
	
	// Convenience Constructor
	public LunchBox(double length, double width, double height, WaterBottle waterBottle) {
		setLength(length);
		setWidth(width);
		setHeight(height);
		setWaterBottle(waterBottle);
	}
	
	public boolean isValid(WaterBottle waterBottle) {
		if (waterBottle instanceof Thermos && getHeight() - 2 > waterBottle.getHeight() && getWidth() * 0.25 >= waterBottle.getRadius() * 2) {
			return true;
		} else {
			System.out.println("WaterBottle is not valid");
			return false;
		}
	}

	// Accessors and Mutators
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length > 0 ? length : 10.6;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width > 0 ? width : 7.7;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height > 0 ? height : 6.33;
	}

	public WaterBottle getWaterBottle() {
		return waterBottle;
	}

	public void setWaterBottle(WaterBottle waterBottle) { 
		// WaterBottle height must be at least 2 shorter than LunchBox height and 
		// WaterBottle diameter must be less than or equal to 25% of LunchBox width
		if (isValid(waterBottle)) {
			this.waterBottle = waterBottle;
		} else {
			this.waterBottle = new Thermos();
		}
	}
}
