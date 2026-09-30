package chap12;


public class DivideByZero {

	public static void main(String[] args) {

		int n1 = 4;
		int n2 = 0;
		int n3 = 2;
		
//		System.out.println(quot(n1, n2));
		System.out.println(quot(n1, n3));
	}

	public static int quot(int n1, int n2) {
		if (n2 == 0) {
			throw new ArithmeticException("Cannot divide by zero!");
		}
		return n1 / n2;
	}
}
