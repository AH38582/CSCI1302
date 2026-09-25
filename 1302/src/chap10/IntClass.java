package chap10;

public class IntClass {

	public static void main(String[] args) {
		Integer x1 = new Integer(56);
		Integer x2 = new Integer(3);
		
		Integer integers[] = { x1, x2 };
		
		System.out.println(x1.parseInt("56") == x2.parseInt("3"));
		
	}

}