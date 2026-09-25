package lab04;

public class WaterBottleTest {
	public static void main(String[] args) {
		LunchBox lb1 = new LunchBox();
		LunchBag lb2 = new LunchBag();
		
		// Output information about each WaterBotttle
		System.out.println(lb1.getWaterBottle().getInfo());
		System.out.println(lb2.getWaterBottle().getInfo());
		
		StandardWaterBottle s1 = new StandardWaterBottle();
		System.out.println(s1.getInfo());
		
		Thermos t1 = new Thermos();
		System.out.println(t1.getInfo());
	}
}