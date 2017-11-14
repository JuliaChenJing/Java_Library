package exception_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class TypicalException2 {
	static void printFile(File f) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			System.out.println(reader.lines().collect(Collectors.joining(", ")));
			reader.close();
		} catch(IOException e) {
			System.out.println("Error printing file: " + e.getMessage());
			
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String userDir = System.getProperty("user.dir");
		File f = new File("text");
		printFile(f);
	}
}
