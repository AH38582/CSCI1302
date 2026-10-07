package chap12;

public class DivideByZero {
	public static void main(String[] args) {
		try {
			System.out.println(divide(3, 0));

		} catch (ArithmeticException e) {
			System.out.println("Divide by zero was attempted");
		}

	}

	public static int divide(int num1, int num2) {
		int result = num1 / num2;
		return result;

	}

}
