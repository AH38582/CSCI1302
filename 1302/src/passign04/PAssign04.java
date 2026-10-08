package passign04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PAssign04 {

	public static void main(String[] args) {
		// Create Scanner
		Scanner sc = new Scanner(System.in);
		double value = 0;
		double sum = 0;
		double avg;
		double min;
		double max;

		// Create ArrayList
		ArrayList<Double> list = new ArrayList<Double>();

		// do while loop and try-catch block
		do {
			// Prompt user for double value
			System.out.print("Enter a double value (-999 to exit): ");

			try {
				value = sc.nextDouble();

				// ensures sentinel value is not added in ArrayList
				if (value != -999) {

					if (list.contains(value)) {
						throw new ArrayStoreException();
					}

					list.add(value);
				}

			} catch (InputMismatchException e) {
				System.out.println("That is not a valid double value.");
				sc.next();

			} catch (ArrayStoreException e) {
				System.out.println("Duplicate value");

			} catch (Exception e) {

			}

		} while (value != -999);

		// informs user that no values were processed
		if (list.isEmpty()) {
			System.out.println("There were no values to process");
			
		} else {

			// Calculates sum
			for (Double d : list) {
				sum += d;
			}

			avg = sum / list.size();
			min = Collections.min(list);
			max = Collections.max(list);

			System.out.println(list.toString());
			System.out.printf("Average: %.2f%n", avg);
			System.out.printf("Max: %.2f%n", max);
			System.out.printf("Min: %.2f%n", min);
		}

	}

}
