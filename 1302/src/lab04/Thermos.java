package lab04;

public class Thermos extends WaterBottle {
	public Thermos() {
		super(4.0, 0.9);
	}

	public Thermos(double height, double radius) {
		super(height, radius);

	}

//	getInfo() method
	@Override
	public String getInfo() {
		return String.format(super.getInfo() + " and is appropriate for LunchBox instances");
	}

}