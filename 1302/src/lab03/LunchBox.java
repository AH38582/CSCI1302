package lab03;

public class LunchBox {
	private double length, width, height;
	private WaterBottle waterBottle;

	// No arg constuctor
	public LunchBox() {
		setLength(10.6);
		setWidth(7.7);
		setHeight(6.33);
		setWaterBottle(new WaterBottle(4.0, 0.9));
	}

	// convenience constructor with all 4 data members
	public LunchBox(double length, double width, double height, WaterBottle waterBottle) {
		this();
		this.setLength(length);
		this.setWidth(width);
		this.setHeight(height);
		this.setWaterBottle(waterBottle);
	}

	// Create all gets and set. with error checking
	public double getLength() {
		return length;

	}

	public void setLength(double length) {
		this.length = (length > 0) ? length : 10.6;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = (width > 0) ? width : 7.7;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = (height > 0) ? height : 6.33;
	}

	public WaterBottle getWaterBottle() {
		return waterBottle;
	}

	public void setWaterBottle(WaterBottle waterBottle) {
		this.waterBottle = (waterBottle.getHeight() <= getHeight() - 2 && waterBottle.getRadius() * 2 <= getWidth() * .75) ? waterBottle : new WaterBottle(4.0, 0.9);
		
		if (waterBottle.getHeight() <= getHeight() - 2 && waterBottle.getRadius() * 2 <= getWidth() * .75) {
			System.out.printf("You will be given a default WaterBottle");
		}
	}
}
