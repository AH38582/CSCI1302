package chap12;

import java.util.InputMismatchException;

public class MultiTryCatch {

	public static void main(String[] args) {
		try {
			int[] numbers = { 1, 2, 3 };

			// may throw ArithmeticException
			int result = 10 / 0;

			// may throw ArrayIndexOutOfBoundsException
			System.out.println(numbers[10]);

		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero! " + e.getMessage());

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds!");

		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
		}

	}

}
