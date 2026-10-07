package chap12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {
		File file = new File("src/chap12/scores");

		try (Scanner input = new Scanner(file)) {
			while (input.hasNext()) {
				String firstName = input.next();
				String middleName = input.next();
				String lastName = input.next();
				int score = input.nextInt();
				System.out.printf("%s %s %s: %d%n", firstName, middleName, lastName, score);
			}
		} catch (FileNotFoundException e) {
			System.out.println("oopsie file not found");
		}

	}

}
