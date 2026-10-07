package chap12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProcessingPriceList {

	public static void main(String[] args) {
		File inFile = new File("src/chap12/pricelist"); // already existing file
		File outFile = new File("src/chap12/pricelist-new"); // blank file

		try (Scanner input = new Scanner(inFile); PrintWriter output = new PrintWriter(outFile)) {
			double currPrice = 0.0;
			while (input.hasNext()) {
				currPrice = input.nextDouble();
				System.out.printf("$%.2f%n", currPrice); // prints pricelist.txt into console with $ included
				output.printf("$%.2f%n", currPrice * 1.25); // writes currPrice * 1.25 into new pricelist-new.txt file
			}
			System.out.println("\npricelist.txt should print and pricelist-new.txt should be updated:)");
		} catch (FileNotFoundException e) {
			System.out.println("oopsie file not found");
		}
	}

}
