package lab03;

public class LunchBag {
	private double width, height, length;
	private WaterBottle waterBottle;

	LunchBag() {
		this(11.2, 6.1, 7.9, new WaterBottle());
	}

	LunchBag(double length, double width, double height, WaterBottle waterBottle) {
		setLength(length);
		setWidth(width);
		setHeight(height);
		setWaterBottle(waterBottle);
	}


	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = (width < 0) ? 6.1 : width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = (height < 0) ? 7.9 : height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = (length < 0) ? 11.2 : length;
	}

	public WaterBottle getWaterBottle() {
		return waterBottle;
	}

	public void setWaterBottle(WaterBottle waterBottle) {
		this.waterBottle = (waterBottle.getRadius() * 2 <= 4 && waterBottle.getRadius() > 0) ? waterBottle : new WaterBottle();
	}
}