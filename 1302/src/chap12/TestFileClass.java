package chap12;

import java.io.File;

public class TestFileClass {

	public static void main(String[] args) {
		File f = new File("src/chap12/TestFile");
		System.out.println(f.exists());

	}

}
