package exception_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExceptionDemo {
	// Unchecked Exception handled using try-catch, checked exception handled
	// using throws
	public static void main(String[] args) throws IOException {// Checked
																// Exception
		try {
			int a, b;
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter A :");
			a = Integer.parseInt(in.readLine());
			System.out.println("Enter B :");
			b = Integer.parseInt(in.readLine());
			System.out.println("Result : " + (a + b));
		} catch (NumberFormatException ex) { // Unchecked Exception
			System.out.println(ex.getMessage() + " is not a numeric value.");
		}
	}
}

/*
Enter A :
23
Enter B :
b
For input string: "b" is not a numeric value.
 */
