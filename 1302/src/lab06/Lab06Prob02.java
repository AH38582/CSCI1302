package lab06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab06Prob02 {

	public static void main(String[] args) {
		File file = new File("src/lab06/pricelist");

		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNext()) {
				double price = sc.nextDouble();
				System.out.printf("$%.2f%n", price);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}

	}

}
