package lab04;

public class StandardWaterBottle extends WaterBottle {
	
//	default constructor
	public StandardWaterBottle() {
		super();
	}
	
//	convenience constructor
	public StandardWaterBottle(double height, double radius) {
		super(height, radius);
	}
	
//	getInfo() method
	@Override
	public String getInfo() {
		return String.format(super.getInfo() + " and is appropriate for LunchBag instances");
	}
	
	
}