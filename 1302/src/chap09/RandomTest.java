package chap09;

public class RandomTest {

	public static void main(String[] args) {
		java.util.Random generate1 = new java.util.Random(1);
		for (int i = 0; i < 10; i++) {
			System.out.print(generate1.nextInt(10) + " ");
		}

		System.out.println();

		java.util.Random generate2 = new java.util.Random(1);
		for (int i = 0; i < 10; i++) {
			System.out.print(generate2.nextInt(10) + " ");
		}

		System.out.println();

		java.util.Random generate3 = new java.util.Random(3);
		for (int i = 0; i < 10; i++) {
			System.out.print(generate3.nextInt(10) + " ");
		}
		
		System.out.println();

		java.util.Random generate4 = new java.util.Random(1000);
		for (int i = 0; i < 10; i++) {
			System.out.print(generate4.nextInt(100) + " ");
		}
	}

}