package lab05;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WaterBottleTest {
	public static void main(String[] args) {

		ArrayList<WaterBottle> wb = new ArrayList<WaterBottle>();

		wb.add(new WaterBottle());
		wb.add(new StandardWaterBottle());
		wb.add(new Thermos());
		wb.add(new StandardWaterBottle(10, 0.7));
		wb.add(new Thermos(5, 0.5));

		double totalVol = 0;
		System.out.println("Number of bottles: " + wb.size());
		for (int i = 0; i < wb.size(); i++) {
			System.out.println(wb.get(i).toString());
			totalVol += wb.get(i).getVolume();
		}
		
		ArrayList<Double> wbVol = new ArrayList<Double>();
		
		for (WaterBottle bottle : wb) {
			wbVol.add(bottle.getVolume());
		}

		System.out.printf("Total volume: %.4f%n", totalVol);
		System.out.printf("Max volume: %.4f%n", java.util.Collections.max(wbVol));
		System.out.printf("Min volume: %.4f%n", java.util.Collections.min(wbVol));

	}
}