package lab01;

public class WaterBottleTest {

	public static void main(String[] args) {
		WaterBottle w1 = new WaterBottle();
		w1.setHeight(12.0);
		w1.setRadius(2.0);
		WaterBottle w2 = new WaterBottle();
		w2.setHeight(9.5);
		w2.setRadius(1.5);
		
		WaterBottle w3 = new WaterBottle("blue");
		w3.setHeight(10.0);
		w3.setRadius(2.5);
		
		WaterBottle waterbBottles[] = { w1, w2, w3 };
		printArray(waterbBottles);
		
		
	}
	
	public static void printArray(WaterBottle wb[]) {
		for (int i = 0; i < wb.length; i++) {
			System.out.printf("A %s water bottle with height %.1f, radius %.1f, and volume %f%n", wb[i].getColor(), wb[i].getHeight(), wb[i].getRadius(), wb[i].getVolume());
		}
	}

}