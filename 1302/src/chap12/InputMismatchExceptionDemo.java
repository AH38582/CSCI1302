package chap12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean valid = true;

		do {
			try {
				System.out.print("Enter an integer: ");
				int input = sc.nextInt();

				System.out.printf("Entered: %d", input);
				valid = false;
			} catch (InputMismatchException e) {
				System.out.println("Not an integer, try again!");
				sc.nextLine();
			}
		} while (valid);
	}

}
