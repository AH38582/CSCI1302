package chap12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {

	public static void main(String[] args) {
		File file = new File("src/chap12/scores");

		try (PrintWriter output = new PrintWriter(file)) {
			output.println("John T Smith");
			output.println("90");
			output.println("Eric K Jones");
			output.println(85);

			System.out.println("File should be updated :)");
		} catch (FileNotFoundException e) {
			System.out.println("File is not found!");
		}

	}

}
