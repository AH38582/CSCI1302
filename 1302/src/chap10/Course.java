package chap10;

public class Course {
	// data members
	private String courseName, students[];
	private int numberOfStudents;
	
	// default constructor
	Course() {
		
	}
	
	// convenience constructor
	Course(String courseName) {
		this.courseName = courseName;
		
	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	// addStudent[]
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	// dropStudent[]
	public void dropStudent(String student) {
		
	}
	
	

}