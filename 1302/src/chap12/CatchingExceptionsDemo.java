package chap12;

public class CatchingExceptionsDemo {

	public static void main(String[] args) {
		String s = null;
		int[] arr = new int[10];

		try {
			int length = s.length();
			System.out.printf("Length is %d", length);

			for (int i = 0; i < 11; i++) {
				arr[i] = 1;
			}

			for (int i = 0; i < 11; i++) {
				System.out.println(arr[i]);
			}

			// when uncommented, will print "Error found in code!"
//		} catch (NullPointerException | ArrayIndexOutOfBoundsException e){
//			System.out.println("Error found in code!");

		} catch (Exception e) {
			System.out.println("Exception found!");
		}

	}

}
