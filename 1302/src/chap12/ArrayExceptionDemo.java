package chap12;

public class ArrayExceptionDemo {

	public static void main(String[] args) {
		int[] list = new int[10];
		try {
			for (int i = 0; i < 20; i++) {
				System.out.println(list[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bounds!");
			// e.printStackTrace(); can be used to find exact exception object
		}

	}

}
