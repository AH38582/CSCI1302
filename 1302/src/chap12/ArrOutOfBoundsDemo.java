package chap12;

public class ArrOutOfBoundsDemo {

	public static void main(String[] args) {
		int[] arr = new int[10];

		try {
			for (int i = 0; i < 11; i++) {
				arr[i] = 1;
			}

			for (int i = 0; i < 11; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bounds!");
		}
	}

}
