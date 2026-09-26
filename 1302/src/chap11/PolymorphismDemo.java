package chap11;

public class PolymorphismDemo {

	public static void main(String[] args) {
		printObject(new GradStudent());
		printObject(new Student());
		printObject(new Person());
		printObject(new Object());

	}
	public static void printObject(Object x) {
		System.out.println(x);
	}
	

}

class Person extends Object {
	@Override
	public String toString() {
		return "Person";
	}
}

class Student extends Person {
	@Override
	public String toString() {
		return "Student";
	}
}

class GradStudent extends Student {

}