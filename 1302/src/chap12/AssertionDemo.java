package chap12;

public class AssertionDemo {

	public static void main(String[] args) {
		int num = 2;
		
		assert num >= 10 : "Number passed does not meet condition: " + num;
		
		System.out.println("Passed");
		

	}

}
