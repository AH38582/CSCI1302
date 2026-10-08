package chap12;

public class Student {
	private String firstName, lastName;
	private int age;
	private double numericGrade;
	private char letterGrade;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, int age, double numericGrade) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setNumericGrade(numericGrade);
		
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the letterGrade
	 */
	public char getLetterGrade() {
		return letterGrade;
	}
	/**
	 * @param letterGrade the letterGrade to set
	 */
	public void setLetterGrade(char letterGrade) {
		this.letterGrade = letterGrade;
	}
	/**
	 * @return the numericGrade
	 */
	public double getNumericGrade() {
		return numericGrade;
	}

	/**
	 * @param numericGrade the numericGrade to set
	 */
	public void setNumericGrade(double numericGrade) {
		this.numericGrade = numericGrade;
	}

	@Override
	public String toString() {
		return String.format("%s %s %d %.2f", firstName, lastName, age, numericGrade);
	}
}
