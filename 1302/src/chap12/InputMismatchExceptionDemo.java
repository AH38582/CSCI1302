package chap12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean validInput = true;
		System.out.print("Enter an integer: ");

		do {
			try {
				int num = sc.nextInt();
				System.out.printf("%nYour integer is: %d", num);
				validInput = false;
			} catch (InputMismatchException e) {
				System.out.printf("%nInput must be an integer. Try again.%n");
				System.out.print("Enter an integer: ");
				sc.nextLine();
			}

		} while (validInput);
	}

}
