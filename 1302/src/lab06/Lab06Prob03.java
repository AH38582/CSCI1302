package lab06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab06Prob03 {

	public static void main(String[] args) {
		File inFile = new File("src/lab06/pricelist");
		File outFile = new File("src/lab06/pricelist-lab06");

		try (PrintWriter output = new PrintWriter(outFile)) {
			Scanner sc = new Scanner(inFile);

			while (sc.hasNext()) {
				double price = sc.nextDouble();
				if (price < 50) {
					output.printf("%.2f%n", price * 1.0625);

				} else if (price >= 50 && price <= 100) {
					output.printf("%.2f%n", price * 1.125);

				} else if (price > 100) {
					output.printf("%.2f%n", price * 1.25);
				}

			}
			System.out.println("Complete");

		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}

	}

}
