package lab05;

public class StandardWaterBottle extends WaterBottle {
	public StandardWaterBottle() {
		super();
	}
	
	public StandardWaterBottle(double height, double radius) {
		super(height, radius);
	}
	
	@Override
	public String toString() {
		return super.toString() + " and is appropriate for LunchBag instances";
	}
}
