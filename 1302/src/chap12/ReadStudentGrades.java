package chap12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadStudentGrades {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();

		File inFile = new File("src/chap12/studentGradesFinal");
		File outFile = new File("src/chap12/studentGradesFinalUpdated");
		System.out.println(inFile.exists());

		try (Scanner input = new Scanner(inFile)) {

			while (input.hasNext()) {
				String firstName = input.next();
				String lastName = input.next();
				int age = input.nextInt();
				double numericGrade = input.nextDouble();
				char letterGrade = input.next().charAt(0);

				Student student = new Student(firstName, lastName, age, numericGrade);
				student.setLetterGrade(letterGrade);
				list.add(student);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		for (Student s : list) {
			System.out.println(s);
		}

		try (PrintWriter output = new PrintWriter(outFile)) {
			for (Student student : list) {
				output.println(student);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
